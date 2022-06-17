package za.ac.cput.service.impl;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Address;
import za.ac.cput.domain.City;
import za.ac.cput.domain.Country;
import za.ac.cput.domain.StudentAddress;
import za.ac.cput.factory.AddressFactory;
import za.ac.cput.factory.CityFactory;
import za.ac.cput.factory.CountryFactory;
import za.ac.cput.factory.StudentAddressFactory;
import za.ac.cput.service.StudentAddressService;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class StudentAddressServiceImpTest {
    StudentAddress studentAddress =StudentAddressFactory.createStudentAddress("KK89", "");
    Country country = CountryFactory.createCountry("5A", "James");
    City city = CityFactory.createCity("5A", "James", country);
    //Address address = AddressFactory.createAddress("2", "");


    @Autowired
    private StudentAddressService service;
    private String studentAddressList;

    @Order(1)
    @Test
    void save()
    {
       StudentAddress saved = this.service.save(this.studentAddress);
        assertEquals(this.studentAddress, saved);
        System.out.println(saved);
    }
    @Order(2)
    @Test
    void findById (){
        Optional<StudentAddress> read = this.service.findById(studentAddress.getStudentId());
        System.out.println(read);
        assertAll(
                ()-> assertTrue(read.isPresent()),
                () -> assertEquals(this.studentAddress, read.get())
        );
    }
    @Order(3)
    @Test
    void findAll (){
        List<StudentAddress> studentAddressListList = this.service.findAll();
        System.out.println(studentAddressList);
        assertEquals(1,studentAddressList.size());
    }
    @Order(4)
    @Test
    void delete(){
        this.service.delete(this.studentAddress);
        List<StudentAddress> studentAddressList = this.service.findAll();
        assertEquals(0,studentAddressList.size());
    }



}