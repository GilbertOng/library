package com.example.multimodule.service;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("number")
public class NumberProperties {
    public static String npwp(String text){
        if(text == null || text.equals(""))
            text = "000000000000000";

        return formatter(text, "xx.xxx.xxx.x-xxx.xxx");
    }

    protected static String formatter(String text, String format){
        for (int i = 0; i < text.length(); i++){
            char c = text.charAt(i);

            format = format.replaceFirst("x", Character.toString(c));
        }

        return format;
    }
}
