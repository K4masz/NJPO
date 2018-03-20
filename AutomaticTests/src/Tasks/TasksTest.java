package Tasks;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TasksTest {

    @Test
    void quadricEquation() {
        ArrayList<Double> roots = new ArrayList<>();
        roots.add(1.8402657631320494);
        roots.add(-2.1735990964653826);

        ArrayList result = Tasks.quadricEquation(3, 1, -12);
        assertEquals(result.get(0), Tasks.quadricEquation(3, 1, -12).get(0), "3x^2 + 3x + 3 = 0");
    }


    @Test
    void randomAndSort() {
        System.nanoTime();
        Tasks.randomAndSort();
    }
}