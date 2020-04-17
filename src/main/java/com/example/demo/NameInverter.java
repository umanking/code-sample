package com.example.demo;

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Geonguk Han
 * @since 2020-04-15
 */
class NameInverter {
    public String invert(String name) {
        if (name == null || StringUtils.isEmpty(name)) {
            return "";
        }

        return formatName(splitName(name));
    }

    private String formatName(List<String> names) {
        if (names.size() == 1) {
            return names.get(0);

        } else {
            return formatString(names);
        }
    }

    private ArrayList<String> splitName(String name) {
        return new ArrayList<>(Arrays.asList(name.trim().split("\\s+")));
    }


    private String formatString(List<String> names) {
        return formatStringInline(names);
    }

    private String formatStringInline(List<String> names) {
        return String.format("%s, %s %s", names.get(1).trim(), names.get(0).trim(), getExistNominal(names)).trim();
    }

    private String getExistNominal(List<String> names) {
        String existNominal = "";
        if (names.size() == 3) {
            existNominal = names.get(2);
        }
        return existNominal;
    }

}
