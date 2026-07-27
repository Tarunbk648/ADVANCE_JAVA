package com.xworkz.employee.dto.dto;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {
    private int employee_Id;
    private String employee_Name;
    private double salary;
    private int yearOfJoining;
    private String department;
    private String gender;
    private int age;


}
