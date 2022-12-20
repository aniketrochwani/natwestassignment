package com.example.natwestassignment.api;

import com.example.natwestassignment.service.PlayGameService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api")
@RestController
public class GameController {

    Logger logger = LoggerFactory.getLogger(GameController.class);
    @Autowired
    PlayGameService playGameService;

    @ApiOperation(value = "API to play rock, paper, scissor game. You can choose from 0, 1 and 2. 0 is Rock, 1 is paper and 2 is scissor")
    @GetMapping("/playgame")
    public ResponseEntity<Object> playGame(@RequestParam Long move){
        logger.info("Passed move to PlayGameService");
        return playGameService.playGame(move);
    }
}
