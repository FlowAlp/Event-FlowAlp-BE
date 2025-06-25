package com.flowalp.event.repository;

import com.flowalp.event.entity.FieldUserAssociation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FieldUserAssociationRepository extends JpaRepository<FieldUserAssociation, String> {

}
