import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    private static final String[] ONES = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] TENS = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number :");
        System.out.println(sayNumber(in.nextLong()));
    }
    public static String sayNumber(long number) {
        if (number == 0) {
            return "Zero.";
        }
        List<String> parts = new ArrayList<>();
        int billion = (int) (number / 1000000000);
        if (billion != 0) {
            parts.add(threeDigitToWords(billion) + " billion");
        }
        number %= 1000000000;
        int million = (int) (number / 1000000);
        if (million != 0) {
            parts.add(threeDigitToWords(million) + " million");
        }
        number %= 1000000;
        int thousand = (int) (number / 1000);
        if (thousand != 0) {
            parts.add(threeDigitToWords(thousand) + " thousand");
        }
        number %= 1000;
        if (number != 0) {
            parts.add(threeDigitToWords((int) number));
        }
        return String.join(", ", parts) + ".";
    }

    private static String threeDigitToWords(int number) {
        if (number == 0) {
            return "";
        }
        if (number < 20) {
            return ONES[number] + " ";
        }
        int tens = number / 10;
        int ones = number % 10;
        return TENS[tens] + " " + ONES[ones] + " ";
    }
}
