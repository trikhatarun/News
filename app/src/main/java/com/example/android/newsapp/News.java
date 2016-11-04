package com.example.android.newsapp;

/**
 * Created by trikh on 25-10-2016.
 */

public class News {

    String mdate_published;
    String mtitle;
    String mUrl;

    public News(String date, String title, String url) {
        mdate_published = date;
        mtitle = title;
        mUrl = url;
    }

    public String getMdate_published() {
        return mdate_published;
    }

    public String getMtitle() {
        return mtitle;
    }

    public String getmUrl() {
        return mUrl;
    }
}
