package com.sb.learning.dsa.recursion;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CapitalizeWords {

    public String capitalizeWords(String input) {

        log.info(input);

        if(input.isEmpty()) {
            return input;
        }

        char chr = input.charAt(input.length() - 1);
        log.info("chr: {}", chr);

        if (input.length() == 1){
            return Character.toString(Character.toUpperCase(chr));
        }

        if (input.substring(input.length() - 2, input.length() - 1).equals(" ")){
            chr = Character.toUpperCase(chr);
        }

        return capitalizeWords(input.substring(0, input.length() - 1)) + Character.toString(chr);
    }
}
