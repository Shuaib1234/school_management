package za.ac.cput.service.impl;

/*
Author: Shuaib Allie (217148867)
 */

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.City;
import za.ac.cput.domain.Country;
import za.ac.cput.factory.CityFactory;
import za.ac.cput.factory.CountryFactory;
import za.ac.cput.service.CityService;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CityServiceImplTest {

    private final Country country = CountryFactory.createCountry("1A2", "South Africa");
    City city = CityFactory.createCity("SW1","Cape Town", country);


    @Autowired
    private CityService service;

    @Order(1)
    @Test
    void save()
    {
        City saved = this.service.save(this.city);
        assertEquals(this.city, saved);
        System.out.println(saved);
    }
    @Order(2)
    @Test
    void findById (){
        Optional<City> read = this.service.findById(city.getId());
        System.out.println(read);
        assertAll(
                ()-> assertTrue(read.isPresent()),
                () -> assertEquals(this.city, read.get())
        );
    }
    @Order(3)
    @Test
    void findAll (){
        List<City> cityList = this.service.findAll();
        System.out.println(cityList);
        assertEquals(1,cityList.size());
    }
    @Order(4)
    @Test
    void delete(){
        this.service.delete(this.city);
        List<City> countryList = this.service.findAll();
        assertEquals(0,countryList.size());
    }
}
