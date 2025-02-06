package com.flowalp.event.repository;

import com.flowalp.event.entity.ManagerActivityUserAssociation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerActivityUserAssociationRepository extends JpaRepository<ManagerActivityUserAssociation, String> {
}