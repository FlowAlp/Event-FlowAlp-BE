package com.flowalp.event.repository;

import com.flowalp.event.entity.EventUserFieldAssociation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventUserFieldAssociationRepository extends JpaRepository<EventUserFieldAssociation, String> {
}