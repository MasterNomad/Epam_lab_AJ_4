package util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PhoneReaderTest {

    @Test
    public void editPhoneNumbers() {
        String input = "+4(351) 455 22 44";
        String expResult = "53514552244";
        String result = PhoneReader.getPhoneNumbers(input).get(0);
        assertEquals(expResult, result);
    }
}