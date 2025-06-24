package com.flowalp.event.repository;

import java.io.Serializable;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface AbstractPersistableRepository<T extends AbstractPersistable<ID>, ID extends Serializable>
    extends JpaRepository<T, ID> {

}
