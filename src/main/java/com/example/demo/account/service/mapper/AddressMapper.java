package com.example.demo.account.service.mapper;

import com.example.demo.account.model.Address;
import com.example.demo.account.service.dto.AddressDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = {AccountMapper.class})
public interface AddressMapper {

    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    //Entity to DTO
    @Mapping(source = "accounts", target = "accounts")
    AddressDto addressToDto(Address address);
    List<AddressDto> addressToDtoList(List<Address> addressList);

    //DTO to Entity
    //@InheritInverseConfiguration
    Address addressDtoToEntity(AddressDto addressDto);
    List<Address> addressDtoToEntityList(List<AddressDto> addressDtoList);

    default Address fromId(final Integer id){
        if (id == null){
            return null;
        }
        final Address address = new Address();
        address.setId(id);
        return address;
    }


}
