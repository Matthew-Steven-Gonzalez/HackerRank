import java.util.ArrayList;

public class Game {

    private int dice1;

    private int dice2;

    private int dice3;

    private int dice4;

    private int dice5;

    Game(){}

    private static void roll(){

        int dice1=(int)(Math.random()*6+1);
        int dice2=(int)(Math.random()*6+1);
        int dice3=(int)(Math.random()*6+1);
        int dice4=(int)(Math.random()*6+1);
        int dice5=(int)(Math.random()*6+1);

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
