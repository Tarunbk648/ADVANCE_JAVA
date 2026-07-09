package com.xworkz.country.service.impl;

import com.xworkz.country.constants.CountryEnum;
import com.xworkz.country.controller.CountryController;
import com.xworkz.country.dao.CountryDao;
import com.xworkz.country.dao.impl.CountryDaoImpl;
import com.xworkz.country.dto.CountryDto;
import com.xworkz.country.service.CountryServiceDao;

import java.util.Collections;
import java.util.List;

public class CountryServiceDaoImpl implements CountryServiceDao {
    CountryDao countryDao = new CountryDaoImpl();


    @Override
    public boolean validateAndSave(CountryDto countryDto) {
        if (countryDto.getCountryCode() != null && countryDto.getCountryName() != null && countryDto.getCountryCapital() != null && countryDto.getCountryCurrency() != null && countryDto.getCountryPopulation() > 0 && countryDto.getCountryEnum() != null) {
            return countryDao.save(countryDto);
        }
        return false;
    }

    @Override
    public List<String> getCountryCodeByCountryName(String countryName) {
        if (countryName != null) {
            return countryDao.getCountryCodeByCountryName(countryName);
        }
        return null;
    }

    @Override
    public List<String> getCountryNameByCountryCode(String countryCode) {
        if (countryCode != null) {
            return countryDao.getCountryNameByCountryCode(countryCode);
        }
        return null;
    }

    @Override
    public List<Integer> getCountryPopulationByCountryName(String name) {
        if (name != null) {
            return countryDao.getCountryPopulationByCountryName(name);
        }
        return null;
    }

    @Override
    public List<CountryEnum> getCountryEnumByCountryCode(String countryCode) {
        if (countryCode != null) {
            return countryDao.getCountryEnumByCountryCode(countryCode);
        }
        return null;
    }

    @Override
    public List<Integer> updateCountryPopulationByCountryCode(int updatePopulation, String code) {
        if (updatePopulation > 0 && code != null) {
            return countryDao.updateCountryPopulationByCountryCode(updatePopulation, code);
        }
        return null;
    }

    @Override
    public List<String> updateCountryCapitalByCountryCode(String capital, String code) {
        if (capital != null && code != null) {
            return countryDao.updateCountryCapitalByCountryCode(capital, code);
        }
        return null;
    }

    @Override
    public List<String> updateCountryCurrencyByCountryCode(String currency, String code) {
        if (currency != null && code != null) {
            return countryDao.updateCountryCurrencyByCountryCode(currency, code);
        }
        return null;
    }

    @Override
    public List<String> deleteCountryNameByCountryCode(String code) {
        if (code != null) {
            return countryDao.deleteCountryNameByCountryCode(code);
        }
        return null;
    }

    @Override
    public List<String> deleteCountryCapitalByCountryName(String name) {
        if (name != null) {
            return countryDao.deleteCountryCapitalByCountryName(name);
        }
        return null;
    }

    @Override
    public List<CountryDto> getCountryDetailsByCountryCode(String code) {
        if (code != null) {
            return countryDao.getCountryDetailsByCountryCode(code);
        }
        return null;
    }

    @Override
    public List<CountryDto> getCountryDetailsByCountryName(String name) {
        if (name != null) {
            return countryDao.getCountryDetailsByCountryName(name);
        }
        return null;
    }

    @Override
    public List<CountryDto> getAllCountryDetails() {
        return countryDao.getAllCountryDetails();
    }


}
