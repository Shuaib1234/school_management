package za.ac.cput.util;

import org.apache.commons.validator.routines.EmailValidator;

public class StudentHelper {

    public static boolean isNull(String string){
        return string == null || string.isEmpty() || string.equals(" "); //returns true
    }

    public static boolean emailValid(String email){
        EmailValidator valid = EmailValidator.getInstance();
        return valid.isValid(email);
    }
}
