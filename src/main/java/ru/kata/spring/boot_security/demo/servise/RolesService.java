package ru.kata.spring.boot_security.demo.servise;

import ru.kata.spring.boot_security.demo.model.Role;

import java.util.List;

public interface RolesService {
    List<Role> getAllRoles();
    Role getRoleById(long id);
    void saveRole(Role role);
    void updateRole(long id, Role updetedRole);
    void deleteRole(long id);
}
