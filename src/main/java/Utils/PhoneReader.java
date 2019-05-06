package Utils;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneReader {

    public static List<String> readPhoneNumbers(String string) {
        Pattern pattern = Pattern.compile("(\\+\\d)\\(\\d{3}\\) \\d{3} \\d{2} \\d{2}");
        Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            String result = matcher.group();

        }

        return null;
    }

}
