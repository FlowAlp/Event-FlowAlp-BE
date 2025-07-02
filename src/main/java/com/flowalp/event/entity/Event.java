package com.flowalp.event.entity;

import com.aventrix.jnanoid.jnanoid.NanoIdUtils;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "event", schema = "event_flowalp")
public class Event {

  @Id
  @Column(name = "uuid", length = 8, nullable = false, updatable = false)
  private String id = NanoIdUtils.randomNanoId(
      NanoIdUtils.DEFAULT_NUMBER_GENERATOR,
      NanoIdUtils.DEFAULT_ALPHABET, 8);

  @Column(name = "name", nullable = false) private String name;

  @Column(name = "description", nullable = false) private String description;

  @Column(name = "image_url", length = 2083) private String imageUrl;

  @Column(name = "color_primary", nullable = false, length = 7) private String colorPrimary;

  @Column(name = "color_secondary", nullable = false, length = 7) private String colorSecondary;

  @Column(name = "color_accent", nullable = false, length = 7) private String colorAccent;

  @ColumnDefault("CURRENT_TIMESTAMP") @Column(name = "created_at") private Instant createdAt;

  @ColumnDefault("CURRENT_TIMESTAMP") @Column(name = "updated_at") private Instant updatedAt;
}
