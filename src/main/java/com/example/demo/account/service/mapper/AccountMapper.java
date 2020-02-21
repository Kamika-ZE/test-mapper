package com.example.demo.account.service.mapper;

import com.example.demo.account.model.Account;
import com.example.demo.account.service.dto.AccountDto;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;


import java.util.List;

@Mapper(componentModel = "spring", uses = {AddressMapper.class})
public interface AccountMapper {

    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);

    //Entity to DTO
    @Mapping(source = "address.id", target = "addressId")
    AccountDto accountToDto(Account account);

    List<AccountDto> accountToDtoList(List<Account> accountList);

    //DTO to Entity
    //@InheritInverseConfiguration
    @Mapping(source = "addressId", target = "address")
    Account accountDtoToEntity(AccountDto accountDto);
    List<Account> accountToEntityList (List<AccountDto> accountDtoList);

    default Account fromId (final Integer id){
        if (id == null){
            return null;
        }
        final Account account = new Account();
        account.setId(id);
        return account;
    }

}
