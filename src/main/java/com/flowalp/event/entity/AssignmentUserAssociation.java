package com.flowalp.event.entity;

import com.aventrix.jnanoid.jnanoid.NanoIdUtils;
import com.flowalp.event.entity.enums.Status;
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
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "assignment_user_association", schema = "event_flowalp")
public class AssignmentUserAssociation {

  @Id
  @Column(name = "uuid", length = 8, nullable = false, updatable = false)
  private String id = NanoIdUtils.randomNanoId(
      NanoIdUtils.DEFAULT_NUMBER_GENERATOR,
      NanoIdUtils.DEFAULT_ALPHABET, 8);

  @ManyToOne(fetch = FetchType.LAZY, optional = false) @JoinColumn(name = "assignment_uuid", nullable = false) private Assignment assignment;

  @ManyToOne(fetch = FetchType.LAZY, optional = false) @JoinColumn(name = "user_uuid", nullable = false) private User user;

  @Column(name = "comment") private String comment;

  @Column(name = "status", nullable = false) private Status status;

  @ColumnDefault("CURRENT_TIMESTAMP") @Column(name = "created_at") private Instant createdAt;

  @ColumnDefault("CURRENT_TIMESTAMP") @Column(name = "updated_at") private Instant updatedAt;
}
