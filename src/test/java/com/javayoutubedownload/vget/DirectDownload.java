package com.javayoutubedownload.vget;

import java.io.File;
import java.net.URL;

public class DirectDownload {

    public static void main(String[] args) {
        try {
            // ex: http://www.youtube.com/watch?v=Nj6PFaDmp6c
            String url = "https://www.youtube.com/watch?v=KbUf6Pj1yM4&list=PLsrKXZxQSkNNQEzIdA6JjuM5lIBwRQ4wb&index=7";
            // ex: "/Users/axet/Downloads"
            String path = "C:\\Leo";

            VGet v = new VGet(new URL(url), new File(path));

            v.download();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
