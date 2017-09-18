package com.diffblue.ping;

import java.lang.String;

public class Ping {
    public String checkPing(String inp) {
        if(inp.equals("ping")) {
            return "pong";
        } else {
            return "ping";
        }
    }
    public String checkPong(String inp) {
        if(inp.equals("pong")) {
            return "ping";
        } else {
            return "pong";
        }
    }
}