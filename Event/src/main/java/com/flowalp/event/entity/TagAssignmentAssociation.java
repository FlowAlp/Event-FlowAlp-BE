package com.flowalp.event.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tag_assignment_association")
public class TagAssignmentAssociation {
    @Id
    @Column(name = "uuid", nullable = false, length = 36)
    private String uuid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tag_uuid", nullable = false)
    private Tag tagUuid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "assignment_uuid", nullable = false)
    private Assignment assignmentUuid;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Tag getTagUuid() {
        return tagUuid;
    }

    public void setTagUuid(Tag tagUuid) {
        this.tagUuid = tagUuid;
    }

    public Assignment getAssignmentUuid() {
        return assignmentUuid;
    }

    public void setAssignmentUuid(Assignment assignmentUuid) {
        this.assignmentUuid = assignmentUuid;
    }

}