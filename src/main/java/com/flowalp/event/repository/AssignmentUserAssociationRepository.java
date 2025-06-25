package com.flowalp.event.repository;

import com.flowalp.event.entity.AssignmentUserAssociation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignmentUserAssociationRepository extends JpaRepository<AssignmentUserAssociation, String> {

}
