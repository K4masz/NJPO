import FrequencyAnalyzer.FrequencyAnalyzer;
import TimeComparison.TimeComparison;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        TimeComparison.beginComparison();

        JFrame frame = new FrequencyAnalyzer();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}