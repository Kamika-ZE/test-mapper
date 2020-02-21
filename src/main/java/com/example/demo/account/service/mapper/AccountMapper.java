package com.example.demo.account.service.mapper;

import com.example.demo.account.model.Account;
import com.example.demo.account.service.dto.AccountDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;


import java.util.List;

@Mapper(componentModel = "spring", uses = {AddressMapper.class}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AccountMapper {

    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);

    //Entity to DTO
    AccountDto accountToDto(Account account);
    List<AccountDto> accountToDtoList(List<Account> accountList);

    //DTO to Entity
    Account accountDtoToEntity(AccountDto accountDto);
    List<Account> accountToEntityList (List<AccountDto> accountDtoList);


}
