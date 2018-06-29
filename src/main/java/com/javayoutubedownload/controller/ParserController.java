package com.javayoutubedownload.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javayoutubedownload.bean.YoutubeUrl;

@RestController
@RequestMapping("youtu")
public class ParserController {
	
	@RequestMapping(value = "parserUrl", method = RequestMethod.GET)
    public Map<String, Object> parser(String url) {
		Map<String, Object> res = new HashMap<String, Object>();
		ArrayList<YoutubeUrl> list = new ArrayList<YoutubeUrl>();
		YoutubeUrl a = new YoutubeUrl();
		a.setName("480P");
		a.setUrl(url);
		list.add(a);
		a = new YoutubeUrl();
		a.setUrl(url);
		a.setName("720P");
		list.add(a);
		res.put("success", true);
		res.put("datas", list);
        return res;
    }
	
}
