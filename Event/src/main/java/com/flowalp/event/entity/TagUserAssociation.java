package com.flowalp.event.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tag_user_association")
public class TagUserAssociation {
    @Id
    @Column(name = "uuid", nullable = false, length = 36)
    private String uuid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tag_uuid", nullable = false)
    private com.flowalp.event.entity.Tag tagUuid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_uuid", nullable = false)
    private com.flowalp.event.entity.User userUuid;

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

    public com.flowalp.event.entity.User getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(com.flowalp.event.entity.User userUuid) {
        this.userUuid = userUuid;
    }

}