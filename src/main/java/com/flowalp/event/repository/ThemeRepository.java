package com.flowalp.event.repository;

import com.flowalp.event.entity.Theme;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThemeRepository extends JpaRepository<Theme, Integer> {

  List<Theme> findByEventId(String eventId);
}
