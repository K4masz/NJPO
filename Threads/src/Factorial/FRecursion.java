package Factorial;

public class FRecursion implements Runnable {

    long duration;
    int number;
    int result;

    public FRecursion(int number) {
        System.out.println("Factorial using recursion...");
        this.number = number;
    }

    @Override
    public void run() {
        long start = 0, stop = 0;
        start = System.nanoTime();
        this.result = calculateFactorial(this.number);
        stop = System.nanoTime();
        this.duration = stop - start;
    }

    private int calculateFactorial(int number) {
        if (number == 0) {
            return 1;
        } else {
            return number * calculateFactorial(number - 1);
        }
    }

    public long getTime() {
        return duration;
    }

    public int getResult() {
        return result;
    }
}
