package com.example.maskphonenumbers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private static final int MAX_LOCAL_DIGITS = 9;

    private final String number;

    public PhoneNumber(String number) {
        this.number = number;
    }

    public String address() {
        return simpleLongDistance(number);
    }

    private String simpleLongDistance(String number) {
        final String strippedNumber = stripCollectCode(allDigits(number));
        if (strippedNumber.length() <= MAX_LOCAL_DIGITS)
            return strippedNumber;
        return stripToLongDistance(strippedNumber);
    }

    private String stripCollectCode(String number) {
        return number.replaceFirst("^90[97]0", "");
    }

    private String stripToLongDistance(String number) {
        Pattern p = Pattern.compile("(?:55|0)(?:\\d{2})?(\\d{2})(\\d{8,9})");
        Matcher m = p.matcher(number);
        if (m.find()) {
            return m.group(1)+m.group(2);
        }
        return number;
    }

    private String allDigits(String number) {
        return number.replaceAll("\\D+", "");
    }

    public String source() {
        return address();
    }

    public String local() {
        if (source().length() > MAX_LOCAL_DIGITS) {
            String source = source();
            return source.substring(2);
        }
        return source();
    }
}
