package com.example.zsuzsannapadar.firsteverandroidapp;

/**
 * Created by zsuzsanna.padar on 2017. 05. 26..
 */


public class Message {
    private String username;
    private String text;

    public Message(String username, String text) {
        this.username = username;
        this.text = text;
    }

    public String getUsername() {
        return username;
    }

    public String getText() {
        return text;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setText(String text) {
        this.text = text;
    }
}
