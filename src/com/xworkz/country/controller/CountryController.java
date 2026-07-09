package com.xworkz.country.controller;

import com.xworkz.country.constants.CountryEnum;
import com.xworkz.country.dto.CountryDto;
import com.xworkz.country.service.CountryServiceDao;
import com.xworkz.country.service.impl.CountryServiceDaoImpl;

import java.util.List;

public class CountryController {
   CountryServiceDao countryServiceDao= new CountryServiceDaoImpl();

    public CountryController(){
        System.out.println("CountryController Constructor Called!!");

    }

    public boolean validateAndSave(CountryDto countryDto){
        return countryServiceDao.validateAndSave(countryDto);
    }

    public  List<String> getCountryCodeByCountryName(String countryName){
        return countryServiceDao.getCountryCodeByCountryName(countryName);
    }

    public List<String> getCountryNameByCountryCode(String countryCode){
        return countryServiceDao.getCountryNameByCountryCode(countryCode);
    }

    public  List<Integer> getCountryPopulationByCountryName(String name){
        return countryServiceDao.getCountryPopulationByCountryName(name);
    }

    public List<CountryEnum> getCountryEnumByCountryCode(String countryCode){
        return countryServiceDao.getCountryEnumByCountryCode(countryCode);
    }


    public List<Integer> updateCountryPopulationByCountryCode(int updatePopulation, String code){
        return countryServiceDao.updateCountryPopulationByCountryCode(updatePopulation, code);
    }

    public List<String> updateCountryCapitalByCountryCode(String capital, String code){
        return countryServiceDao.updateCountryCapitalByCountryCode(capital, code);
    }


    public List<String> updateCountryCurrencyByCountryCode(String currency, String code){
        return countryServiceDao.updateCountryCurrencyByCountryCode(currency, code);
    }



    public  List<String> deleteCountryNameByCountryCode(String code){
        return countryServiceDao.deleteCountryNameByCountryCode(code);
    }



    public List<String> deleteCountryCapitalByCountryName(String name){
        return countryServiceDao.deleteCountryCapitalByCountryName(name);
    }


    public List<CountryDto> getCountryDetailsByCountryCode(String code){
        return countryServiceDao.getCountryDetailsByCountryCode(code);
    }


    public  List<CountryDto> getCountryDetailsByCountryName(String name){
        return countryServiceDao.getCountryDetailsByCountryName(name);
    }


    public List<CountryDto> getAllCountryDetails(){
        return countryServiceDao.getAllCountryDetails();
    }

}
