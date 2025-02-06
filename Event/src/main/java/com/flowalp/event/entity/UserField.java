package com.flowalp.event.entity;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "user_fields")
public class UserField {
    @Id
    @Column(name = "uuid", nullable = false, length = 36)
    private String uuid;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "field_type", nullable = false, length = 50)
    private String fieldType;

    @OneToMany(mappedBy = "fieldUuid")
    private Set<com.flowalp.event.entity.EventUserFieldAssociation> eventUserFieldAssociations = new LinkedHashSet<>();

    @OneToMany(mappedBy = "fieldUuid")
    private Set<com.flowalp.event.entity.FieldUserAssociation> fieldUserAssociations = new LinkedHashSet<>();

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

    public Set<com.flowalp.event.entity.EventUserFieldAssociation> getEventUserFieldAssociations() {
        return eventUserFieldAssociations;
    }

    public void setEventUserFieldAssociations(Set<com.flowalp.event.entity.EventUserFieldAssociation> eventUserFieldAssociations) {
        this.eventUserFieldAssociations = eventUserFieldAssociations;
    }

    public Set<com.flowalp.event.entity.FieldUserAssociation> getFieldUserAssociations() {
        return fieldUserAssociations;
    }

    public void setFieldUserAssociations(Set<com.flowalp.event.entity.FieldUserAssociation> fieldUserAssociations) {
        this.fieldUserAssociations = fieldUserAssociations;
    }

}