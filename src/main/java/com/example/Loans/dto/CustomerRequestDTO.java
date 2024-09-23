package com.example.Loans.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CustomerRequestDTO {

    private int age;
    private String cpf;
    private String name;
    private Double income;
    private String location;


}
