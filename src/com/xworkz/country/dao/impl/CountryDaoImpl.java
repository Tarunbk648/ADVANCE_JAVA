package com.xworkz.country.dao.impl;

import com.xworkz.country.constants.CountryEnum;
import com.xworkz.country.dao.CountryDao;
import com.xworkz.country.dto.CountryDto;
import com.xworkz.country.exception.*;

import java.util.ArrayList;
import java.util.List;

public class CountryDaoImpl implements CountryDao {
    List<CountryDto> list = new ArrayList<>();

    @Override
    public boolean save(CountryDto countryDto) {
        boolean isCountryDtoValid = false;
        boolean iscountryCodeValid = false;
        boolean iscountryNameValid = false;
        boolean iscountryCurrencyValid = false;
        boolean iscountryEnumValid = false;
        boolean iscountryPopulationValid = false;

        String countryCode = countryDto.getCountryCode();
        if (countryCode != null && !countryCode.isEmpty()) {
            iscountryCodeValid = true;
        }

        String countryName = countryDto.getCountryName();
        if (countryName != null && !countryName.isEmpty()) {
            iscountryNameValid = true;
        }

        String countryCurrency = countryDto.getCountryCurrency();
        if (countryCurrency != null && !countryCurrency.isEmpty()) {
            iscountryCurrencyValid = true;
        }

        CountryEnum countryEnum1 = countryDto.getCountryEnum();
        if (countryEnum1 != null) {
            iscountryEnumValid = true;
        }

        int countryPopulation = countryDto.getCountryPopulation();
        if (countryPopulation > 0) {
            iscountryPopulationValid = true;
        }

        if (iscountryCodeValid && iscountryNameValid && iscountryCurrencyValid && iscountryEnumValid && iscountryPopulationValid) {
            list.add(countryDto);
            isCountryDtoValid = true;

        }
        return isCountryDtoValid;

    }


    //getCountryCodeByCountryName
    @Override
    public List<String> getCountryCodeByCountryName(String countryName) {
        List<String> listCCName = new ArrayList<>();
        try {
            for (CountryDto countryDto : list) {
                if (countryName.equalsIgnoreCase(countryDto.getCountryName())) {
                    listCCName.add(countryDto.getCountryCode());
                    System.out.println("The CountryName is" + countryDto.getCountryName() + " and the country code is" + countryDto.getCountryCode());
                }
            }
            if (countryName == null) {
                throw new CountryCodeNotFoundException("Country name is invalid");
            }
        } catch (CountryCodeNotFoundException e) {
            System.err.println(e.getMessage());
        }
        return listCCName;
    }


    //getCountryNameByCountryCode
    @Override
    public List<String> getCountryNameByCountryCode(String countryCode) {
        List<String> listCCName = new ArrayList<>();
        try {
            for (CountryDto countryDto : list) {
                if (countryCode.equalsIgnoreCase(countryDto.getCountryCode())) {
                    listCCName.add(countryDto.getCountryName());
                    System.out.println("The CountryCode is" + countryDto.getCountryCode() + " and the country name is" + countryDto.getCountryName());
                }
            }
            if (countryCode == null) {
                throw new CountryNameNotFoundException("Country code is invalid");
            }
        } catch (CountryNameNotFoundException e) {
            System.err.println(e.getMessage());
        }
        return listCCName;
    }


    //getCountryPopulationByCountryName
    @Override
    public List<Integer> getCountryPopulationByCountryName(String name) {
        List<Integer> listCP = new ArrayList<>();
        try {
            for (CountryDto countryDto : list) {
                if (name.equalsIgnoreCase(countryDto.getCountryName())) {
                    listCP.add(countryDto.getCountryPopulation());
                    System.out.println("The Country name is:" + countryDto.getCountryName() + " and the country population is:" + countryDto.getCountryPopulation());
                }
            }
            if (name == null) {
                throw new CountryPopulationNotFoundException("Country name is invalid");
            }
        } catch (CountryPopulationNotFoundException e) {
            System.err.println(e.getMessage());
        }
        return listCP;
    }


    //getCountryEnumByCountryCode
    @Override
    public List<CountryEnum> getCountryEnumByCountryCode(String countryCode) {
        List<CountryEnum> listCEnum = new ArrayList<>();
        try {
            for (CountryDto countryDto : list) {
                if (countryCode.equalsIgnoreCase(countryDto.getCountryCode())) {
                    listCEnum.add(countryDto.getCountryEnum());
                    System.out.println("The Country code is:" + countryDto.getCountryCode() + " and the country enum is:" + countryDto.getCountryEnum());
                }
            }
            if (countryCode == null) {
                throw new CountryEnumNotFoundException("Country Code is not correct");
            }

        } catch (CountryEnumNotFoundException e) {
            System.err.println(e.getMessage());
        }
        return listCEnum;
    }


    //updateCountryPopulationByCountryCode
    @Override
    public List<Integer> updateCountryPopulationByCountryCode(int updatePopulation, String code) {
        List<Integer> listUpdatePopulation = new ArrayList<>();
        try {
            for (CountryDto countryDto : list) {
                if (code.equalsIgnoreCase(countryDto.getCountryCode())) {
                    countryDto.setCountryPopulation(updatePopulation);
                    listUpdatePopulation.add(countryDto.getCountryPopulation());
                    System.out.println("The country code is:" + countryDto.getCountryCode() + " and the country population is updated to:" + countryDto.getCountryPopulation());
                }
            }
            if (code == null) {
                throw new updateCountryPopulationByCountryCode("Invalid Country code");
            }
        } catch (updateCountryPopulationByCountryCode e) {
            System.err.println(e.getMessage());
        }
        return listUpdatePopulation;
    }


