import Utils.PhoneReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        String path = "src/main/resources/text";

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            while (reader.ready()) {
                String currentLine = reader.readLine();
                PhoneReader.readPhoneNumbers(currentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
