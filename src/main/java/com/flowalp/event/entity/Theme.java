package com.flowalp.event.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.Instant;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "theme", schema = "event_flowalp")
public class Theme {

  @Id
  @Column(length = 8)
  private String uuid;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "event_uuid",
      insertable = false,
      updatable = false)
  private Event event;

  @Column(name = "name", nullable = false, unique = true)
  private String name;

  @Column(name = "primary_color", length = 7, nullable = false)
  private String primaryColor;

  @Column(name = "background_color", length = 7, nullable = false)
  private String backgroundColor;

  @Column(name = "text_color", length = 7, nullable = false)
  private String textColor;

  @Column(name = "on_primary_color", length = 7, nullable = false)
  private String onPrimaryColor;

  @Column(name = "link_color", length = 7, nullable = false)
  private String linkColor;

  @Column(name = "border_color", length = 7, nullable = false)
  private String borderColor;

  @Column(name = "surface_ground", length = 7, nullable = false)
  private String surfaceGround;

  @Column(name = "surface_card", length = 7, nullable = false)
  private String surfaceCard;

  @Column(name = "text_color_secondary", length = 9, nullable = false)
  private String textColorSecondary;

  @Column(name = "light", nullable = false)
  private Boolean light = true;

  @Column(name = "created_at", nullable = false, updatable = false)
  private Instant createdAt = Instant.now();

  @Column(name = "updated_at", nullable = false)
  private Instant updatedAt = Instant.now();

}
