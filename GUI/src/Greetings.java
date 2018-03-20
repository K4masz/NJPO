import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by K4masz on 2017-12-09.
 */
public class Greetings {
    private JButton OKButton;
    private JPanel panel1;
    private JTextField textField1;
    private JLabel header;


    public Greetings() {
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!(textField1.getText().isEmpty())){
                    header.setText("Witaj, " + textField1.getText() + " :)");
                }

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Greetings");
        frame.setContentPane(new Greetings().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
