package com.xworkz.bankingApplication.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

public class BankingDto {
    private int user_Id;
    private String user_Name;
    private String user_Email;
    private String user_Password;
    private String address;


}
