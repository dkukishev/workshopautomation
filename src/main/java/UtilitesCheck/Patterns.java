package UtilitesCheck;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by DenysKukishev on 12/5/18.
 */
public class Patterns {

    public static boolean checkThatNotString(String inline) {
        String patternAge = "[a-z]+";
        String number = inline;
        Pattern p1 = Pattern.compile(patternAge);
        Matcher m2 = p1.matcher(number);
        if (m2.find()) {
            System.out.println(number.substring(m2.start(), m2.end()) + " is the word! Number line shouldn't contain letters.");

            return true;
        }
        return false;
    }

    public static boolean chechThatNotNumber(String inline) {
        String pattern = "[0-9]+";
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
