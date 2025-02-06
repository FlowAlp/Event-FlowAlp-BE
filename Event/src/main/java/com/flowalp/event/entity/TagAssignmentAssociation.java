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
    private com.flowalp.event.entity.Tag tagUuid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "assignment_uuid", nullable = false)
    private com.flowalp.event.entity.Assignment assignmentUuid;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public com.flowalp.event.entity.Tag getTagUuid() {
        return tagUuid;
    }

    public void setTagUuid(com.flowalp.event.entity.Tag tagUuid) {
        this.tagUuid = tagUuid;
    }

    public com.flowalp.event.entity.Assignment getAssignmentUuid() {
        return assignmentUuid;
    }

    public void setAssignmentUuid(com.flowalp.event.entity.Assignment assignmentUuid) {
        this.assignmentUuid = assignmentUuid;
    }

}