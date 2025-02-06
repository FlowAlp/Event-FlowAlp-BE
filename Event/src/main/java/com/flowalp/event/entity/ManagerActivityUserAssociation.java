package com.flowalp.event.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "manager_activity_user_association")
public class ManagerActivityUserAssociation {
    @Id
    @Column(name = "uuid", nullable = false, length = 36)
    private String uuid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "activity_uuid", nullable = false)
    private com.flowalp.event.entity.Activity activityUuid;

    @Column(name = "user_uuid", nullable = false, length = 36)
    private String userUuid;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public com.flowalp.event.entity.Activity getActivityUuid() {
        return activityUuid;
    }

    public void setActivityUuid(com.flowalp.event.entity.Activity activityUuid) {
        this.activityUuid = activityUuid;
    }

    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid;
    }

}