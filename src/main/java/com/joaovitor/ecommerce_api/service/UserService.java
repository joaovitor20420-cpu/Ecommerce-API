package com.joaovitor.ecommerce_api.service;

import com.joaovitor.ecommerce_api.entity.Role;
import com.joaovitor.ecommerce_api.entity.User;
import com.joaovitor.ecommerce_api.repository.RoleRepository;
import com.joaovitor.ecommerce_api.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    public UserService(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    public User createUser(User user) throws Exception{
        Role  roleForClient = roleRepository.findById(2L)
                .orElseThrow(() -> new Exception("Cargo de cliente não encontrado"));

                user.setRole(roleForClient);

        return userRepository.save(user);
    }
}
