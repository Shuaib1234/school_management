package za.ac.cput.factory;

import za.ac.cput.domain.Name;
import za.ac.cput.domain.Student;
import za.ac.cput.util.StudentHelper;

public class StudentFactory {

    public static Student createStudent(String studentId, String email, Name name){
       if(StudentHelper.idIsNull(studentId) || StudentHelper.nameIsNull(name))
           throw new IllegalArgumentException("ID or Name is empty");
       if(!StudentHelper.emailValid(email))
           throw new IllegalArgumentException("Invalid Email!");

       return new Student.Builder()
               .setStudentId(studentId)
               .setEmail(email)
               .setName(name)
               .build();
    }
}
