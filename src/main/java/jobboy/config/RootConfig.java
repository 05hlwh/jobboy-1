package jobboy.config;

import org.apache.commons.dbcp.BasicDataSource;

import org.mybatis.spring.SqlSessionFactoryBean;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;



@Configuration
@ComponentScan(value={"jobboy.*"},
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,value = EnableWebMvc.class)})
@EnableTransactionManagement
public class RootConfig {
    @Bean
    public BasicDataSource dataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost/jobboy?useUnicode=true&characterEncoding=utf8");
        dataSource.setUsername("xzy");
        dataSource.setPassword("573609568");
        return dataSource;
    }


    @Bean(name = "sessionfactory")
    public SqlSessionFactoryBean sqlSessionFactory() throws Exception {

        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        //配置mybatis配置文件
        Resource resource = new ClassPathResource("mybatis-config.xml");
        sessionFactory.setConfigLocation(resource);
        return sessionFactory;
    }

    @Bean
    public MapperScannerConfigurer initMapperScannerConfigurer() {
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        msc.setBasePackage("jobboy/mapper");
        msc.setSqlSessionFactoryBeanName("sessionfactory");
        msc.setAnnotationClass(Repository.class);
        return msc;
    }

    @Bean(name="annotationDrivenTransactionManager")
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource());
        return transactionManager;
    }


}
