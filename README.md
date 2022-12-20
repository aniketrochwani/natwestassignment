# NatWest Group Assignment

## Rules of the game
- Player can choose either Rock, Paper or Scissor
  - The Rock beats the Scissors.
  - The Scissors beats the Paper.
  - The Paper beats the Rock
- Player has to insert integer value where  [IMPORTANT]
  - 0 is Rock
  - 1 is Paper
  - 2 is Scissor
- Values other than 0, 1 and 2 will be considered as wrong input. 

## How to run the project

- Open the project in Intellij and run `maven clean install` and run the project.
- Once server started the project will be hosted at `http://localhost:8080/swagger-ui/index.html`
- In swagger, the endpoint is listed in `game-controller`.
- The response of the API will be
  ```
  {
     "matchResponse": "Player wins", // return winner
     "playerMove": "1",              // player move
     "computerMove": "0"             // computer move
  }`

![demo4](./swagger.png?raw=true)
![demo4](./swagger1.png?raw=true)
![demo4](./swagger2.png?raw=true)