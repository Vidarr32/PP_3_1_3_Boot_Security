package ru.kata.spring.boot_security.demo.servise;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UsersService extends UserDetailsService {
    User findByUsername(String username);
    List<User> getAllUsers();
    User getUserById(long id);
    void saveUser(User user);
    void updateUser(long id, User updetedUser);
    void deleteUser(long id);

}
