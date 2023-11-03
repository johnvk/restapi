package com.jmallavalli.springboot.restapi.versioning;

public class EmployeeV2 extends Employee {
    private String firstName;
    private String lastName;
    private Address address;

    public EmployeeV2(String firstName, String lastName) {
        super(firstName + " " + lastName);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getAddress() {
        return (address == null) ? "" : address.toString();
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "EmployeeV2{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                '}';
    }
}
