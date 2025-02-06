package com.flowalp.event.entity;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "tag")
public class Tag {
    @Id
    @Column(name = "uuid", nullable = false, length = 36)
    private String uuid;

    @Column(name = "name", nullable = false)
    private String name;

    @Lob
    @Column(name = "description")
    private String description;

    @Column(name = "color", nullable = false, length = 7)
    private String color;

    @OneToMany(mappedBy = "tagUuid")
    private Set<com.flowalp.event.entity.TagActivityAssociation> tagActivityAssociations = new LinkedHashSet<>();

    @OneToMany(mappedBy = "tagUuid")
    private Set<com.flowalp.event.entity.TagAssignmentAssociation> tagAssignmentAssociations = new LinkedHashSet<>();

    @OneToMany(mappedBy = "tagUuid")
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Set<com.flowalp.event.entity.TagActivityAssociation> getTagActivityAssociations() {
        return tagActivityAssociations;
    }

    public void setTagActivityAssociations(Set<com.flowalp.event.entity.TagActivityAssociation> tagActivityAssociations) {
        this.tagActivityAssociations = tagActivityAssociations;
    }

    public Set<com.flowalp.event.entity.TagAssignmentAssociation> getTagAssignmentAssociations() {
        return tagAssignmentAssociations;
    }

    public void setTagAssignmentAssociations(Set<com.flowalp.event.entity.TagAssignmentAssociation> tagAssignmentAssociations) {
        this.tagAssignmentAssociations = tagAssignmentAssociations;
    }

    public Set<com.flowalp.event.entity.TagUserAssociation> getTagUserAssociations() {
        return tagUserAssociations;
    }

    public void setTagUserAssociations(Set<com.flowalp.event.entity.TagUserAssociation> tagUserAssociations) {
        this.tagUserAssociations = tagUserAssociations;
    }

}