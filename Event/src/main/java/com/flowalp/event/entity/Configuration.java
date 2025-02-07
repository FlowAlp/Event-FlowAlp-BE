package com.flowalp.event.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "configuration")
public class Configuration {
    @Id
    @Column(name = "uuid", nullable = false, length = 36)
    private String uuid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "event_uuid", nullable = false)
    private Event eventUuid;

    @Column(name = "name", nullable = false)
    private String name;

    @Lob
    @Column(name = "value", nullable = false)
    private String value;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}