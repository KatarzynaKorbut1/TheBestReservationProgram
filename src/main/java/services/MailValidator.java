package services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailValidator {

    public boolean emailValidate(String emailStr) {
        Pattern pattern = Pattern.compile("[a-zA-Z0-9.]+[@][a-z]+[.][a-z]{2,3}");
        Matcher matcher = pattern.matcher(emailStr);

        return matcher.matches();
    }
}
