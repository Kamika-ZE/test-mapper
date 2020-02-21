package com.example.demo.account.model;

import com.example.demo.account.model.enumeration.AccountStatus;
import com.example.demo.account.model.enumeration.Role;
import lombok.*;


import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Collection;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Table(name = "account")
public class Account  {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "public.account_account_id_seq")
    @SequenceGenerator(name = "public.account_account_id_seq", sequenceName = "public.account_account_id_seq", allocationSize = 1)
    @Column(name = "account_id")
    private Integer id;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "address_id", referencedColumnName = "address_id")
    private Address address;

    @Column(name = "email", length = 50, unique = true, nullable = false)
    private String email;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @Column(name = "registration_date", nullable = false)
    private LocalDateTime registrationDate;

    @Column(name = "update_date")
    private LocalDateTime updateDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = true)
    private Role role;

    @Enumerated(EnumType.STRING)
    @Column(name = "account_status", nullable = true)
    private AccountStatus accountStatus;


}
