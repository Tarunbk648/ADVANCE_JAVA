package com.xworkz.hospital.dto;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class HospitalDto {
    private int hospital_id;
    private String hospital_name;
    boolean is_open;
    long phoneNumber;

    public void setis_open(boolean isOpen) {
        this.is_open=isOpen;
    }

    public boolean getis_open(){
        return this.is_open;
    }
}
