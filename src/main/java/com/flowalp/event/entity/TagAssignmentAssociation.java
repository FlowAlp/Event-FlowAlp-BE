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

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "tag_assignment_association", schema = "event_flowalp")
public class TagAssignmentAssociation {

  @Id @GeneratedValue(strategy = GenerationType.UUID) @Column(name = "uuid", nullable = false, columnDefinition = "CHAR(36)") private String id;

  @ManyToOne(fetch = FetchType.LAZY, optional = false) @JoinColumn(name = "tag_uuid", nullable = false) private Tag tag;

  @ManyToOne(fetch = FetchType.LAZY, optional = false) @JoinColumn(name = "assignment_uuid", nullable = false) private Assignment assignment;
}
