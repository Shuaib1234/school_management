package za.ac.cput.factory;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.StudentAddress;
import static org.junit.jupiter.api.Assertions.*;

class StudentAddressFactoryTest {

    @Test
    public void createStudentAddress() {

        StudentAddress sAddress = StudentAddressFactory.createStudentAddress("B214", "");
        System.out.println(sAddress);
        assertNotNull(sAddress);
        System.out.println();
    }

    @Test
        //this is the test when mandatory is empty
    void StudentAddressError() {
        Exception ex = assertThrows(IllegalArgumentException.class, ()-> StudentAddressFactory.createStudentAddress("B009",""));
        String exceptionMessage = ex.getMessage();
        System.out.println(exceptionMessage);
        assertNotSame("Address is needed",exceptionMessage);
        System.out.println();

    }


}