import Factorial.Factorial;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame fac = new Factorial();
        fac.setVisible(true);

        ZipBomb[] bombs = new ZipBomb[10];
        for(int i = 0; i<10; i++){
            bombs[i] = new ZipBomb(i);
            bombs[i].run();
        }
    }
}