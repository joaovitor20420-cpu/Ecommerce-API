package com.joaovitor.ecommerce_api.repository;

import com.joaovitor.ecommerce_api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}