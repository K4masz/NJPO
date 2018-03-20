package Tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Tasks {

    public static ArrayList quadricEquation(int a, int b, int c) {
        ArrayList<Double> roots = new ArrayList();
        double delta = Math.pow(b, 2) - 4 * a * c;
        double temp1 = Math.sqrt(delta);

        if (a > 0) {
            roots.add((-b + temp1) / (2 * a));
            roots.add((-b - temp1) / (2 * a));
        } else if (a == 0) {
            roots.add((double) (-b / (2 * a)));
        }
        return roots;
    }

    public static ArrayList<Integer> randomAndSort(int howManyNumbers) {
        Random rand = new Random();
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < howManyNumbers; i++)
            temp.add(rand.nextInt(9000001) + 1000000);

        Collections.sort(temp);
        return temp;
    }
}