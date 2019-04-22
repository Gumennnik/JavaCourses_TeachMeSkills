package TicTackToe;

public class Player {

    private char playerSymbol;
    private String playerName;

    public Player(char playerSymbol, String playerName) {
        this.playerSymbol = playerSymbol;
        this.playerName = playerName;
    }

    public char getPlayerSymbol() {
        return playerSymbol;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}