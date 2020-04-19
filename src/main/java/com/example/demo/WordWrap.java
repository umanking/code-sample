package com.example.demo;

/**
 * @author Geonguk Han
 * @since 2020-04-19
 */
public class WordWrap {
    // todo: implement more
    String wrap(String s, int width) {
        if (s == null) {
            return "";
        }

        if (s.length() > 1) {
            return s.substring(0, width) + "\n" + wrap(s.substring(width), width);
        }
        return s;
    }
}
