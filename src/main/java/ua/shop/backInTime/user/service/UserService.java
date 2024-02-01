package ua.shop.backInTime.user.service;

import ua.shop.backInTime.user.service.dto.UpdateUserDto;
import ua.shop.backInTime.user.service.dto.UserDto;
import ua.shop.backInTime.user.service.exception.UserAlreadyExistException;
import ua.shop.backInTime.user.service.exception.UserIncorrectPasswordException;
import ua.shop.backInTime.user.service.exception.UserNotFoundException;
import ua.shop.backInTime.utils.UserRole;

import java.util.Collection;

public interface UserService {
    void registerUser(String username, String email,
                      String password) throws UserAlreadyExistException;

    UserDto updateUser(Long userId, UpdateUserDto updateUserDto)
            throws UserNotFoundException, UserIncorrectPasswordException, UserAlreadyExistException;

    UserDto updateUserRoles(Long userId, Collection<UserRole> roles) throws UserNotFoundException;

}