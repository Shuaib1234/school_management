/*
CountryServiceImplTest.java
Author: Demi Farquhar (220322104)
Date: 17 June 2022
 */
package za.ac.cput.service.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Country;
import za.ac.cput.factory.CountryFactory;
import za.ac.cput.service.ICountryService;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CountryServiceImplTest {

    Country country = CountryFactory.createCountry("SW1","Sweden");
    // City city = CityFactory.build("SW","Cape", country);

    @Autowired
    private ICountryService service;

    @Order(1)
    @Test
    void save()
    {
        Country saved = this.service.save(this.country);
        assertEquals(this.country, saved);
        System.out.println(saved);
    }
    @Order(2)
    @Test
    void findById (){
        Optional<Country> read = this.service.findById(country.getId());
        System.out.println(read);
        assertAll(
                ()-> assertTrue(read.isPresent()),
                () -> assertEquals(this.country, read.get())
        );
    }
    @Order(3)
    @Test
    void findAll (){
        List<Country> countryList = this.service.findAll();
        System.out.println(countryList);
        assertEquals(1,countryList.size());
    }
    @Order(4)
    @Test
    void delete(){
        this.service.delete(this.country);
        List<Country> countryList = this.service.findAll();
        assertEquals(0,countryList.size());
    }
}