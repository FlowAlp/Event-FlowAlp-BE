package com.flowalp.event.repository;

import com.flowalp.event.entity.UserFields;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserFieldsRepository extends JpaRepository<UserFields, String> {

}
