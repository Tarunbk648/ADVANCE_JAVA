package com.xworkz.country.dto;

import com.xworkz.country.constants.CountryEnum;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class CountryDto {
   private String countryCode;
   private String countryName;
   private String countryCapital;
   private String countryCurrency;
   private CountryEnum countryEnum;
   private int countryPopulation;

    public String setCountryName(String countryName) {
        this.countryName = countryName;
        return countryName;
    }


    public String setCountryCapital(String countryCapital) {
        this.countryCapital = countryCapital;
        return countryCapital;
    }
}
