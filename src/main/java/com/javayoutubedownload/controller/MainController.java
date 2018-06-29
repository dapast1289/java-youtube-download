package com.javayoutubedownload.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
    @RequestMapping("/")
    public String index(String title, Model model) {
    	model.addAttribute("name", "hello shacom");
        return "index";
    }
    
//    @RequestMapping("/getUser")
//    public List<User> getUser(String url) {
//    	List<User> users = new ArrayList<User>();
//    	User user=new User();
//    	user.setUserName("url: " + url);
//    	user.setPassWord("xxxx");
//    	users.add(user);
//    	users.add(user);
//        return users;
//    }
    
    
}