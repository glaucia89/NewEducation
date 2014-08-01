package com.newEducation.br.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by glaucia on 03/07/14.
 */
@Entity
public class Game implements Serializable {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "date_game")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "fk_player_school")
    private PlayerSchoolGrade playerSchoolGrade;

    @ManyToOne
    @JoinColumn(name = "fk_question_game")
    private Question questionGame;

    @Column(name = "is_correct_answer")
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

