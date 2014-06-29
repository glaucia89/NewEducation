package com.newEducation.br.model;

import java.util.Date;

/**
 * Created by glaucia on 28/06/14.
 */
public class Game {

    private Long id;
    private Date date;
    private PlayerSchoolGrade playerSchoolGrade;
    private Question questionGame;
    private Boolean isCorrectAnswer;

    public Game() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public PlayerSchoolGrade getPlayerSchoolGrade() {
        return playerSchoolGrade;
    }

    public void setPlayerSchoolGrade(PlayerSchoolGrade playerSchoolGrade) {
        this.playerSchoolGrade = playerSchoolGrade;
    }

    public Question getQuestionGame() {
        return questionGame;
    }

    public void setQuestionGame(Question questionGame) {
        this.questionGame = questionGame;
    }

    public Boolean getIsCorrectAnswer() {
        return isCorrectAnswer;
    }

    public void setIsCorrectAnswer(Boolean isCorrectAnswer) {
        this.isCorrectAnswer = isCorrectAnswer;
    }
}
