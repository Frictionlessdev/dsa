package com.sb.learning.dsa.utils;

import java.util.stream.Collectors;

public class Arrays {
    public static String join(String delimiter, int[] arr){
        return java.util.Arrays.stream(arr)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(delimiter));
    }
}
