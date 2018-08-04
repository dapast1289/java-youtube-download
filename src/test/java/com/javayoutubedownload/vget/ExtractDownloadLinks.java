package com.javayoutubedownload.vget;

import java.net.URL;
import java.util.List;

import com.javayoutubedownload.vget.vhs.YouTubeInfo;
import com.javayoutubedownload.vget.vhs.YouTubeParser;
import com.javayoutubedownload.vget.vhs.YouTubeParser.VideoDownload;

public class ExtractDownloadLinks {

    public static void main(String[] args) {
        try {
            // ex: http://www.youtube.com/watch?v=Nj6PFaDmp6c
            String url = "https://www.youtube.com/watch?v=wrsQBN0eyI0";

            YouTubeInfo info = new YouTubeInfo(new URL(url));

            YouTubeParser parser = new YouTubeParser();

            List<VideoDownload> list = parser.extractLinks(info);

            for (VideoDownload d : list) {
                System.out.println(d.stream + " " + d.url);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
