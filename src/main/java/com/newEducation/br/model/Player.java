package com.newEducation.br.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by glaucia on 03/07/14.
 */
@Entity
public class Player implements Serializable {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Column(name = "gender")
    private Gender gender;

    @ManyToOne
    @JoinColumn(name = "fk_user")
    private User userPlayer;

    public Player() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public User getUserPlayer() {
        return userPlayer;
    }

    public void setUserPlayer(User userPlayer) {
        this.userPlayer = userPlayer;
    }
}
