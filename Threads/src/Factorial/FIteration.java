package Factorial;

public class FIteration implements Runnable {

    long duration;
    int number;
    int result;

    public FIteration(int number) {
        System.out.println("Factorial using iteration...");
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
        int temp = 1;
        for(int i = 1; i <= number; i++){
            temp *= i;
        }
        return temp;
    }

    public long getTime() {
        return duration;
    }

    public int getResult() {
        return result;
    }
}
