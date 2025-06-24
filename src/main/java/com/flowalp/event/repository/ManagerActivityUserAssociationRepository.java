package com.flowalp.event.repository;

import com.flowalp.event.entity.ManagerActivityUserAssociation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerActivityUserAssociationRepository extends JpaRepository<ManagerActivityUserAssociation, String> {

}
