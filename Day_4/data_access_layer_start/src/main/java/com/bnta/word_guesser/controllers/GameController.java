package com.bnta.word_guesser.controllers;

import com.bnta.word_guesser.models.Guess;
import com.bnta.word_guesser.models.Reply;
import com.bnta.word_guesser.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    GameService gameService;

    @PostMapping
    public ResponseEntity<Reply> newGame(){
        Reply reply = gameService.startNewGame();
        return new ResponseEntity<>(reply, HttpStatus.CREATED);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Reply> getGameStatus(@PathVariable long id){
        Reply reply;

        if (gameService.getGame() == null){
            reply = new Reply(
                    gameService.getCurrentWord(),
                    "Game has not been started",
                    false
            );
        } else {
            reply = new Reply(
                    gameService.getCurrentWord(),
                    "Game in progress",
                    false
            );
        }

        return new ResponseEntity<>(reply, HttpStatus.OK);
    }

    @PatchMapping
    public ResponseEntity<Reply> handleGuess(@RequestBody Guess guess){
        Reply reply = gameService.processGuess(guess);
        return new ResponseEntity<>(reply, HttpStatus.OK);
    }

}
