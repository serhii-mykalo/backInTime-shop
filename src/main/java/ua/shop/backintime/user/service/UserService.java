package ua.shop.backintime.user.service;

import ua.shop.backintime.user.service.dto.UpdateUserDto;
import ua.shop.backintime.user.service.dto.UserDto;
import ua.shop.backintime.user.service.exception.UserAlreadyExistException;
import ua.shop.backintime.user.service.exception.UserIncorrectPasswordException;
import ua.shop.backintime.user.service.exception.UserNotFoundException;
import ua.shop.backintime.utils.UserRole;

import java.util.Collection;

public interface UserService {
    void registerUser(String username, String email,
                      String password) throws UserAlreadyExistException;

    UserDto updateUser(Long userId, UpdateUserDto updateUserDto)
            throws UserNotFoundException, UserIncorrectPasswordException, UserAlreadyExistException;

    UserDto updateUserRoles(Long userId, Collection<UserRole> roles) throws UserNotFoundException;

}