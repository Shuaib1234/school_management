package za.ac.cput.factory;

import za.ac.cput.domain.Name;
import za.ac.cput.domain.Student;
import za.ac.cput.util.StudentHelper;

public class StudentFactory {

    public static Student createStudent(String studentId, String email, Name name){
       if(StudentHelper.isNull(studentId))
           return null;
       if(!StudentHelper.emailValid(email))
           return null;

       return new Student.Builder()
               .setStudentId(studentId)
               .setEmail(email)
               .setName(name)
               .build();
    }
}
