package com.xworkz.employeetask;


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import com.xworkz.employeetask.dto.EmployeeDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        List<EmployeeDto> list= new ArrayList<>();

        EmployeeDto employeeDto1=new EmployeeDto(1,"Tarun","Technical", "male",23);
        EmployeeDto employeeDto2=new EmployeeDto(2,"Yashshaswini","Business Associate", "Female",21);
        EmployeeDto employeeDto3=new EmployeeDto(3,"Irfan","Technical","male",24);
        EmployeeDto employeeDto4=new EmployeeDto(4, "Deepak","Technical Associate","male",22);
        EmployeeDto employeeDto5=new EmployeeDto(5,"Yashas","Blogging Partner","male",22);

        list.add(employeeDto1);
        list.add(employeeDto2);
        list.add(employeeDto3);
        list.add(employeeDto4);
        list.add(employeeDto5);

        list.stream().forEach(System.out::println);

        System.out.println();
        System.out.println("--Group the Employees by age--");
        list.stream().collect(Collectors.groupingBy(emp->emp.getAge())).forEach((key,value)-> System.out.println(key+"===>"+value));


        System.out.println();
        System.out.println("-- Find the count of male and female employees present in the organization--");
        list.stream().collect(Collectors.groupingBy(emp->emp.getGender(),Collectors.counting())).forEach((key,value)-> System.out.println(key+"=>" +value));
//        for(Object m: dto.entrySet()){
//            System.out.println(m);
//        }


        System.out.println();
        System.out.println("-- Find the count of male and female present in each department--");
        list.stream().collect(Collectors.groupingBy(em->em.getDepartment(),Collectors.groupingBy(em->em.getGender(),Collectors.counting()))).forEach((key,value)-> System.out.println(key+"==>" +value));


        System.out.println();
        System.out.println("--Print employee details whose age is greater than specific age in the organisation--");
        list.stream().filter(res->res.getAge()>23).forEach(System.out::println);


        System.out.println();
        System.out.println("-- Print the number of employees in each department--");
        list.stream().collect(Collectors.groupingBy(emp->emp.getDepartment(),Collectors.counting())).forEach((key,value)-> System.out.println(key+"-->"+value));



    }
}
