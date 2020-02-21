package com.example.demo.account.service.contract;



import com.example.demo.account.service.dto.AddressDto;

import java.util.List;

public interface AddressService {

    List<AddressDto> findAll();
    AddressDto findById (Integer id);
    AddressDto save(AddressDto addressDto);
    AddressDto update(AddressDto addressDto);
    void delete(Integer id);
}
