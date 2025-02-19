package com.flowalp.event.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_fields", schema = "event_flowalp")
public class UserField {
    @Id
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