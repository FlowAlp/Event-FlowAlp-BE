package com.flowalp.event.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tag_activity_association", schema = "event_flowalp")
public class TagActivityAssociation {
    @Id
    @Column(name = "uuid", nullable = false, columnDefinition = "CHAR(36)")
    private String uuid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tag_uuid", nullable = false)
    private Tag tagUuid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "activity_uuid", nullable = false)
    private Activity activityUuid;

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

    public Activity getActivityUuid() {
        return activityUuid;
    }

    public void setActivityUuid(Activity activityUuid) {
        this.activityUuid = activityUuid;
    }

}