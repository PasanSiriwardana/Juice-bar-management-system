package com.example.custumer1.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class CustumerDto  {

    private Long mobile;
    private String firstName;
    private String lastName;


}
