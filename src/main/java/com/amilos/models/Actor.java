package com.amilos.models;

import javax.persistence.*;
import java.util.Date;

/**
 * Actor
 */
@Entity
//@Table(name = "actor")
public class Actor {
    @Id
    @GeneratedValue
//    @Column(name = "actor_id")
    private Long actorId;

//    @Column(name = "first_name")
    private String firstName;

//    @Column(name = "last_name")
    private String lastName;

//    @Column(name = "last_update")
    private Date lastUpdate;

    private Long myInt;

    public Actor() {
    }

    public Actor(String firstName, String lastName, Date lastUpdate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastUpdate = lastUpdate;
    }

    public Long getActorId() {
        return actorId;
    }

    public void setActorId(Long actorId) {
        this.actorId = actorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Long getMyInt() {
        return myInt;
    }

    public void setMyInt(Long myInt) {
        this.myInt = myInt;
    }
}
