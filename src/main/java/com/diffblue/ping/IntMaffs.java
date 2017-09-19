package com.diffblue.ping;

/**
 * Created by darrenroyle on 19/09/2017.
 */
public class IntMaffs {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        if(a == 0 || b == 0) {
            return 0;
        } else {
            return a * b;
        }
    }
    public int divide(int a, int b) {
        if(a == 0 || b == 0) {
            return 0;
        } else {
            return a/b;
        }
    }
    public int square(int a) {
        if(a == 0) {
            return 0;
        } else {
            return multiply(a, a);
        }
    }
}
