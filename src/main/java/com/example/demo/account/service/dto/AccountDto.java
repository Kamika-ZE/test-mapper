package com.example.demo.account.service.dto;

import com.example.demo.account.model.enumeration.AccountStatus;
import com.example.demo.account.model.enumeration.Role;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class AccountDto {

    private Integer id;

    private String lastName;
    private String firstName;
    private String email;
    private String phoneNumber;
    private AddressDto address;
    private LocalDateTime registrationDate;
    private LocalDateTime updateDate;
    //ENUM
    private Role role;
    private AccountStatus accountStatus;

}
