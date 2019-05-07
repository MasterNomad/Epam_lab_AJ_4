import util.PhoneReader;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {

        String inputPath = "src/main/resources/text";
        String outputPath = "src/main/resources/numbers";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                new FileInputStream(inputPath), StandardCharsets.UTF_8));
             PrintWriter writer = new PrintWriter(outputPath, "UTF-8")) {

            while (reader.ready()) {
                PhoneReader
                        .getPhoneNumbers(reader.readLine())
                        .forEach(writer::println);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
