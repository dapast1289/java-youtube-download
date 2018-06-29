package com.javayoutubedownload.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javayoutubedownload.domain.User;

@RestController
public class HelloWorldController {
	
    @RequestMapping("/")
    public String index() {
        return "Hello World";
    }
    
    @RequestMapping("/getUser")
    public List<User> getUser(String url) {
    	List<User> users = new ArrayList<User>();
    	User user=new User();
    	user.setUserName("url: " + url);
    	user.setPassWord("xxxx");
    	users.add(user);
    	users.add(user);
        return users;
    }
    
    
}