package com.flowalp.event.repository;

import com.flowalp.event.entity.UserField;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserFieldRepository extends JpaRepository<UserField, String> {
}