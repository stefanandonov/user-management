package mk.ukim.finki.emt.usermanagement.utils;

import java.nio.charset.Charset;
import java.util.Random;

public class RandomActivationCodeGenerator {

    public static String  generateActivationCode() {
        byte[] array = new byte[8]; // length is bounded by 7
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));

        return generatedString;
    }
}
