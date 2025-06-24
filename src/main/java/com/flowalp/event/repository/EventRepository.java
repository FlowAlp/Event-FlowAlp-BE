package com.flowalp.event.repository;

import com.flowalp.event.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, String> {

  Event findBySecureId(String secureId);
}
