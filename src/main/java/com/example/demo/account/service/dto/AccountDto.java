package com.example.demo.account.service.dto;

import com.example.demo.account.model.enumeration.AccountStatus;
import com.example.demo.account.model.enumeration.Role;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class AccountDto {

    private Integer id;

    private String lastName;
    private String firstName;
    private String email;
    private String phoneNumber;
    private Integer addressId;
    private LocalDateTime registrationDate;
    private LocalDateTime updateDate;
    //ENUM
    private Role role;
    private AccountStatus accountStatus;

    @Override
    public String toString() {
        return "AccountDto{" +
                       "id=" + id +
                       ", lastName='" + lastName + '\'' +
                       ", firstName='" + firstName + '\'' +
                       ", email='" + email + '\'' +
                       ", phoneNumber='" + phoneNumber + '\'' +
                       ", addressId=" + addressId +
                       ", registrationDate=" + registrationDate +
                       ", updateDate=" + updateDate +
                       ", role=" + role +
                       ", accountStatus=" + accountStatus +
                       '}';
    }
}
