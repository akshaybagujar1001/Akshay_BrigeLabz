package day19assignment.emailvalidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    public static void checkValidEmail(String email){

        boolean isEmail;
        String emailRegex = "^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";
        Pattern patternObject = Pattern.compile(emailRegex);
        if (email == null) {
            isEmail = false;
        }
        Matcher matcherObject = patternObject.matcher(email);
        isEmail =  matcherObject.matches();

        if(isEmail)
            System.out.println(email+" is a Valid Email address");
        else
            System.out.println(email+" is an Invalid Email address");
    }

    public static void main(String[] args) {

        System.out.println("---------- Welcome To Email Validator ----------");

        System.out.println("---------- Valid Emails ----------");

        String email = "abc@bridgelabz.co.in";
        checkValidEmail(email);

        email = "abc@gmail.com.com";
        checkValidEmail(email);

        email = "abc@yahoo.com";
        checkValidEmail(email);

        email = "abc@1.com";
        checkValidEmail(email);

        email = "abc-100@yahoo.com";
        checkValidEmail(email);

        email = "abc.100@yahoo.com";
        checkValidEmail(email);

        email = "abc111@abc.com";
        checkValidEmail(email);

        email = "abc-100@abc.net";
        checkValidEmail(email);

        email = "abc.100@abc.com.au";
        checkValidEmail(email);

        email = "abc+100@gmail.com";
        checkValidEmail(email);

        System.out.println("---------------------------------------------------");

        System.out.println("---------- Invalid Emails ----------");

        email = ".abc@abc.com";
        checkValidEmail(email);

        email = "abc";
        checkValidEmail(email);

        email = "abc@.com.my";
        checkValidEmail(email);

        email = "abc@abc@gmail.com";
        checkValidEmail(email);

        email = "abc()*@gmail.com";
        checkValidEmail(email);

        email = "abc..2002@gmail.com";
        checkValidEmail(email);

        email = "abc.@gmail.com";
        checkValidEmail(email);

        email = "abc123@.com";
        checkValidEmail(email);

        email = "abc123@.com.com";
        checkValidEmail(email);

        email = "abc123@gmail.a";
        checkValidEmail(email);

        email = "abc@%*.com";
        checkValidEmail(email);

        email = "abc@gmail.com.1a";
        checkValidEmail(email);

        email = "abc@gmail.com.aa.au";
        checkValidEmail(email);

        System.out.println("---------------------------------------------------");



    }

}


