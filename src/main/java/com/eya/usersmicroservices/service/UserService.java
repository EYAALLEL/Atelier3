package com.eya.usersmicroservices.service;

import com.eya.usersmicroservices.entities.Role;
import com.eya.usersmicroservices.entities.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    User findUserByUsername (String username);
    Role addRole(Role role);
    User addRoleToUser(String username, String rolename);
    List<User> findAllUsers();
}