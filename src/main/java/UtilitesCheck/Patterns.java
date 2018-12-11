package UtilitesCheck;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Patterns {

    public static final String PATTERN_LETTERS = "[a-zA-Z]+";
    public static final String PATTERN_DIGITS = "\\d+";

    //Checking that line not a string
    public static boolean checkThatNotString(String inline) {
        String patternAge = PATTERN_LETTERS; //add to constant
        String number = inline;
        Pattern p1 = Pattern.compile(patternAge);
        Matcher m2 = p1.matcher(number);
        if (m2.find()) {
            System.out.println(number.substring(m2.start(), m2.end()) + " is the word! Number line shouldn't contain letters.");

            return true;
        }
        return false;
    }

    //Checking that line not a digit
    public static boolean chechThatNotNumber(String inline) {
        String pattern = PATTERN_DIGITS; //add to constant
        String text = inline;
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        if (m.find()) {
            System.out.println(text.substring(m.start(), m.end()) + " shouldn't contains numbers! Name line shouldn't contain numbers.");

            return true;
        }
        return false;
    }
}
