package com.flowalp.event.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "event_user_field_association", schema = "event_flowalp")
public class EventUserFieldAssociation {
    @Id
    @Column(name = "uuid", nullable = false, columnDefinition = "CHAR(36)")
    private String uuid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "event_uuid", nullable = false)
    private Event eventUuid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "field_uuid", nullable = false)
    private UserField fieldUuid;

    @ColumnDefault("0")
    @Column(name = "required")
    private Boolean required;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Event getEventUuid() {
        return eventUuid;
    }

    public void setEventUuid(Event eventUuid) {
        this.eventUuid = eventUuid;
    }

    public UserField getFieldUuid() {
        return fieldUuid;
    }

    public void setFieldUuid(UserField fieldUuid) {
        this.fieldUuid = fieldUuid;
    }

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

}