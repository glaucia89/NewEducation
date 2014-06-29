package com.newEducation.br.model;

/**
 * Created by glaucia on 28/06/14.
 */
public class PlayerSchoolGrade {

    private Long id;
    private Integer yearClasse;
    private Integer classe;
    private Player player;
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
