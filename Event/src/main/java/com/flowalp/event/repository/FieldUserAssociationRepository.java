package com.flowalp.event.repository;

import com.flowalp.event.entity.FieldUserAssociation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FieldUserAssociationRepository extends JpaRepository<FieldUserAssociation, String> {
}