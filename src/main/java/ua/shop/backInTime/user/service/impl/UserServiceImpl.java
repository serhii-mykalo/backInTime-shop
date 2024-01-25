package ua.shop.backInTime.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.shop.backInTime.user.User;
import ua.shop.backInTime.user.repository.UserRepository;
import ua.shop.backInTime.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void userRegister(String name, String password) {
        User user = new User(name, password);
        userRepository.save(user);
    }
}
