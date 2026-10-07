package com.joaovitor.ecommerce_api.repository;

import com.joaovitor.ecommerce_api.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
