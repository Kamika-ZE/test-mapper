package com.example.demo.account.controller;


import com.example.demo.account.service.contract.AccountService;
import com.example.demo.account.service.contract.AddressService;
import com.example.demo.account.service.dto.AddressDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addresses")
public class AddressRestController {

    private final AddressService addressService;

    @Autowired
    public AddressRestController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping("/{id}")
    public AddressDto retrieveAddress(@PathVariable Integer id){
       return addressService.findById(id);
    }




}
