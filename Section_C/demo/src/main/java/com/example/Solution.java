package com.example;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private static final String[] ONES = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] TENS = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private static final String[] GROUP_NAMES = {"", "Thousand", "Million", "Billion", "Trillion"};

    public String sayNumber(long number) {
        if (number == 0) {
            return "Zero.";
        }
        List<String> parts = new ArrayList<>();
        int group = 0;
        while (number > 0) {
            int groupNum = (int) (number % 1000);
            if (groupNum != 0) {
                String groupString = threeDigitToWords(groupNum) + " " + GROUP_NAMES[group];
                parts.add(0, groupString);
            }
            number /= 1000;
            group++;
        }
        String result = String.join(" and ", parts).trim() + ".";
        return result.substring(0, 1).toUpperCase() + result.substring(1).toLowerCase();
    }

    private String threeDigitToWords(int number) {
        if (number == 0) {
            return "";
        }
        if (number < 20) {
            return ONES[number];
        }
        int hundred = number / 100;
        int remainder = number % 100;
        String hundredWord = "";
        if (hundred != 0) {
            hundredWord = ONES[hundred] + " Hundred";
        }
        if (remainder == 0) {
            return hundredWord;
        }
        int tens = remainder / 10;
        int ones = remainder % 10;
        if (ones != 0) {
            return hundredWord + " " + TENS[tens] + "-" + ONES[ones];
        }
        return hundredWord + " " + TENS[tens];
    }
}
