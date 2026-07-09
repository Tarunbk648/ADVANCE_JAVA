package com.xworkz.country.dao;

import com.xworkz.country.constants.CountryEnum;
import com.xworkz.country.dto.CountryDto;

import java.util.List;

public interface CountryDao {
    boolean save(CountryDto countryDto);
    List<String> getCountryCodeByCountryName(String countryName);
    List<String> getCountryNameByCountryCode(String countryCode);
    List<Integer> getCountryPopulationByCountryName(String name);
    List<CountryEnum> getCountryEnumByCountryCode(String countryCode);
    List<Integer> updateCountryPopulationByCountryCode(int updatePopulation, String code);
    List<String> updateCountryCapitalByCountryCode(String capital, String code);
    List<String> updateCountryCurrencyByCountryCode(String currency, String code);
    List<String> deleteCountryNameByCountryCode(String code);
    List<String> deleteCountryCapitalByCountryName(String name);
    List<CountryDto> getCountryDetailsByCountryCode(String code);
    List<CountryDto> getCountryDetailsByCountryName(String name);
    List<CountryDto> getAllCountryDetails();




}
