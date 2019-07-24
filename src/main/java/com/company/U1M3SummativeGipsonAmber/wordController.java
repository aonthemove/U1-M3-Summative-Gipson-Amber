package com.company.U1M3SummativeGipsonAmber;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class wordController {

    private Random randomGenerator;
    private List<Word> wordList;


    public Word anyWord() {
        int index = randomGenerator.nextInt(wordList.size());
        return wordList.get(index);
    }

    public wordController() {
        wordList = new ArrayList<Word>();
        wordList.add(new Word("Boolean", "A Boolean expression is a Java expression that returns a value of true or false."));
        wordList.add(new Word("String", "In Java, string is basically an object that represents sequence of char values. An array of characters works same as Java string. "));
        wordList.add(new Word("Integer", "A java object of type Integer contains a single field with an int data type"));
        wordList.add(new Word("Method", "A Java method is a collection of statements that are grouped together to perform an operation."));
        wordList.add(new Word("Objects","In Java objects are created, modified, moved, changed, and called in methods, and combine them with other objects"));
        wordList.add(new Word("Database", "Widely used to query, insert, update and modify data. "));
        wordList.add(new Word("Table","a set of data elements (values) using a model of vertical columns (identifiable by name) and horizontal rows, the cell being the unit where a row and column intersect." +
                " A table has a specified number of columns, but can have any number of rows."));
        wordList.add(new Word("Repository", " A repository is what you use to store your codebase in GitLab and change it with version control. A repository is part of a project, which has a lot of other features."));
        wordList.add(new Word("Loop", "Looping in programming languages is a feature which facilitates the execution of a set of instructions/functions repeatedly while some condition evaluates to true."));
        wordList.add(new Word("Condition","A statement that is checked in order to execute certain parts of code depending on whether the condition is true or false"));
    }
    @RequestMapping(value = "/api/word", method = {RequestMethod.GET})
    public Word getWordList() {
        int index = randomGenerator.nextInt(wordList.size());
        return wordList.get(index);

    }

}


