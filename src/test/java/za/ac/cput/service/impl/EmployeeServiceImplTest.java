package za.ac.cput.service.impl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Name;
import za.ac.cput.domain.Employee;
import za.ac.cput.factory.NameFactory;
import za.ac.cput.factory.EmployeeFactory;


@SpringBootTest
public class EmployeeServiceImplTest {

    @Autowired
    private EmployeeServiceImpl service;
    private final Name name = NameFactory.createName("Michael", "", "Jackson");
    private final Employee employee = EmployeeFactory.createEmployee("1A2", "217148867@mycput.ac.za", name);

    @Test
    void save() {
//        Employee create = this.service.save(this.employee);
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
