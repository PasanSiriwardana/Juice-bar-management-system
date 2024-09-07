package com.example.custumer1.mapper;

import com.example.custumer1.dto.CustumerDto;
import com.example.custumer1.entity.Custumer;

public class CustumerMapper {

    public static CustumerDto mapToCustomerDto(Custumer custumer){
        return new CustumerDto(

                custumer.getMobile(),
                custumer.getFirstName(),
                custumer.getLastName()
        );
    }
    public static Custumer mapToCustomer(CustumerDto custumerDto){
        return new Custumer(
                custumerDto.getMobile(),
                custumerDto.getFirstName(),
                custumerDto.getLastName()
        );
    }
}
