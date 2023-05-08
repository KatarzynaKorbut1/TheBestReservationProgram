package services.interfaces;

import services.AdminImplementation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailValidator  {

    public boolean validate(String emailStr) {
        Pattern pattern = Pattern.compile("[a-zA-Z0-9.]+[@][a-z]+[.][a-z]{2,3}");
        Scanner scanner = new Scanner(System.in);
        Matcher matcher = pattern.matcher(emailStr);

        return matcher.matches();
    }
}
