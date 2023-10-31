package com.bnta.word_guesser.models;

public class Reply {
    private String wordState;
    private String message;


    //default constructor
    public Reply() {
    }

    // my constructor
    public Reply(String wordState, String message) {
        this.wordState = wordState;
        this.message = message;
    }

    public String getWordState() {
        return wordState;
    }

    public void setWordState(String wordState) {
        this.wordState = wordState;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
