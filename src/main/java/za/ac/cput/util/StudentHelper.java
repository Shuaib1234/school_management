package za.ac.cput.util;

import org.apache.commons.validator.routines.EmailValidator;
import za.ac.cput.domain.Name;

public class StudentHelper {

    public static boolean stringIsNull(String string){
        return string == null || string.isEmpty() || string.equals(" "); //returns true
    }

    public static boolean nameIsNull(Name name){
        return name == null;
    }

    public static boolean emailValid(String email){
        EmailValidator valid = EmailValidator.getInstance();
        return valid.isValid(email);
    }
}
