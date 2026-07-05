package com.xworkz.meta.dto;


import lombok.*;

@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor

public class SignUpDto {
    private String user_Name;
    private String email;
    private String password;
    private String adhaar_number;

}
