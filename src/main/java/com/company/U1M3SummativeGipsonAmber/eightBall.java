package com.company.U1M3SummativeGipsonAmber;

import javax.validation.constraints.NotEmpty;

public class eightBall {
    public eightBall(){}
    @NotEmpty
    private String question;
    @NotEmpty
    private String answer;

    eightBall(String question, String answer){
        this.question=question;
        this.answer= answer;

    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}

