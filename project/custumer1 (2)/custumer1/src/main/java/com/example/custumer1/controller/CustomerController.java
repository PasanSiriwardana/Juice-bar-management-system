package com.example.custumer1.controller;

import com.example.custumer1.dto.CustumerDto;
import com.example.custumer1.services.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/customer1")
public class CustomerController {

    private CustomerService customerService;

    @PostMapping

    public ResponseEntity<CustumerDto> createCustomer(@RequestBody CustumerDto custumerDto){

        CustumerDto savedCustumer = customerService.createCustomer(custumerDto);

        return new ResponseEntity<>(savedCustumer, HttpStatus.CREATED);
    }

}
