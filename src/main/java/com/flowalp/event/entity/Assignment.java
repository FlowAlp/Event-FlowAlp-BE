package com.flowalp.event.entity;

import com.aventrix.jnanoid.jnanoid.NanoIdUtils;
import com.flowalp.event.entity.enums.AssigmentPeriod;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.Instant;
import java.time.LocalTime;
import java.util.UUID;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "assignment", schema = "event_flowalp")
public class Assignment {

  @Id
  @Column(name = "uuid", length = 8, nullable = false, updatable = false)
  private String id = NanoIdUtils.randomNanoId(
      NanoIdUtils.DEFAULT_NUMBER_GENERATOR,
      NanoIdUtils.DEFAULT_ALPHABET, 8);

  @ManyToOne(fetch = FetchType.LAZY, optional = false) @JoinColumn(name = "activity_uuid", nullable = false) private Activity activity;

  @Column(name = "name", nullable = false) private String name;

  @Column(name = "description", nullable = false) private String description;

  @Column(name = "start_time") private LocalTime startTime;

  @Column(name = "end_time") private LocalTime endTime;

  @Column(name = "max_users") private Integer maxUsers;

  @Column(name = "overnight", nullable = false) private Boolean overnight = false;

  @Column(name = "assignment_period") private AssigmentPeriod assignmentPeriod;

  @Column(name = "created_at", nullable = false, updatable = false) private Instant createdAt = Instant.now();

  @Column(name = "updated_at", nullable = false) private Instant updatedAt = Instant.now();
}
