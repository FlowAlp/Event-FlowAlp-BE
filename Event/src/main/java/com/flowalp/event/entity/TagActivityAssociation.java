package com.flowalp.event.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tag_activity_association")
public class TagActivityAssociation {
    @Id
    @Column(name = "uuid", nullable = false, length = 36)
    private String uuid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tag_uuid", nullable = false)
    private com.flowalp.event.entity.Tag tagUuid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "activity_uuid", nullable = false)
    private com.flowalp.event.entity.Activity activityUuid;

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

    public com.flowalp.event.entity.Activity getActivityUuid() {
        return activityUuid;
    }

    public void setActivityUuid(com.flowalp.event.entity.Activity activityUuid) {
        this.activityUuid = activityUuid;
    }

}