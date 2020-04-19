package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * @author Geonguk Han
 * @since 2020-04-19
 */
public class WordwrapTest {

    WordWrap wordWrap;

    @BeforeEach
    void setUp() {
        wordWrap = new WordWrap();
    }

    @Test
    void wrap() {
        assertWraps(null, 1, "");
        assertWraps("", 1, "");
        assertWraps("x", 1, "x");
        assertWraps("xx", 1, "x\nx");
        assertWraps("xxx", 1, "x\nx\nx");
    }

    private void assertWraps(String s, int width, String expected) {
        assertThat(wordWrap.wrap(s, width)).isEqualTo(expected);
    }
}
