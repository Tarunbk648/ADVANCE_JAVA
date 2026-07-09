package com.xworkz.country.exception;

public class CountryCodeNotFoundException extends RuntimeException {
    public CountryCodeNotFoundException(String countryNameIsInvalid) {
        super(countryNameIsInvalid);
    }
}
