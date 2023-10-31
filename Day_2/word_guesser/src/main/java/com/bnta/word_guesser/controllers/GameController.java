package com.bnta.word_guesser.controllers;

import com.bnta.word_guesser.models.Game;
import com.bnta.word_guesser.models.Reply;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @GetMapping // route is localhost:8080/games, this end point is listening for request from this database(?)
    public Reply newGame(){
        Game game = new Game("hello");
        return new Reply("*****", "New game started");
    }
}
