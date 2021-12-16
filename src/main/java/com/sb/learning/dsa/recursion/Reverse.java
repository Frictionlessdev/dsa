package com.sb.learning.dsa.recursion;

public class Reverse {
    public String reverse(String input){
        if (input.length() == 1){
            return input;
        }
        return input.substring(input.length() -1, input.length()) + reverse(input.substring(0, input.length() - 1));
    }
}
