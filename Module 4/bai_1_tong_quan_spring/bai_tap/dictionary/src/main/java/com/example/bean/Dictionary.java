package com.example.bean;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private String english;
    private String viet;
    public static HashMap<String,String> dictionaryMap =  dictionaryMap = new HashMap<>();
    static {
        dictionaryMap.put("hello","xin chao");
        dictionaryMap.put("fuck","dam chet cha may gio");
        dictionaryMap.put("heo","hoi troi di");
        dictionaryMap.put("love","yeu");

    }

}
