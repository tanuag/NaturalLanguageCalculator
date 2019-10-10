package com.ncr.assignment.utility;

import java.util.HashMap;

public class TextToNumberOperatorConvertor {

    static HashMap<String, String> textnumberMap = new HashMap<>();

    static {
        textnumberMap.put("zero", "0");
        textnumberMap.put("one", "1");
        textnumberMap.put("two", "2");
        textnumberMap.put("three", "3");
        textnumberMap.put("four", "4");
        textnumberMap.put("five", "5");
        textnumberMap.put("six", "6");
        textnumberMap.put("seven", "7");
        textnumberMap.put("eight", "8");
        textnumberMap.put("nine", "9");
        textnumberMap.put("ten", "10");
        textnumberMap.put("plus", "+");
        textnumberMap.put("add", "+");
        textnumberMap.put("minus", "-");
        textnumberMap.put("subtract", "-");
        textnumberMap.put("less", "-");
        textnumberMap.put("times", "*");
        textnumberMap.put("multiplied-by", "*");
        textnumberMap.put("over", "/");
        textnumberMap.put("divided-by", "/");
    }
}
