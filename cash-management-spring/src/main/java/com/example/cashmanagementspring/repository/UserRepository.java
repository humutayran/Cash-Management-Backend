package com.example.cashmanagementspring.repository;

import com.example.cashmanagementspring.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
