package com.diffblue.ping;

public class Ping {
    public String checkPing(String inp) {
        if(inp.equals("ping")) {
            return "pong";
        } else {
            return "ping";
        }
    }
}