package com.xworkz.bankingApplication.dto;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor

public class ManagerDto {
    private int manager_Id;
    private int user_Id;
    private String manager_Name;
    private String manager_Email;
    private String manager_Password;
    private String address;
}
