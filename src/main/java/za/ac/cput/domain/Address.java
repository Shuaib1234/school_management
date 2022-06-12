/*
Address.java
Address entity
Author: Craig Jarvis
Date: 11 June 2022
 */

package za.ac.cput.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
public class Address {
    private String unitNumber;
    private String complexName;
    private String streetNumber;
    private String streetName;
    private int postalCode;
    @NotNull
    private City city;

    //constructors
    private Address(Builder builder){
        this.unitNumber=builder.unitNumber;
        this.complexName=builder.complexName;
        this.streetNumber=builder.streetNumber;
        this.streetName=builder.streetName;
        this.postalCode=builder.postalCode;
    }


    //getters
    public String getUnitNumber() {
        return unitNumber;
    }

    public String getComplexName() {
        return complexName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public City getCity() {
        return city;
    }

    //toString and hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return postalCode == address.postalCode && Objects.equals(unitNumber, address.unitNumber) && Objects.equals(complexName, address.complexName) && Objects.equals(streetNumber, address.streetNumber) && Objects.equals(streetName, address.streetName) && Objects.equals(city, address.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unitNumber, complexName, streetNumber, streetName, postalCode, city);
    }

    @Override
    public String toString() {
        return "Address{" +
                "unitNumber='" + unitNumber + '\'' +
                ", complexName='" + complexName + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", streetName='" + streetName + '\'' +
                ", postalCode=" + postalCode +
                ", city=" + city +
                '}';
    }

    public static class Builder {
        private String unitNumber;
        private String complexName;
        private String streetNumber;
        private String streetName;
        private int postalCode;
        private City city;

        public Builder unitNumber(String unitNumber) {
            this.unitNumber=unitNumber;
            return this;
        }

        public Builder complexName(String complexName) {
            this.complexName=complexName;
            return this;
        }

        public Builder streetNumber(String streetNumber) {
            this.streetNumber=streetNumber;
            return this;
        }

        public Builder streetName(String streetName) {
            this.streetName=streetName;
            return this;
        }

        public Builder postalCode(int postalCode) {
            this.postalCode=postalCode;
            return this;
        }

        public Builder city(City city) {
            this.city=city;
            return this;
        }

        public Builder copy(Address address) {
            this.unitNumber= address.unitNumber;
            this.complexName= address.complexName;
            this.streetNumber = address.streetNumber;
            this.streetName = address.streetName;
            this.postalCode = address.postalCode;
            this.city = address.city;
            return this;
        }

        public Address build() {
            return new Address(this);
        }
    }

}
