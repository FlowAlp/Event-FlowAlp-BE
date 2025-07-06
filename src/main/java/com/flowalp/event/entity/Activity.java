package com.flowalp.event.entity;

import com.aventrix.jnanoid.jnanoid.NanoIdUtils;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.Instant;
import java.time.LocalDate;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "activity", schema = "event_flowalp")
public class Activity {

  @Id
  @Column(name = "uuid", length = 8, nullable = false, updatable = false)
  private String id = NanoIdUtils.randomNanoId(
      NanoIdUtils.DEFAULT_NUMBER_GENERATOR,
      NanoIdUtils.DEFAULT_ALPHABET, 8);

  @ManyToOne(fetch = FetchType.LAZY, optional = false) @JoinColumn(name = "event_uuid", nullable = false) private Event event;

  @Column(name = "name", nullable = false) private String name;

  @Column(name = "description", nullable = false) private String description;

  @Column(name = "image_url", length = 2083) private String imageUrl;

  @Column(name = "date", nullable = false) private LocalDate date;

  @Column(name = "end_date") private LocalDate endDate;

  @Column(name = "adults_only") private Boolean adultsOnly;

  @ColumnDefault("CURRENT_TIMESTAMP") @Column(name = "created_at") private Instant createdAt;

  @ColumnDefault("CURRENT_TIMESTAMP") @Column(name = "updated_at") private Instant updatedAt;
}
