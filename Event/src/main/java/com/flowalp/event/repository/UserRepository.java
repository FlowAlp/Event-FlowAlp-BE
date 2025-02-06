package com.flowalp.event.repository;

import com.flowalp.event.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}