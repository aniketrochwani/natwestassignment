package com.example.natwestassignment.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Service
public class PlayGameService {

    Logger logger = LoggerFactory.getLogger(PlayGameService.class);
    public ResponseEntity<Object> playGame(long move){
        // lets assume the following
        // 0 -> Rock
        // 1 -> Paper
        // 2 -> Scissor

        if(move >= 0 && move <=2){
            logger.info("Correct move is inserted by the user");
            // Generate random number from range 0 to 2
            Random random = new Random();
            long computerMove = random.nextInt(3);

            Map<String, String> gameStats = new HashMap<>();
            gameStats.put("playerMove", move+"");
            gameStats.put("computerMove", computerMove+"");

            if(move == computerMove){
                gameStats.put("matchResponse", "It is a tie");
            }
            else if((move == 0 && computerMove == 2) || (move == 1 && computerMove == 0) || (move == 2 && computerMove == 1)){
                gameStats.put("matchResponse", "Player wins");
            }else {
                gameStats.put("matchResponse", "Computer wins");
            }

            logger.info("match response has been generated and sent to the user");
            return new ResponseEntity<>(gameStats, HttpStatus.OK);
        }else{

            logger.error("incorrect move is inserted by the user");
            return new ResponseEntity<>("Wrong Move: you can choose from 0, 1 and 2. O is Rock, 1 is paper and 2 is scissor", HttpStatus.OK);
        }

    }
}
