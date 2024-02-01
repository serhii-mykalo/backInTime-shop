package ua.shop.backintime.user.service.mapper;

import org.springframework.stereotype.Component;
import ua.shop.backintime.user.RoleEntity;
import ua.shop.backintime.user.UserEntity;
import ua.shop.backintime.user.controller.request.UpdateUserRequest;
import ua.shop.backintime.user.controller.response.UserResponse;
import ua.shop.backintime.user.service.dto.UpdateUserDto;
import ua.shop.backintime.user.service.dto.UserDto;

import java.util.stream.Collectors;

@Component
public class UserMapper {

    public UserDto toUserDto(UserEntity user) {
        UserDto dto = new UserDto();
        dto.setId(user.getId());
        dto.setUsername(user.getUsername());
        dto.setEmail(user.getEmail());
        dto.setLastUpdatedDate(user.getLastUpdatedDate());
        dto.setCreatedDate(user.getCreatedDate());
        dto.setRoles(user.getRoles().stream()
                .map(RoleEntity::getRoleName).collect(Collectors.toSet()));
        return dto;
    }

    public UpdateUserDto toUpdateUserDto(UpdateUserRequest request) {
        UpdateUserDto dto = new UpdateUserDto();
        dto.setOldUsername(request.getOldUsername());
        dto.setOldPassword(request.getOldPassword());
        dto.setOldEmail(request.getOldEmail());
        dto.setNewUsername(request.getNewUsername());
        dto.setNewPassword(request.getNewPassword());
        dto.setNewEmail(request.getNewEmail());
        return dto;
    }

    public UserResponse toUserResponse(UserDto dto) {
        UserResponse response = new UserResponse();
        response.setId(dto.getId());
        response.setUsername(dto.getUsername());
        response.setEmail(dto.getEmail());
        response.setLastUpdatedDate(dto.getLastUpdatedDate());
        response.setCreatedDate(dto.getCreatedDate());
        response.setRoles(dto.getRoles());
        return response;
    }
}