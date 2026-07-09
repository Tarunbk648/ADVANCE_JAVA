package com.xworkz.country.exception;

public class CountryNameNotFoundException extends Throwable {
    public CountryNameNotFoundException(String countryCodeIsInvalid) {
        super(countryCodeIsInvalid);
    }
}
