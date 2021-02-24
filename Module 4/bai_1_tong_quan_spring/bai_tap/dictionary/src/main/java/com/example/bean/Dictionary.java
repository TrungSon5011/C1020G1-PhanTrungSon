package com.example.bean;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private String english;
    private String viet;
    public static HashMap<String,String> dictionaryMap =  dictionaryMap = new HashMap<>();
    static {
        dictionaryMap.put("hello","xin chao");
        dictionaryMap.put("hi","chao");
        dictionaryMap.put("novel","tieu thuyet");
        dictionaryMap.put("romantic","lang man");

    }

}
