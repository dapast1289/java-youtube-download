package com.javayoutubedownload.controller;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javayoutubedownload.bean.YoutubeUrl;
import com.javayoutubedownload.vget.vhs.YouTubeInfo;
import com.javayoutubedownload.vget.vhs.YouTubeParser;
import com.javayoutubedownload.vget.vhs.YouTubeParser.VideoDownload;

@RestController
@RequestMapping("youtu")
public class ParserController {
	
	@RequestMapping(value = "parserUrl", method = RequestMethod.GET)
    public Map<String, Object> parser(String url) throws MalformedURLException {
		
        YouTubeInfo info = new YouTubeInfo(new URL(url));
        YouTubeParser parser = new YouTubeParser();

        List<VideoDownload> list = parser.extractLinks(info);

        for (VideoDownload d : list) {
            System.out.println(d.stream + ":  " + d.url);
        }
        
		Map<String, Object> res = new HashMap<String, Object>();
		res.put("success", true);
		res.put("datas", list);
        return res;
    }
	
}
