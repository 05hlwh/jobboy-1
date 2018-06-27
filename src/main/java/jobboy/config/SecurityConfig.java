package jobboy.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.csrf.CsrfFilter;
import org.springframework.web.filter.CharacterEncodingFilter;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    DataSource datasource;

    @Bean
    public CharacterEncodingFilter characterEncodingFilter() {
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        filter.setEncoding("UTF-8");
        filter.setForceEncoding(true);
        return filter;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth
                .jdbcAuthentication()
                .dataSource(datasource)
                .usersByUsernameQuery(
                        "select name,passwd,enable from usert where name=?"
                ).authoritiesByUsernameQuery(
                "select name,role from usert where name=?"
        ).passwordEncoder(new BCryptPasswordEncoder());
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.addFilterBefore(characterEncodingFilter(), CsrfFilter.class);
        http
                .formLogin().loginPage("/login").failureUrl("/login?error=true")
                .and()
                .rememberMe()
                .tokenValiditySeconds(2419200)
                .and()
                .authorizeRequests()
                .antMatchers("/work").authenticated()
                .anyRequest().permitAll()
                .and().requiresChannel().anyRequest().requiresSecure();
    }

}