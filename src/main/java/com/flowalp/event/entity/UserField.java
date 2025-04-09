package com.flowalp.event.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user_fields", schema = "event_flowalp")
public class UserField {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "uuid", nullable = false, columnDefinition = "CHAR(36)")
    private String uuid;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "field_type", nullable = false, length = 50)
    private String fieldType;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

}