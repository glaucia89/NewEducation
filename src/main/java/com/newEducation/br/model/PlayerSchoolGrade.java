package com.newEducation.br.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by glaucia on 03/07/14.
 */
@Entity
public class PlayerSchoolGrade implements Serializable {


    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "year_classe")
    private Integer yearClasse;

    @Column(name = "classe")
    private Integer classe;

    @ManyToOne
    @JoinColumn(name = "fk_player")
    private Player player;

    @ManyToOne
    @JoinColumn(name = "fk_school")
    private School school;

    public PlayerSchoolGrade() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getYearClasse() {
        return yearClasse;
    }

    public void setYearClasse(Integer yearClasse) {
        this.yearClasse = yearClasse;
    }

    public Integer getClasse() {
        return classe;
    }

    public void setClasse(Integer classe) {
        this.classe = classe;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
