package com.xworkz.employee.dto;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import com.xworkz.employee.dto.dto.EmployeeDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        List<EmployeeDto> list = new ArrayList<>();

        EmployeeDto employeeDto1 = new EmployeeDto(1, "Yogesh", 35000.90, 2003, "HR", "Male", 23);
        EmployeeDto employeeDto2 = new EmployeeDto(2, "Vinod", 35000.90, 2013, "HR", "Male", 20);
        EmployeeDto employeeDto3 = new EmployeeDto(3, "Anitha", 55000.90, 2019, "Management", "Female", 45);
        EmployeeDto employeeDto4 = new EmployeeDto(4, "Sumathi", 65000.90, 2026, "Business", "Female", 53);
        EmployeeDto employeeDto5 = new EmployeeDto(5, "Narayan", 35000.90, 2023, "Deployment", "Male", 63);

        list.add(employeeDto1);
        list.add(employeeDto2);
        list.add(employeeDto3);
        list.add(employeeDto4);
        list.add(employeeDto5);


        System.out.println("--Printing All the employee Details---");
        list.stream().forEach(System.out::println);


        System.out.println();
        System.out.println("--Before printing a Unique Department details--");
        list.stream().map(r -> r.getDepartment()).forEach(System.out::println);
        System.out.println();
        System.out.println("--Get the unique department--");
        list.stream().map(res -> res.getDepartment()).distinct().forEach(System.out::println);


        System.out.println();
        System.out.println("--Before printing a Unique salary details--");
        list.stream().map(r -> r.getSalary()).forEach(System.out::println);
        System.out.println();
        System.out.println("--Get the unique salary--");
        list.stream().map(ref -> ref.getSalary()).collect(Collectors.toSet()).forEach(System.out::println);


        System.out.println();
        System.out.println("--Get name and length --");
        Map map = list.stream().collect(Collectors.toMap(name -> name.getEmployee_Name(), name -> name.getEmployee_Name().length()));
        System.out.println(map);


        System.out.println();
        System.out.println("--Get the salary  greater then 35000");
        list.stream().filter(rs -> rs.getSalary() > 50000).forEach(System.out::println);


        System.out.println();
        System.out.println("--Get all the the details based on department (It is similar to the Grouping in sql) ");
        list.stream().collect(Collectors.groupingBy(emp -> emp.getDepartment()))
                .forEach((key, value) -> System.out.println(key + "==> " + value));

        System.out.println();
        System.out.println("---Get all the details based on gender--");
        list.stream().collect(Collectors.groupingBy(emp -> emp.getGender())).forEach((key, value) -> System.out.println(key + "--->" + value));
        System.out.println();

        System.out.println();
        System.out.println("--Get the new employee");
        EmployeeDto dto = list.stream().sorted((o1, o2) -> o1.getYearOfJoining() - o2.getYearOfJoining()).findFirst().get();
        System.out.println(dto);

        System.out.println();
        System.out.println("--Get the new Joining employee using min--");
        EmployeeDto dto1 = list.stream().min((o1, o2) -> o1.getYearOfJoining() - o2.getYearOfJoining()).get();
        System.out.println(dto1);

        System.out.println();
        System.out.println("--Get the new joining employee using collect--");
        System.out.println(list.stream().collect(Collectors.minBy((o1, o2) -> o1.getYearOfJoining() - o2.getYearOfJoining())));


    }
}
