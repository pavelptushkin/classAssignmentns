package wheel;

import java.util.ArrayList;
import java.util.Scanner;

public class Player{
    int tempScore;
    int totalScore;

    public String getPlayerName() {
        return playerName;
    }

    String playerName;

    public Player(String playerName){
        this.playerName = playerName ;
        this.tempScore = 0;
        this.tempScore = 0;
    }

    public void setName(String name){
        this.playerName = name;
    }

}