    //updateCountryCapitalByCountryCode+
    @Override
    public List<String> updateCountryCapitalByCountryCode(String capital, String code) {
        List<String> listUpadteCountryCapital = new ArrayList<>();
        try {
            for (CountryDto countryDto : list) {
                if (code.equalsIgnoreCase(countryDto.getCountryCode())) {
                    countryDto.setCountryCapital(capital);
                    listUpadteCountryCapital.add(countryDto.getCountryCapital());
                    System.out.println("The country code is:" + countryDto.getCountryCode() + " and the country capital is updated to:" + countryDto.getCountryCapital());
                }
            }
            if (code == null) {
                throw new updateCountryCapitalByCountryCode("Invalid Country code");
            }
        } catch (updateCountryCapitalByCountryCode e) {
            System.err.println(e.getMessage());
        }
        return listUpadteCountryCapital;
    }


    //updateCountryCurrencyByCountryCode
    @Override
    public List<String> updateCountryCurrencyByCountryCode(String currency, String code) {
        List<String> listUpdateCountryCurrency = new ArrayList<>();
        try {
            for (CountryDto countryDto : list) {
                if (code.equalsIgnoreCase(countryDto.getCountryCode())) {
                    countryDto.setCountryCurrency(currency);
                    listUpdateCountryCurrency.add(countryDto.getCountryCurrency());
                    System.out.println("The country code is:" + countryDto.getCountryCode() + " and the country currency is updated to:" + countryDto.getCountryCurrency());
                }
            }
            if (code == null) {
                throw new updateCountryCurrencyByCountryCode("Invalid Country code");
            }

        } catch (updateCountryCurrencyByCountryCode e) {
            System.err.println(e.getMessage());
        }
        return listUpdateCountryCurrency;
    }


    //deleteCountryNameByCountryCode
    @Override
    public List<String> deleteCountryNameByCountryCode(String code) {
        List<String> listdelete = new ArrayList<>();
        try {
            for (CountryDto countryDto : list) {
                if (code.equalsIgnoreCase(countryDto.getCountryCode())) {
                    String name= countryDto.setCountryName(null);
                    listdelete.remove(name);
                    System.out.println("The country code is:" + countryDto.getCountryCode() + " and the country name is removed:" + countryDto.getCountryName());
                }
            }
            if (code == null) {
                throw new deleteCountryNameByCountryCodeNotFoundException("Invalid Country code");
            }
        } catch (deleteCountryNameByCountryCodeNotFoundException e) {
            System.err.println(e.getMessage());
        }
        return listdelete;

    }


    //deleteCountryCapitalByCountryName
    @Override
    public List<String> deleteCountryCapitalByCountryName(String name) {
        List<String> listdelete = new ArrayList<>();
        try {
            for (CountryDto countryDto : list) {
                if (name.equalsIgnoreCase(countryDto.getCountryName())) {
                    String capital = countryDto.setCountryCapital(null);
                    listdelete.remove(capital);
                    System.out.println("The country name is:" + countryDto.getCountryName() + " and the country capital is removed:" + countryDto.getCountryCapital());
                }
            }
            if (name == null) {
                throw new deleteCountryCapitalByCountryName("Invalid Country name");
            }
        } catch (deleteCountryCapitalByCountryName e) {
            System.err.println(e.getMessage());
        }
        return listdelete;
    }



    //getCountryDetailsByCountryCode
    @Override
    public List<CountryDto> getCountryDetailsByCountryCode(String code) {
        List<CountryDto> listGetCountryDetailsByCountryCode = new ArrayList<>();
        try {
            for (CountryDto countryDto : list) {
                if (code.equalsIgnoreCase(countryDto.getCountryCode())) {
                    listGetCountryDetailsByCountryCode.add(countryDto);
                    System.out.println("Get All Details By Country Code:" + countryDto);
                }
            }
            if (code == null) {
                throw new getCountryDetailsByCountryCode("Invalid code");
            }
        } catch (getCountryDetailsByCountryCode e) {
            System.err.println(e.getMessage());
        }
        return listGetCountryDetailsByCountryCode;
    }



    //getCountryDetailsByCountryName
    @Override
    public List<CountryDto> getCountryDetailsByCountryName(String name) {
        List<CountryDto> listGetCountryDetailsByCountryName = new ArrayList<>();
        try {
            for (CountryDto countryDto : list) {
                if (name.equalsIgnoreCase(countryDto.getCountryName())) {
                    listGetCountryDetailsByCountryName.add(countryDto);
                    System.out.println("Get All Details By Name:" + countryDto);
                }
            }
            if (name == null) {
                throw new getCountryDetailsByCountryNameNotFoundException("Invalid name");
            }

        } catch (getCountryDetailsByCountryNameNotFoundException e) {
            System.err.println(e.getMessage());
        }
        return listGetCountryDetailsByCountryName;
    }



    //getAllCountryDetails
    @Override
    public List<CountryDto> getAllCountryDetails(){
        List<CountryDto> listGetAllCountryDetails = new ArrayList<>();
        for(CountryDto countryDto:list){
            listGetAllCountryDetails.add(countryDto);
            System.out.println(countryDto);
        }
        return listGetAllCountryDetails;
    }
}
