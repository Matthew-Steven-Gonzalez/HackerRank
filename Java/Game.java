import java.util.ArrayList;

public class Game {

    static private int dice1;

    static private int dice2;

    static private int dice3;

    static private int dice4;

    static private int dice5;

    Game() {
    }

    private static void roll() {

        // dice construct of six sided dice.
        dice1 = (int) (Math.random() * 6 + 1);
        dice2 = (int) (Math.random() * 6 + 1);
        dice3 = (int) (Math.random() * 6 + 1);
        dice4 = (int) (Math.random() * 6 + 1);
        dice5 = (int) (Math.random() * 6 + 1);

        ArrayList<Integer> diceArray = new ArrayList<>();

        diceArray.add(dice1);
        diceArray.add(dice2);
        diceArray.add(dice3);
        diceArray.add(dice4);
        diceArray.add(dice5);

        System.out.println(diceArray);

    };

    public static void main(String[] args) {
        roll();
    }

}
