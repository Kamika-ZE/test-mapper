package com.example.demo.account.service.dto;


import lombok.*;

import java.util.Collection;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class AddressDto {

    private Integer id;

    private String housenumber;
    private String street;
    private String postcode;
    private String city;

    private Collection<AccountDto> accounts;
}
