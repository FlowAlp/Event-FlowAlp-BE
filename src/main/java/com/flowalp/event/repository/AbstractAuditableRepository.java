package com.flowalp.event.repository;

import java.io.Serializable;
import org.springframework.data.jpa.domain.AbstractAuditable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface AbstractAuditableRepository<T extends AbstractAuditable<U, ID>, U, ID extends Serializable>
    extends JpaRepository<T, ID> {

}
