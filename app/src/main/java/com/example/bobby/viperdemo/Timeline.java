package com.example.bobby.viperdemo;

/**
 * Created by bobby on 2/18/16.
 */
public class Timeline {
    private String name;
    private String content;

    public Timeline(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
