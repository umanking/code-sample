package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Geonguk Han
 * @since 2020-04-15
 */
public class PrimeFactorTest {

    @Test
    void prime_factor_test() {
        assertThat(factors(1)).isEqualTo(Arrays.asList());
        assertThat(factors(2)).isEqualTo(Arrays.asList(2));
        assertThat(factors(3)).isEqualTo(Arrays.asList(3));
        assertThat(factors(4)).isEqualTo(Arrays.asList(2, 2));
        assertThat(factors(5)).isEqualTo(Arrays.asList(5));
        assertThat(factors(6)).isEqualTo(Arrays.asList(2, 3));
        assertThat(factors(7)).isEqualTo(Arrays.asList(7));
        assertThat(factors(8)).isEqualTo(Arrays.asList(2, 2, 2));
        assertThat(factors(9)).isEqualTo(Arrays.asList(3, 3));
    }

    private List<Integer> factors(int n) {
        List<Integer> result = new ArrayList<>();
        int divisor = 2;
        while (n > 1) {
            while (n % divisor == 0) {
                n /= divisor;
                result.add(divisor);
            }
            divisor++;
        }

        if (n > 1) {
            result.add(n);
        }

        return result;

    }

    @Test
    void name() {
        List<Integer> list = new ArrayList<>();
        int i = 8;
        while (i % 2 == 0) {
            i /= 2; // 4 , 2 , 1
            list.add(i);
        }

        System.out.println(list);

    }
}
