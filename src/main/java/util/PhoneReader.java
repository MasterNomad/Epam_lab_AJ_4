package util;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneReader {

    public static List<String> getPhoneNumbers(String string) {
        List<String> phonesList = new ArrayList<>();

        Pattern pattern = Pattern.compile("(\\+\\d)\\(\\d{3}\\) \\d{3} \\d{2} \\d{2}");
        Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            phonesList.add(editPhoneNumber(matcher.group()));
        }
        return phonesList;
    }

    private static String editPhoneNumber(String phoneNumber) {
        StringBuilder result = new StringBuilder(phoneNumber.replaceAll("\\W", ""));
        int code = Integer.parseInt(result.substring(0,1))+1;
        result.replace(0, 1, String.valueOf(code));
        return result.toString();
    }

}
