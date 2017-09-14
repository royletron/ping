package com.diffblue.ping;

public class Ping {
    public String checkPing(String inp) {
        if(inp == "ping") {
            return "pong";
        } else {
            return "ping";
        }
    }
}