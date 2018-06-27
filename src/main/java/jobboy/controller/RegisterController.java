package jobboy.controller;

import jobboy.po.Usert;
import jobboy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class RegisterController {
    @Autowired
    UserService userService;
    @RequestMapping(value = "/register",method = POST)
    public String dopost(Usert user){
            String password = user.getPasswd();
            password = new BCryptPasswordEncoder().encode(password);
            user.setPasswd(password);
            user.setEnable(true);
            user.setCredit(Float.valueOf(80));
            user.setEmail(null);
            user.setRole("ROLE_UNAUTH_"+user.getRole());
            System.out.println(user);
            if (userService.registe(user))
                return "index";

        return "error";
    }
    @RequestMapping(value = "/register",method = GET)
    public String doget(){
        return "userInfo1";
    }
}
