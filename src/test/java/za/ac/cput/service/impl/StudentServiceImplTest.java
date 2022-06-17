package za.ac.cput.service.impl;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Name;
import za.ac.cput.domain.Student;
import za.ac.cput.factory.NameFactory;
import za.ac.cput.factory.StudentFactory;
import za.ac.cput.repository.StudentRepository;
import za.ac.cput.service.StudentService;

import java.util.List;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class StudentServiceImplTest {
    @Autowired
    private StudentService service;

    private final Name name = NameFactory.createName("a", "b", "c");
    private final Student student = StudentFactory.createStudent("Ali", "219113505@mycput.ac.za", name);





    @Test
    @Order(1)
    void save() {
        Student create = this.service.save(this.student);
        assertNotNull(create);
        System.out.println(create);
    }

//    @Test
//    @Order(2)
//    void findById() {
//        Optional<Student> read = service.findById(student.getStudentId());
//        System.out.println(read);
//    }
//
//    @Test
//    @Order(4)
//    void delete() {
//    }
//
//    @Test
//    @Order(3)
//    void findAll() {
//    }
}