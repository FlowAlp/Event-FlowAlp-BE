package com.flowalp.event.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "event_user_field_association", schema = "event_flowalp")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EventUserFieldAssociation {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "uuid", nullable = false, columnDefinition = "CHAR(36)")
    private String uuid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "event_uuid", nullable = false)
    private Event event;  // Cambiato da eventUuid → event

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "field_uuid", nullable = false)
    private UserField field; // Cambiato da fieldUuid → field

    @Column(name = "required", nullable = false)
    private Boolean required = false;  // Default false

}
