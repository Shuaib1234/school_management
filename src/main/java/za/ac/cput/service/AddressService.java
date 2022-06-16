//Author: Craig Jarvis

package za.ac.cput.service;

import za.ac.cput.domain.Address;
import za.ac.cput.domain.City;

import java.util.List;

public interface AddressService extends IService<Address, String> {
    List<Address> findAll();
}
