package com.example.demo.account.model;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "address")
public class Address {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "public.address_address_id_seq")
    @SequenceGenerator(name = "public.address_address_id_seq", sequenceName = "public.address_address_id_seq", allocationSize = 1)
    @Column(name = "address_id")
    private Integer id;

    @Column(name = "housenumber")
    private String housenumber;

    @Column(name = "street", length = 50, nullable = false)
    private String street;

    @Column(name = "postcode", length = 5, nullable = false)
    private String postcode;

    @Column(name = "city", nullable = false)
    private String city;

    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "address", fetch = FetchType.LAZY)
    private Collection<Account> accounts;

    @Override
    public String toString() {
        return "Address{" +
                       "id=" + id +
                       ", housenumber='" + housenumber + '\'' +
                       ", street='" + street + '\'' +
                       ", postcode='" + postcode + '\'' +
                       ", city='" + city + '\'' +
                       ", accounts=" + accounts +
                       '}';
    }
}
