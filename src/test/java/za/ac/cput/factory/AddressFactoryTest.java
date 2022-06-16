//Author: Craig Jarvis

package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Address;
import za.ac.cput.domain.City;
import static org.junit.jupiter.api.Assertions.*;

class AddressFactoryTest {
    Address address = AddressFactory.createAddress('5A', 'Bridges Complex', '17', 'Foxglove Street', 1701, 'Cape Town');

    String unitNumber = '5A';
    String complexName = 'Bridges Complex';
    String streetNumber = '17';
    String streetName = 'Foxglove Street';
    int postalCode = 1701;
    City city = 'Cape Town';


    @Test
    void notNull(){
        Address address = AddressFactory.createAddress(unitNumber, complexName, streetNumber, streetName, postalCode, city);
        assertNotNull(address);
    }

    @Test
    void unitNumberNullException(){k
        assertThrows(IllegalArgumentException.class, () -> AddressFactory.createAddress(null, complexName, streetNumber, streetName, postalCode, city));
    }

    @Test
    void complexNameNullException(){
        assertThrows(IllegalArgumentException.class, () -> AddressFactory.createAddress(unitNumber, null, streetNumber, streetName, postalCode, city));
    }

    @Test
    void streetNumberNullException() {
        assertThrows(IllegalArgumentException.class, () -> AddressFactory.createAddress(unitNumber, complexName, null, streetName, postalCode, city));
    }

    @Test
    void streetNameNullException(){
        assertThrows(IllegalArgumentException.class, () -> AddressFactory.createAddress(unitNumber, complexName, streetNumber, null, postalCode, city));
    }

    @Test
    void postalCodeNullException(){
        assertThrows(IllegalArgumentException.class, () -> AddressFactory.createAddress(unitNumber, complexName, streetNumber, streetName, null, city));
    }

    @Test
    void cityNullException(){
        assertThrows(IllegalArgumentException.class, () -> AddressFactory.createAddress(unitNumber, complexName, streetNumber, streetName, postalCode, null));
    }

    }