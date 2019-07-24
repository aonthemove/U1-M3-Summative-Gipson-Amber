package com.company.U1M3SummativeGipsonAmber;

import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotEmpty;

@RestController
public class Quote {

    public Quote(){}
    @NotEmpty
    private String quote;
    @NotEmpty
    private String author;

    public Quote (String quote, String author){
        this.quote=quote;
        this.author= author;

    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
 }
