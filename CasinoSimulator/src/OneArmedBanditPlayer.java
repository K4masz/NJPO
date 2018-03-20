import java.util.Random;

/**
 * Created by K4masz on 2017-10-21.
 */
public class OneArmedBanditPlayer extends Player {


    OneArmedBanditPlayer(String name) {
        super(name);
    }

    OneArmedBanditPlayer(String name, int cash) {
        super(name, cash);
    }

    @Override
    void play() {
        String alphabet = "abcd";
        char[] board = new char[3];
        Random machine = new Random();
        for(int i = 0; i< board.length; i++){
            board[i] = alphabet.charAt(machine.nextInt(3));
        }

        
    }

   /* @Override
    void play() {
        if (new Random().nextBoolean()) {
            System.out.println("XXX won");
            Casino.getInstance().givePlayerMoney(this.getName(), 100);
        } else {
            System.out.println("XYZ bust");
            Casino.getInstance().takePlayerMoney(this.getName(), 100);
        }

    }
*/
}
