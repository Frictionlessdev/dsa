package com.sb.learning.dsa.recursion;

public class FirstUpperCase {
    public char firstUpperCase(String input){
        if (input.length() == 0){
            return "".charAt(0);
        }

        if (input.charAt(0) == input.toUpperCase().charAt(0)){
            return input.charAt(0);
        } else {
            return firstUpperCase(input.substring(1));
        }
    }
}
