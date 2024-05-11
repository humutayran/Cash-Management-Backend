package com.example.cashmanagementspring.mapper;

import com.example.cashmanagementspring.dto.UserDto;
import com.example.cashmanagementspring.model.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    UserEntity dtoToEntity(UserDto userDto);
    UserDto entityToDto(UserEntity userEntity);
}
