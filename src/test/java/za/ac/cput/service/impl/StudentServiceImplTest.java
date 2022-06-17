package za.ac.cput.service.impl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Name;
import za.ac.cput.domain.Student;
import za.ac.cput.factory.NameFactory;
import za.ac.cput.factory.StudentFactory;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class StudentServiceImplTest {

    @Autowired
    private StudentServiceImpl service;
    private final Name name = NameFactory.createName("Ali", "", "Mohamed");
    private final Student student = StudentFactory.createStudent("Ali", "219113505@mycput.ac.za", name);

    @Test
    void save() {
//        Student create = this.service.save(this.student);
//        assertNotNull(create);
//        System.out.println(create);
    }

    @Test
    void findById() {
    }

    @Test
    void delete() {
    }

    @Test
    void findAll() {
    }
}