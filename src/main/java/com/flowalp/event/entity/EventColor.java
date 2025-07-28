package com.flowalp.event.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "event_color")
public class EventColor {

  @Id
  @Column(length = 8)
  private String uuid;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "event_uuid",
      insertable = false,
      updatable = false)
  private Event event;

  @Column(name = "variable_name",
      nullable = false,
      length = 64)
  private String variableName;

  @Column(name = "color_hex",
      nullable = false,
      length = 7)
  private String colorHex;

}
