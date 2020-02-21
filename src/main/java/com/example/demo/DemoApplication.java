package com.example.demo;

import com.example.demo.account.model.Account;
import com.example.demo.account.model.Address;
import com.example.demo.account.model.enumeration.AccountStatus;
import com.example.demo.account.model.enumeration.Role;
import com.example.demo.account.repository.AccountRepository;
import com.example.demo.account.repository.AddressRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    CommandLineRunner start(AccountRepository accountRepository, AddressRepository addressRepository) {
        return args -> {
            Address address = Address.builder()
                                      .housenumber("3 bis")
                                      .street("rue saint gilles")
                                      .postcode("50130")
                                      .city("cherbourg")
                                      .build();
            addressRepository.save(address);

            accountRepository.save(Account.builder()
                                           .lastName("coz")
                                           .firstName("mickael")
                                           .address(address)
                                           .email("coz.mickael@gmail.com")
                                           .phoneNumber("0632513519")
                                           .registrationDate(LocalDateTime.now())
                                           .role(Role.ADMIN)
                                           .accountStatus(AccountStatus.ACTIVE)
                                           .build());

        };
    }

}
