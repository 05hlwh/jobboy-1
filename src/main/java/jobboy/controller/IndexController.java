package jobboy.controller;


import jobboy.service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {

    @Autowired
    AnnouncementService announcementService;

    @RequestMapping("/")
    public String doget(Model model){
        return "index";
    }
}
