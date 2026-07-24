package com.xworkz.country;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class CitiesAndPinCode {
    public static void main(String[] args) {
        List<CitiesDto> list = new ArrayList<>();

        CitiesDto city1 = new CitiesDto("560100", "Rajajinagar");
        CitiesDto city2 = new CitiesDto("560100", "Malleshwaram");
        CitiesDto city3 = new CitiesDto("560102", "Basavanagudi");
        CitiesDto city4 = new CitiesDto("560103", "Jayanagar");
        CitiesDto city5 = new CitiesDto("560104", "Vijayanagar");
        CitiesDto city6 = new CitiesDto("560105", "Indiranagar");
        CitiesDto city7 = new CitiesDto("560106", "Koramangala");
        CitiesDto city8 = new CitiesDto("560107", "Whitefield");
        CitiesDto city9 = new CitiesDto("560108", "Marathahalli");
        CitiesDto city10 = new CitiesDto("560109", "HSRLayout");
        CitiesDto city11 = new CitiesDto("560110", "BTMLayout");
        CitiesDto city12 = new CitiesDto("560111", "ElectronicCity");
        CitiesDto city13 = new CitiesDto("560112", "Hebbal");
        CitiesDto city14 = new CitiesDto("560113", "Yelahanka");
        CitiesDto city15 = new CitiesDto("560114", "Banashankari");
        CitiesDto city16 = new CitiesDto("560115", "JPNagar");
        CitiesDto city17 = new CitiesDto("560116", "RRNagar");
        CitiesDto city18 = new CitiesDto("560117", "Kengeri");
        CitiesDto city19 = new CitiesDto("560118", "Nagarbhavi");
        CitiesDto city20 = new CitiesDto("560119", "MagadiRoad");
        CitiesDto city21 = new CitiesDto("560120", "Peenya");
        CitiesDto city22 = new CitiesDto("560121", "Yeshwanthpur");
        CitiesDto city23 = new CitiesDto("560122", "Seshadripuram");
        CitiesDto city24 = new CitiesDto("560123", "Shivajinagar");
        CitiesDto city25 = new CitiesDto("560124", "Ulsoor");
        CitiesDto city26 = new CitiesDto("560125", "Domlur");
        CitiesDto city27 = new CitiesDto("560126", "Bellandur");
        CitiesDto city28 = new CitiesDto("560127", "Sarjapur");
        CitiesDto city29 = new CitiesDto("560128", "Hoodi");
        CitiesDto city30 = new CitiesDto("560129", "KRPuram");
        CitiesDto city31 = new CitiesDto("560130", "Hennur");
        CitiesDto city32 = new CitiesDto("560131", "Banaswadi");
        CitiesDto city33 = new CitiesDto("560132", "KalyanNagar");
        CitiesDto city34 = new CitiesDto("560133", "RTNagar");
        CitiesDto city35 = new CitiesDto("560134", "FrazerTown");
        CitiesDto city36 = new CitiesDto("560135", "CoxTown");
        CitiesDto city37 = new CitiesDto("560136", "RichmondTown");
        CitiesDto city38 = new CitiesDto("560137", "WilsonGarden");
        CitiesDto city39 = new CitiesDto("560138", "Chamrajpet");
        CitiesDto city40 = new CitiesDto("560139", "Basaveshwaranagar");
        CitiesDto city41 = new CitiesDto("560140", "Sadashivanagar");
        CitiesDto city42 = new CitiesDto("560141", "SanjayNagar");
        CitiesDto city43 = new CitiesDto("560142", "Mathikere");
        CitiesDto city44 = new CitiesDto("560143", "Jalahalli");
        CitiesDto city45 = new CitiesDto("560144", "Vidyaranyapura");
        CitiesDto city46 = new CitiesDto("560145", "Kodigehalli");
        CitiesDto city47 = new CitiesDto("560146", "Thanisandra");
        CitiesDto city48 = new CitiesDto("560147", "Nagawara");
        CitiesDto city49 = new CitiesDto("560148", "Kadugodi");
        CitiesDto city50 = new CitiesDto("560149", "Anekal");

        list.add(city1);
        list.add(city2);
        list.add(city3);
        list.add(city4);
        list.add(city5);
        list.add(city6);
        list.add(city7);
        list.add(city8);
        list.add(city9);
        list.add(city10);
        list.add(city11);
        list.add(city12);
        list.add(city13);
        list.add(city14);
        list.add(city15);
        list.add(city16);
        list.add(city17);
        list.add(city18);
        list.add(city19);
        list.add(city20);
        list.add(city21);
        list.add(city22);
        list.add(city23);
        list.add(city24);
        list.add(city25);
        list.add(city26);
        list.add(city27);
        list.add(city28);
        list.add(city29);
        list.add(city30);
        list.add(city31);
        list.add(city32);
        list.add(city33);
        list.add(city34);
        list.add(city35);
        list.add(city36);
        list.add(city37);
        list.add(city38);
        list.add(city39);
        list.add(city40);
        list.add(city41);
        list.add(city42);
        list.add(city43);
        list.add(city44);
        list.add(city45);
        list.add(city46);
        list.add(city47);
        list.add(city48);
        list.add(city49);

        System.out.println();
        System.out.println("--Print all the cities--");
        for(CitiesDto cities:list){
            System.out.println(cities);
        }


        System.out.println();
        System.out.println("--Find cities where pincode contains digit '8' --");
        list.stream().filter(rs -> rs.getPincode().contains("8")).forEach(rs -> System.out.println(rs));


        System.out.println();
        System.out.println("--Get cities with even pincode numbers--");
        list.stream().filter(rs -> Integer.parseInt(rs.getPincode())%2==0).forEach(System.out::println);

        System.out.println();
        System.out.println("--Get cities with Odd pincode numbers--");
        list.stream().filter(rs -> Integer.parseInt(rs.getPincode())%2!=0).forEach(System.out::println);

        System.out.println();
        System.out.println("--Find cities starting with 'M' or 'D'  --");
        list.stream().filter(rs -> rs.getCities_Name().startsWith("M")|| rs.getCities_Name().startsWith("D")).forEach(System.out::println);

        System.out.println();
        System.out.println("--Get cities where pincode is divisible by 3 ");
        list.stream().filter(rs->Integer.parseInt(rs.getPincode())%3==0).forEach(System.out::println);

        System.out.println();
        System.out.println("--Find cities where sum of pincode digits equals to 12--");
        list.stream().filter(rs->getDigitSum(rs.getPincode())==12).forEach(System.out::println);

        System.out.println();
        System.out.println("-- Get cities containing 'a' in name --");
        list.stream().filter(rs->rs.getCities_Name().contains("a")).forEach(System.out::println);

        System.out.println();
        System.out.println("--Find cities with pincode ending in '100'  --");
        list.stream().filter(rs->rs.getPincode().endsWith("100")).forEach(System.out::println);


        System.out.println();
        System.out.println("--Converting from List to set---");  //does not allows a duplicate and print in a unsorted order
        Set<CitiesDto>ref= list.stream().collect(Collectors.toSet());  //collect(Collectors.toSet() will convert list to set.
        ref.forEach(rs-> System.out.println(rs));


    }

    private static int getDigitSum(String pincode) {
        return pincode.
                chars().map(Character::getNumericValue).sum();
    }


}


