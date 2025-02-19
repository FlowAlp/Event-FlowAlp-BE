package com.flowalp.event.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "manager_activity_user_association", schema = "event_flowalp")
public class ManagerActivityUserAssociation {
    @Id
    @Column(name = "uuid", nullable = false, columnDefinition = "CHAR(36)")
    private String uuid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "activity_uuid", nullable = false)
    private Activity activityUuid;

    @Column(name = "user_uuid", nullable = false, length = 36)
    private String userUuid;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Activity getActivityUuid() {
        return activityUuid;
    }

    public void setActivityUuid(Activity activityUuid) {
        this.activityUuid = activityUuid;
    }

    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid;
    }

}