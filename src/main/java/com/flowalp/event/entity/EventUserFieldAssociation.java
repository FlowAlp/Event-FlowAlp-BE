package com.flowalp.event.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
@Table(name = "event_user_field_association", schema = "event_flowalp")
public class EventUserFieldAssociation {

  @Id @GeneratedValue(strategy = GenerationType.UUID) @Column(name = "uuid", nullable = false, length = 8) private String id;

  @ManyToOne(fetch = FetchType.LAZY, optional = false) @JoinColumn(name = "event_uuid", nullable = false) private Event event;

  @ManyToOne(fetch = FetchType.LAZY, optional = false) @JoinColumn(name = "field_uuid", nullable = false) private UserFields userField;

  @Column(name = "required", nullable = false) private Boolean required = false;
}
