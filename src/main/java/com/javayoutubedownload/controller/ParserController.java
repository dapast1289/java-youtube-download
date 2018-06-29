package com.javayoutubedownload.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("download")
public class ParserController {
	
	@RequestMapping("youtube")
    public String index(String url) {
        return "Hello " + url;
    }
	
}
