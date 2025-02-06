package com.flowalp.event.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "uuid", nullable = false, length = 36)
    private String uuid;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "birth_date", nullable = false)
    private LocalDate birthDate;

    @ColumnDefault("'user'")
    @Lob
    @Column(name = "role", nullable = false)
    private String role;

    @Column(name = "parent_uuid", length = 36)
    private String parentUuid;

    @OneToMany(mappedBy = "userUuid")
    private Set<com.flowalp.event.entity.AssignmentUserAssociation> assignmentUserAssociations = new LinkedHashSet<>();

    @OneToMany(mappedBy = "userUuid")
    private Set<com.flowalp.event.entity.FieldUserAssociation> fieldUserAssociations = new LinkedHashSet<>();

    @OneToMany(mappedBy = "userUuid")
    private Set<com.flowalp.event.entity.TagUserAssociation> tagUserAssociations = new LinkedHashSet<>();

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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getParentUuid() {
        return parentUuid;
    }

    public void setParentUuid(String parentUuid) {
        this.parentUuid = parentUuid;
    }

    public Set<com.flowalp.event.entity.AssignmentUserAssociation> getAssignmentUserAssociations() {
        return assignmentUserAssociations;
    }

    public void setAssignmentUserAssociations(Set<com.flowalp.event.entity.AssignmentUserAssociation> assignmentUserAssociations) {
        this.assignmentUserAssociations = assignmentUserAssociations;
    }

    public Set<com.flowalp.event.entity.FieldUserAssociation> getFieldUserAssociations() {
        return fieldUserAssociations;
    }

    public void setFieldUserAssociations(Set<com.flowalp.event.entity.FieldUserAssociation> fieldUserAssociations) {
        this.fieldUserAssociations = fieldUserAssociations;
    }

    public Set<com.flowalp.event.entity.TagUserAssociation> getTagUserAssociations() {
        return tagUserAssociations;
    }

    public void setTagUserAssociations(Set<com.flowalp.event.entity.TagUserAssociation> tagUserAssociations) {
        this.tagUserAssociations = tagUserAssociations;
    }

}