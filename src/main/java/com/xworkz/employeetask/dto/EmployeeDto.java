package com.xworkz.employeetask.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@AllArgsConstructor

public class EmployeeDto {
    private int employee_id;
    private String employee_name;
    private String department;
    private String gender;
    private int age;
}
