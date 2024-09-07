package com.example.custumer1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customer1")
public class Custumer {

    @Id
    private Long mobile;
    @Column(name = "FirstName")
    private String firstName;
    @Column(name = "LastName")
    private String lastName;

}
