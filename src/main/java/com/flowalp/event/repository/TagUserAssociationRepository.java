package com.flowalp.event.repository;

import com.flowalp.event.entity.TagUserAssociation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagUserAssociationRepository extends JpaRepository<TagUserAssociation, String> {

}
