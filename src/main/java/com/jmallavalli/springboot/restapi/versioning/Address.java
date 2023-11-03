package com.jmallavalli.springboot.restapi.versioning;

public class Address {
    private String StreetNo;
    private String StreetName;
    private String suburb;
    private String state;
    private String zipcode;
    private String country;

    public Address(String streetNo, String streetName, String suburb, String state, String zipcode, String country) {
        StreetNo = streetNo;
        StreetName = streetName;
        this.suburb = suburb;
        this.state = state;
        this.zipcode = zipcode;
        this.country = country;
    }

    public String getStreetNo() {
        return StreetNo;
    }

    public void setStreetNo(String streetNo) {
        StreetNo = streetNo;
    }

    public String getStreetName() {
        return StreetName;
    }

    public void setStreetName(String streetName) {
        StreetName = streetName;
    }

    public String getSuburb() {
        return suburb;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "StreetNo='" + StreetNo + '\'' +
                ", StreetName='" + StreetName + '\'' +
                ", suburb='" + suburb + '\'' +
                ", state='" + state + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
