package jobboy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ReportController {
    @RequestMapping(value = "/report",method = RequestMethod.POST)
    public String dopost(){

        return "success";
    }

    @RequestMapping(value = "/report",method = RequestMethod.GET)
    public String doget(){
        return "report";
    }

}
