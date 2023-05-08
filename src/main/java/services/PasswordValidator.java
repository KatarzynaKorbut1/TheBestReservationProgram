package services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator extends MailValidator {

    public boolean passwordValidate(String passwordStr) {
        Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$");
        Matcher matcher = pattern.matcher(passwordStr);

        return matcher.matches();
    }

}
