package za.ac.cput.repository;
/*
Author: Blaine Simpson
Student Nr: 218020171
 */
import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.EmployeeAddress;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface EmployeeAddressRepository extends JpaRepository<EmployeeAddress, String> {
Set<EmployeeAddress> getall();
}
