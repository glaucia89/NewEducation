package com.newEducation.br.model;

/**
 * Created by glaucia on 28/06/14.
 */
public class Question {

    private Long id;
    private TypeQuestion typeQuestion;
    private Hability hability;
    private String asking;
    private Integer level;

    public Question() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TypeQuestion getTypeQuestion() {
        return typeQuestion;
    }

    public void setTypeQuestion(TypeQuestion typeQuestion) {
        this.typeQuestion = typeQuestion;
    }

    public Hability getHability() {
        return hability;
    }

    public void setHability(Hability hability) {
        this.hability = hability;
    }

    public String getAsking() {
        return asking;
    }

    public void setAsking(String asking) {
        this.asking = asking;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
