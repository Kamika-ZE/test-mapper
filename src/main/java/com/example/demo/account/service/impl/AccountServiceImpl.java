package com.example.demo.account.service.impl;


import com.example.demo.account.model.Account;
import com.example.demo.account.repository.AccountRepository;
import com.example.demo.account.service.contract.AccountService;
import com.example.demo.account.service.dto.AccountDto;
import com.example.demo.account.service.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;


    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;

    }


    @Override
    public List<AccountDto> findAll() {
        return AccountMapper.INSTANCE.accountToDtoList(accountRepository.findAll());
    }

    @Override
    public AccountDto findById(Integer id) {
        return AccountMapper.INSTANCE.accountToDto(accountRepository.findById(id).get());
    }

    @Override
    public AccountDto save(AccountDto accountDTO) {
 /*       Account account = AccountMapper.INSTANCE.accountDtoToEntity(accountDTO);
        accountRepository.save(account);
        AccountDto accountDtoSaved = AccountMapper.INSTANCE.accountToDto(accountRepository.save(account));*/

        final Optional<AccountDto> optionalAccountDTO = Optional.of( accountDTO );
        optionalAccountDTO.ifPresent(newAccountDto -> accountRepository.save(AccountMapper.INSTANCE.accountDtoToEntity(accountDTO))) ;


        return accountDTO;
    }

    @Override
    public AccountDto update(AccountDto accountDTO) {
        Account account = AccountMapper.INSTANCE.accountDtoToEntity(accountDTO);
        account.setUpdateDate(LocalDateTime.now());
        accountRepository.save(account);
        return AccountMapper.INSTANCE.accountToDto(account);
    }

    @Override
    public AccountDto findByLastName(String lastName) {

        return AccountMapper.INSTANCE.accountToDto(accountRepository.findByLastName(lastName));
    }

    @Override
    public AccountDto findByEmail(String email) {

        return AccountMapper.INSTANCE.accountToDto(accountRepository.findByEmail(email));
    }

    @Override
    public void delete(Integer id) {
        accountRepository.deleteById(id);
    }
}
