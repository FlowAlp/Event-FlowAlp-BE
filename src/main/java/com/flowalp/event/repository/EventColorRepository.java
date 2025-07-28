package com.flowalp.event.repository;

import com.flowalp.event.entity.EventColor;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EventColorRepository extends JpaRepository<EventColor, Integer> {

  @Query("SELECT ec FROM EventColor ec WHERE ec.event = ?1")
  List<EventColor> findByEventId(String eventId);
}
