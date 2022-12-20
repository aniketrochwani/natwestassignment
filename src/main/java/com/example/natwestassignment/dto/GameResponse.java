package com.example.natwestassignment.dto;

public class GameResponse {
    public long playerMove;

    public long getPlayerMove() {
        return playerMove;
    }

    public void setPlayerMove(long playerMove) {
        this.playerMove = playerMove;
    }

    public long getComputerMove() {
        return computerMove;
    }

    public void setComputerMove(long computerMove) {
        this.computerMove = computerMove;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public long computerMove;

    public String response;
}
