package com.example.demo.account.service.contract;



import com.example.demo.account.service.dto.AccountDto;

import java.util.List;

public interface AccountService {


    List<AccountDto> findAll();

    AccountDto findById(Integer id);

    AccountDto save(AccountDto accountDto);

    // use update method mapper ?
    AccountDto update(AccountDto accountDto);

    AccountDto findByLastName(String lastName);

    AccountDto findByEmail(String email);


    //no dto for delete ?
    void delete(Integer id);

}
