package com.flowalp.event.repository;

import com.flowalp.event.entity.UserField;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserFieldRepository extends JpaRepository<UserField, String> {
}