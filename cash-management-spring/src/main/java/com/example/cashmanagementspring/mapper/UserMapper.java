package com.example.cashmanagementspring.mapper;

import com.example.cashmanagementspring.dto.request.UserRequestDto;
import com.example.cashmanagementspring.dto.response.UserResponseDto;
import com.example.cashmanagementspring.model.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    UserEntity requestDtoToEntity(UserRequestDto userRequestDto);
    UserResponseDto entityToResponseDto(UserEntity userEntity);

}
