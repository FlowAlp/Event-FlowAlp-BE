package com.flowalp.event.repository;

import com.flowalp.event.entity.AssignmentUserAssociation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssignmentUserAssociationRepository extends JpaRepository<AssignmentUserAssociation, String> {
}