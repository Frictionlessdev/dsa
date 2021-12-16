package com.sb.learning.dsa;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Intro {
    public String introduction(String name){
        log.info("Introducing {}", name);
        return String.format("Hello, %s", name);
    }
}
