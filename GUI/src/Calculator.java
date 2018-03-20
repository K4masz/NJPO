import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by K4masz on 2017-12-09.
 */
public class Calculator {
    private JTextField textField1;
    private JTextField textField2;
    private JPanel panel1;
    private JButton executeButton;
    private JRadioButton divisionRadioButton;
    private JRadioButton additionRadioButton;
    private JRadioButton multiplicationRadioButton;
    private JRadioButton substractionRadioButton;
    private ButtonGroup operations;
    private JLabel resultLabel;

    public Calculator() {
        operations = new ButtonGroup();

        operations.add(additionRadioButton);
        operations.add(substractionRadioButton);
        operations.add(multiplicationRadioButton);
        operations.add(divisionRadioButton);

        additionRadioButton.setActionCommand("add");
        substractionRadioButton.setActionCommand("substract");
        multiplicationRadioButton.setActionCommand("multiply");
        divisionRadioButton.setActionCommand("divide");


        executeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (operations.getSelection().getActionCommand()) {
                    case "add": {
                        resultLabel.setText(Integer.toString(Integer.parseInt(textField1.getText()) + Integer.parseInt(textField2.getText())));
                        break;
                    }
                    case "substract": {
                        resultLabel.setText(Integer.toString(Integer.parseInt(textField1.getText()) - Integer.parseInt(textField2.getText())));
                        break;
                    }
                    case "multiply": {
                        resultLabel.setText(Integer.toString(Integer.parseInt(textField1.getText()) * Integer.parseInt(textField2.getText())));
                        break;
                    }
                    case "divide": {
                        resultLabel.setText(Integer.toString(Integer.parseInt(textField1.getText()) / Integer.parseInt(textField2.getText())));
                        break;
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
