package Interfaces.Ex3.GameTest;

import java.util.Random;

import static Print.Print.print;

interface Game {
    void play();
}

interface GameFactory {
    Game getGame();
}

class CoinToss implements Game {
    @Override
    public void play() {
        Random random = new Random();
        int coin = random.nextInt();
        if (coin % 2 == 0) {
            System.out.println("Орел");
        } else System.out.println("Решко");
    }
}

class DiceToss implements Game {
    @Override
    public void play() {
        Random random = new Random();
        int dice = random.nextInt(6) + 1;
        switch (dice) {
            case 1:
                print("one");
                break;
            case 2:
                print("two");
                break;
            case 3:
                print("three");
                break;
            case 4:
                print("four");
                break;
            case 5:
                print("five");
                break;
            case 6:
                print("six");
                break;
            default:
                print("default");
        }
    }
}

class ImplementationCoin implements GameFactory {
    @Override
    public Game getGame() {
        return new CoinToss();
    }
}
class  ImplementationDice implements GameFactory{
    @Override
    public Game getGame() {
        return new DiceToss();
    }
}

public class GameTest {
    public  static void gamePlay(GameFactory gm){
        Game game=gm.getGame();
        game.play();
    }

    public static void main(String[] args) {
        gamePlay(new ImplementationCoin() );
        gamePlay(new ImplementationDice());
    }
}
