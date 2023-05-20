package models;

import strategies.winningStrategy.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> players;
    private Board board;
    private List<Move> move;
    private GameState gameState;
    private Player winner;
    private int nextMovePlayerIndex;

    private List<WinningStrategy> winningStrategies;











    private static Builder Builder() {
        return new Builder();
    }

    private Game(int dimensions, List<Player> players, List<WinningStrategy> winningStrategies) {
        int nextMovePlayerIndex=0;
        this.gameState=GameState.IN_PROGRESS;
        this.move=new ArrayList<>();
        this.players=players;
        this.winningStrategies=winningStrategies;
        this.board=new Board(dimensions);

    }
    public static class Builder {
        List<Player> players;
        List<WinningStrategy> winningStrategies;
        int dimensions;

        private Builder() {
            List<Player> players = new ArrayList<>();
            List<WinningStrategy> winningStrategies = new ArrayList<>();
            int dimensions = 0;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        public Builder setDimensions(int dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        public Builder addPlayer(Player player) {
            this.addPlayer(player);
            return this;
        }

        public Builder addWinningStrategies(Player player) {
            this.winningStrategies.add(winningStrategy);
            return this;
        }
    }












    public List<Player> getPlayers(){
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Move> getMove() {
        return move;
    }

    public void setMove(List<Move> move) {
        this.move = move;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public int getNextMovePlayerIndex() {
        return nextMovePlayerIndex;
    }

    public void setNextMovePlayerIndex(int nextMovePlayerIndex) {
        this.nextMovePlayerIndex = nextMovePlayerIndex;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }
}
