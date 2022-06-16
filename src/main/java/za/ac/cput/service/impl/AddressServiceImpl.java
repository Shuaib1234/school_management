//Author: Craig Jarvis

package za.ac.cput.service.impl;

import org.springframework.stereotype.Service;
import za.ac.cput.domain.Address;
import za.ac.cput.repository.AddressRepository;
import za.ac.cput.service.AddressService;
import java.util.List;
import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService {

    private AddressRepository repository;

    @Override
    public Address save(Address address) {
        return this.repository.save(address);
    }

    @Override
    public Optional<Address> findById(String s) {

        return this.repository.findById(s);
    }

    @Override
    public List<Address> findAll() {
        return this.repository.findAll();
    }

    @Override
    public void delete(Address address) {
        this.repository.delete(address);
    }
}
