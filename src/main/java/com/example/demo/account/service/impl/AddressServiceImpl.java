package com.example.demo.account.service.impl;


import com.example.demo.account.repository.AddressRepository;
import com.example.demo.account.service.contract.AddressService;
import com.example.demo.account.service.dto.AddressDto;
import com.example.demo.account.service.mapper.AddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;

    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }


    @Override
    public List<AddressDto> findAll() {
        return Optional.of(AddressMapper.INSTANCE.addressToDtoList(addressRepository.findAll())).orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public AddressDto findById(Integer id) {
        return AddressMapper.INSTANCE.addressToDto(addressRepository.findById(id).get());
    }

    @Override
    public AddressDto save(AddressDto addressDto) {
        return null;
    }

    @Override
    public AddressDto update(AddressDto addressDto) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
