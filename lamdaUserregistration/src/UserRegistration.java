import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class UserRegistration {
        public static String FIRST_NAME = "^[A-Z]{1}[a-z]{2,}$";
        public static String REGEX_EMAIL = "^[a-zA-Z0-9]+([.#_$+-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,3}([.][a-zA-Z]{2})?$";
        public static String REGEX_MOBILENUM = "^(91)?\\s{0,2}[0-9]{10}$";
        public static String REGEX_PASSWORD = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$";

        public static Predicate<String> validateUserName = name -> Pattern.matches(FIRST_NAME, name);
        public static Predicate<String> validateEmail = email -> Pattern.matches(REGEX_EMAIL, email);
        public static Predicate<String> validatePnNo = phNo -> Pattern.matches(REGEX_MOBILENUM, phNo);
        public static Predicate<String> validatePassword = password -> Pattern.matches(REGEX_PASSWORD, password);
        Scanner sc = new Scanner(System.in);

        public void validateFirstName() {
            System.out.println("Enter First Name :");
            String Name = sc.nextLine();
            if (validateUserName.test(Name))
                System.out.println("First Name is Vaild");
            else {
                System.out.println("First Name is Not Vaild");
                System.out.println("First name should starts with Capital letter and has minimum 3 characters");
            }
        }

        public void validateLastName() {
            System.out.println("Enter Last Name :");
            String Name = sc.nextLine();
            if (validateUserName.test(Name))
                System.out.println("Last name is Vaild");
            else {
                System.out.println("Last name is Not Vaild");
                System.out.println("Last name should starts with Capital letter and has minimum 3 characters");
            }
        }

        public void validateEmail() {
            System.out.println("Enter email :");
            String email = sc.nextLine();
            if (validateEmail.test(email))
                System.out.println("email is Vaild");
            else
                System.out.println("email is Not Vaild");
        }

        public void validatePhoneNo() {
            System.out.println("Enter Pho No :");
            String phoneNo = sc.nextLine();
            if (validatePnNo.test(phoneNo))
                System.out.println("Phone number is Vaild");
            else {
                System.out.println("Phone number is Not Vaild");
                System.out.println("Country code follow by space and 10 digit number ");
            }
        }

        public void validatePassword() {
            System.out.println("Enter Password :");
            String phoneNo = sc.nextLine();
            if (validatePassword.test(phoneNo))
                System.out.println("Password is Vaild");
            else {
                System.out.println("Password is Not Vaild");
                System.out.println("\nPassword Should have : \n1. Minimum 8 charatcers \n2. At least 1 Upper Case \n3. At least 1 Numeric Number \n4. exactly 1 Special Character");
            }
        }
    }

