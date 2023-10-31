package com.bnta.word_guesser.models;

public class Game {
    private String word;
    private int guesses;
    private boolean complete;


    //Spring needs a default constructor, it'll construct the object using the getters and setters we give it

    /*
    The inclusion of two constructors, one being a default (no-argument) constructor,
    is not specifically related to Spring. It's a common practice in Java when working with
    Plain Old Java Objects (POJOs) and is a good programming practice for a few reasons:

1. **No-Argument Constructor**: The default constructor is often included to ensure that you can
create an instance of the class without having to provide any initial values. This can be useful when
you want to create an empty object and set its properties later. It's also helpful in scenarios
where frameworks like Spring need to create instances of the class through reflection.

2. **Parameterized Constructor**: The constructor with parameters allows you to set the initial
values of the object's attributes when you create an instance. This is particularly useful
when you want to create a fully initialized object right away.

For instance, when using frameworks like Spring, the no-argument constructor is commonly used
because Spring often initializes objects by calling the default constructor and then
setting properties via setters. However, the parameterized constructor is still valuable
for situations where you want to create an object with specific initial values right from the
start, without the need for separate setter calls.

In summary, including both constructors provides flexibility in how you create and work with
instances of the class. It's a general Java best practice rather than something specific to Spring.
    */

    public Game() {
    }

    // we need a constructor so we can make a game ourselves and use it in our program
    public Game(String word) {
        this.word = word;
        this.guesses = 0;
        this.complete = false;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getGuesses() {
        return guesses;
    }

    public void setGuesses(int guesses) {
        this.guesses = guesses;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }
}
