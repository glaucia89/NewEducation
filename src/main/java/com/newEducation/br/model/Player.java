package com.newEducation.br.model;

import java.util.Date;

/**
 * Created by glaucia on 28/06/14.
 */
public class Player {

    private Long id;
    private Date dateOfBirth;
    private Gender gender;
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
