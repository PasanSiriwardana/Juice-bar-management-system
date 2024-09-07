package com.example.custumer1.services.impl;

import com.example.custumer1.dto.CustumerDto;
import com.example.custumer1.entity.Custumer;
import com.example.custumer1.mapper.CustumerMapper;
import com.example.custumer1.repository.CustumerRespository;
import com.example.custumer1.services.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor

public class CustomerServiceImpl implements CustomerService {

    private CustumerRespository custumerRespository;

    @Override
    public CustumerDto createCustomer(CustumerDto custumerDto) {

        Custumer custumer = CustumerMapper.mapToCustomer(custumerDto);
        Custumer savedCustomer = custumerRespository.save(custumer);

        return CustumerMapper.mapToCustomerDto(savedCustomer);
    }
}
