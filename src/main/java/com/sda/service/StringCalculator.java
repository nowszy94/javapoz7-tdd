package com.sda.service;

import org.apache.commons.lang3.StringUtils;

public class StringCalculator {
    public int calculate(String text) {
        if (StringUtils.isBlank(text)) {
            return 0;
        }
        int result = 0;
        String[] elements = text.split(";");
        for (String element : elements) {
            result += Integer.valueOf(StringUtils.deleteWhitespace(element));
        }
        return result;
    }
}
