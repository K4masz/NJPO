import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;

public class PESELVerifier {


    private JPanel panel1;
    private JButton verifyButton;
    private JLabel labelek;
    private JTextField textField1;
    private BufferedWriter bf;


    PESELVerifier() {
        try {
            bf = new BufferedWriter(new FileWriter("Numbers.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        NumberFormatter formatter = new NumberFormatter(NumberFormat.getInstance());
        formatter.setValueClass(Integer.class);
        formatter.setMinimum(0);
        formatter.setMaximum(Integer.MAX_VALUE);




        verifyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                char[] temp = textField1.getText().toCharArray();
                int[] nums = new int[temp.length];

                for (int i = 0; i < temp.length - 1; i++)
                    nums[i] = Character.getNumericValue(temp[i]);

                if (verify(nums))
                    saveToFile(nums);

            }
        });
    }


    private void saveToFile(int[] tab) {
        String temp = "";
        for (int i = 0; i < tab.length; i++)
            temp += Integer.toString(tab[i]);

        try {
            bf.write(temp);
            bf.newLine();
            bf.close();

        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("PESELVerifier");
        frame.setContentPane(new PESELVerifier().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }

    public boolean verify(int[] tab) {
        int sum = 9 * tab[0] + 7 * tab[1] + 3 * tab[2] + tab[3] + 9 * tab[4] + 7 * tab[5] + 3 * tab[6] + tab[7] + 9 * tab[8] + 7 * tab[9];

        if (tab[10] == (sum % 10)) {
            labelek.setText("PESEL POPRAWNY");
            return true;
        } else {
            labelek.setText("PESEL NIEPOPRAWNY");
            return false;
        }

    }
}
