package com.newEducation.br.model;


import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by glaucia on 03/07/14.
 */
@Entity
@Table(name = "ne_school")
public class School implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "ID_seq")
    @SequenceGenerator(sequenceName = "ne_school_id_seq", name = "ID_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "city")
    private City city;

    @Column(name = "state")
    private State state;

    public School() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

}
