package com.sda.service;

import org.apache.commons.lang3.StringUtils;

public class StringCalculator {
    public int calculate(String text) {
        String textWithoutWhitespaces = StringUtils.deleteWhitespace(text);
        String[] elements = StringUtils.split(textWithoutWhitespaces, ";");
        elements = elements == null ? new String[0] : elements;
        int result = 0;
        for (String element : elements) {
            result += Integer.valueOf(element);
        }
        return result;
    }
}
