package com.example.demo.account.service.dto;


import lombok.*;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Collection;

@Getter
@Setter
@NoArgsConstructor
public class AddressDto {

    private Integer id;

    private String housenumber;
    private String street;
    private String postcode;
    private String city;

    @NotNull
    private Collection<AccountDto> accounts = new ArrayList<>();
}
