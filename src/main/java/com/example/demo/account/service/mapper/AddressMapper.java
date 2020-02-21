package com.example.demo.account.service.mapper;

import com.example.demo.account.model.Address;
import com.example.demo.account.service.dto.AddressDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;


import java.util.List;

@Mapper(componentModel = "spring", uses = {AccountMapper.class}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AddressMapper {

    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    //Entity to DTO
    AddressDto addressToDto(Address address);
    List<AddressDto> addressToDtoList(List<Address> addressList);

    //DTO to Entity
    Address addressDtoToEntity(AddressDto addressDto);
    List<Address> addressDtoToEntityList(List<AddressDto> addressDtoList);


}
