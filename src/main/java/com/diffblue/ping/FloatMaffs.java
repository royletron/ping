package com.diffblue.ping;

/**
 * Created by darrenroyle on 18/09/2017.
 */
public class FloatMaffs {
    public float multiply(float a, float b) {
        if (a == 0 || b == 0) {
            return 0;
        } else {
            return a * b;
        }
    }
    public float add(float a, float b) {
        return a + b;
    }
    public float subtract(float a, float b) {
        return a - b;
    }
    public float divide(float a, float b) {
        return a/b;
    }
    public boolean isEven(float a) {
        return a%2 == 0;
    }
    public boolean isOdd(float a) {
        return a%2 == 1;
    }
}
