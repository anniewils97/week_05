package com.bnta.word_guesser.services;

import com.bnta.word_guesser.models.Game;
import com.bnta.word_guesser.models.Guess;
import com.bnta.word_guesser.models.Reply;
import com.bnta.word_guesser.repositories.GameRepository;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class GameService {

    @Autowired
    WordService wordService;

    @Autowired
    GameRepository gameRepository;

    private Game game;
    private String currentWord;
    private List<String> guessedLetters;

    public GameService() {
    }

    public Reply startNewGame(){
//        Pick a random word from wordservice
//        assign the random word to the new game
//        modify the current word to reflect the random word's length
        String targetWord = wordService.getRandomWord();
        String currentWordStatus = Strings.repeat("*", targetWord.length());
        Game game = new Game(targetWord, currentWordStatus);
        gameRepository.save(game);
//        this.currentWord = "*".repeat(targetWord.length());
        return new Reply(
                game.getCurrentState(),
                "Started new game",
                false
        );
    }

    public Reply processGuess(Guess guess, long id ){
        // create new Reply object
        Reply reply;
        Optional<Game> optionalGame = getGameById(id);

        // Check if game has started
        if (optionalGame.isEmpty()) {
            reply = new Reply(
                    null,
                    String.format("Game not found"),
                    false);
            return reply;
        }
        Game game = optionalGame.get();

//        check if game is finished
        if(game.isComplete()){
            return new Reply(
                    game.getCurrentState(),
                    "Game already complete",
                    false
            );
        }

        incrementGuesses(game);

        // check if letter has already been guessed
        if (game.getCurrentState().contains(guess.getLetter())) {
            reply = new Reply(
                    game.getCurrentState(),
                    String.format("Already found %s", guess.getLetter()
                    ), false);
            return reply;
        }
// check for incorrect guess
        if (!game.getWord().contains(guess.getLetter())) {
            gameRepository.save(game);
            return new Reply(
                    game.getCurrentState(),
                    String.format("%s is not in the word", guess.getLetter()),
                    false
            );
        }


        // process correct guess
        String runningResult = game.getWord();

        // build list of previously guessed letters
        List<String> guessedLetters = new ArrayList<>(Arrays.asList(
                game.getCurrentState().split(""))
        );

        // remove * characters
        guessedLetters.removeAll(Collections.singleton("\\*"));

        // add current guess
        guessedLetters.add(guess.getLetter());

        // update current state of game
        for (Character letter : game.getWord().toCharArray()) {
            if (!guessedLetters.contains(letter.toString())) {
                runningResult = runningResult.replace(letter, '*');
            }
        }

        game.setCurrentState(runningResult);

        // check if game won
        if (checkWinCondition(game)){
            game.setComplete(true);
            gameRepository.save(game);
            return new Reply(
                    game.getCurrentState(),
                    "Congratulations, you win!",
                    true
            );
        }

        gameRepository.save(game);

        return new Reply(
                game.getCurrentState(),
                String.format("%s is in the word", guess.getLetter()),
                true
        );
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public String getCurrentWord() {
        return currentWord;
    }

    public void setCurrentWord(String currentWord) {
        this.currentWord = currentWord;
    }

    public List<String> getGuessedLetters() {
        return guessedLetters;
    }

    public void setGuessedLetters(List<String> guessedLetters) {
        this.guessedLetters = guessedLetters;
    }


    public Optional<Game> getGameById(long id){
        return gameRepository.findById(id);
    }

    private boolean checkWinCondition(Game game){
        String gameWord = game.getWord();
        String gameState = game.getCurrentState();
        return gameWord.equals(gameState);
    }

    private void incrementGuesses(Game game){
        game.setGuesses(game.getGuesses() + 1);
    }




}