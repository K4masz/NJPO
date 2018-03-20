/*
 * Created by JFormDesigner on Thu Jan 18 16:37:59 CET 2018
 */

package Factorial;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * @author K4masz
 */
public class Factorial extends JFrame {
    public Factorial() {
        initComponents();
    }

    private void recursivelyActionPerformed(ActionEvent e) {
        int num = Integer.parseInt(resultField.getText());
        FRecursion fRecursion = new FRecursion(num);
        fRecursion.run();
        resultField.setText(Integer.toString(fRecursion.getResult()));
    }

    private void iterativelyActionPerformed(ActionEvent e) {
        int num = Integer.parseInt(resultField.getText());
        FIteration fIteration = new FIteration(num);
        fIteration.run();
        resultField.setText(Integer.toString(fIteration.getResult()));
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - John Doe
        recursively = new JButton();
        iteratively = new JButton();
        Abortion = new JButton();
        resultField = new JTextField();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- recursively ----
        recursively.setText("Recursion");
        recursively.addActionListener(e -> recursivelyActionPerformed(e));
        contentPane.add(recursively);
        recursively.setBounds(new Rectangle(new Point(20, 15), recursively.getPreferredSize()));

        //---- iteratively ----
        iteratively.setText("Iteration");
        iteratively.addActionListener(e -> iterativelyActionPerformed(e));
        contentPane.add(iteratively);
        iteratively.setBounds(new Rectangle(new Point(190, 15), iteratively.getPreferredSize()));

        //---- Abortion ----
        Abortion.setText("Abort");
        contentPane.add(Abortion);
        Abortion.setBounds(new Rectangle(new Point(115, 70), Abortion.getPreferredSize()));
        contentPane.add(resultField);
        resultField.setBounds(30, 130, 245, resultField.getPreferredSize().height);

        { // compute preferred size
            Dimension preferredSize = new Dimension();
            for (int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - John Doe
    private JButton recursively;
    private JButton iteratively;
    private JButton Abortion;
    private JTextField resultField;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
