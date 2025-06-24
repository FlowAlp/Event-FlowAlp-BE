package com.flowalp.event.repository;

import com.flowalp.event.entity.EventUserFieldAssociation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventUserFieldAssociationRepository extends JpaRepository<EventUserFieldAssociation, String> {

}
