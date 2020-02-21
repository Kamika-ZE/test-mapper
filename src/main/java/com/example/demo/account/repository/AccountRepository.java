package com.example.demo.account.repository;

import com.example.demo.account.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {


    Account findByLastName(String lastName);

    Account findByEmail(String Email);
}
