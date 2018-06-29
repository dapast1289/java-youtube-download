package com.javayoutubedownload.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javayoutubedownload.bean.YoutubeUrl;

@RestController
@RequestMapping("youtu")
public class ParserController {
	
	@RequestMapping(value = "parserUrl", method = RequestMethod.GET)
    public ArrayList<YoutubeUrl> parser(String url) {
		ArrayList<YoutubeUrl> res = new ArrayList<YoutubeUrl>();
		YoutubeUrl a = new YoutubeUrl();
		a.setName("4800P");
		a.setUrl(url);
		res.add(a);
        return res;
    }
	
}
