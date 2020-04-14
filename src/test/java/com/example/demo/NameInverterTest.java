package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * @author Geonguk Han
 * @since 2020-04-14
 */
public class NameInverterTest {

    private NameInverter nameInverter;

    @BeforeEach
    void setUp() {
        nameInverter = new NameInverter();
    }

    @Test
    void inverter_test() {

        assertThat(nameInverter.invert(null)).isEqualTo("");

        assertThat(nameInverter.invert("")).isEqualTo("");

        assertThat(nameInverter.invert("first")).isEqualTo("first");

        assertThat(nameInverter.invert("    first")).isEqualTo("first");

        assertThat(nameInverter.invert("first second")).isEqualTo("second, first");

        assertThat(nameInverter.invert("     first second")).isEqualTo("second, first");

        assertThat(nameInverter.invert("     first           second")).isEqualTo("second, first");

        assertThat(nameInverter.invert("first second test")).isEqualTo("second, first test");
    }
}
