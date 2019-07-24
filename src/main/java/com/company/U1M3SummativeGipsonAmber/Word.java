package com.company.U1M3SummativeGipsonAmber;

import javax.validation.constraints.NotEmpty;

public class Word {
    public Word(){}
    @NotEmpty
    private String word;
    @NotEmpty
    private String definition;

    public Word (String word, String definition){
        this.word= word;
        this.definition= definition;

    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }
}

