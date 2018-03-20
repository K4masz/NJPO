/*
 * Created by JFormDesigner on Tue Jan 16 20:47:04 CET 2018
 */

package FrequencyAnalyzer;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/**
 * @author K4masz
 */
public class FrequencyAnalyzer extends JFrame {

    public FrequencyAnalyzer() {
        initComponents();
    }

    private void openActionPerformed(ActionEvent e) {
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                // What to do with the file, e.g. display it in a TextArea
                textArea.read(new FileReader(file.getAbsolutePath()), null);

            } catch (IOException ex) {
                System.out.println("problem accessing file" + file.getAbsolutePath());
            }
        } else {
            System.out.println("File access cancelled by user.");
        }
    }

    private void exitActionPerformed(ActionEvent e) {
        System.exit(0);
    }

    private void analyzeActionPerformed(ActionEvent e) {
        HashMap<Character, Integer> analyzedText = analyze(textArea.getText());
        StringBuilder sb = new StringBuilder();
        Iterator iterator = analyzedText.keySet().iterator();
        while (iterator.hasNext()) {
            Character key = (Character) iterator.next();
            sb.append(key.charValue() + " " + analyzedText.get(key) +"\n");
        }

        resultArea.setText(sb.toString());
        analyzeResult.setVisible(true);
    }

    private HashMap<Character, Integer> analyze(String text) {
        HashMap<Character, Integer> temp = new HashMap<Character, Integer>();
        for (int i = 0; i < text.length(); i++) {
            Character sign = Character.toLowerCase(text.charAt(i));
            if (!temp.containsKey(sign))
                temp.putIfAbsent(sign, 1);
            else {
                Integer quantity = temp.get(sign);
                temp.put(sign, temp.get(sign)+1 );
            }
        }
        return temp;
    }

    private void okBtnActionPerformed(ActionEvent e) {
        analyzeResult.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - John Doe
        menuBar1 = new JMenuBar();
        menu1 = new JMenu();
        open = new JMenuItem();
        exit = new JMenuItem();
        analyze = new JMenuItem();
        textArea = new JTextArea();
        fileChooser = new JFileChooser();
        analyzeResult = new JDialog();
        okBtn = new JButton();
        resultArea = new JTextArea();

        //======== this ========
        setMinimumSize(new Dimension(100, 100));
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== menuBar1 ========
        {

            //======== menu1 ========
            {
                menu1.setText("File");

                //---- open ----
                open.setText("Open");
                open.addActionListener(e -> openActionPerformed(e));
                menu1.add(open);

                //---- exit ----
                exit.setText("Exit");
                exit.addActionListener(e -> exitActionPerformed(e));
                menu1.add(exit);
            }
            menuBar1.add(menu1);

            //---- analyze ----
            analyze.setText("Analyze");
            analyze.addActionListener(e -> analyzeActionPerformed(e));
            menuBar1.add(analyze);
        }
        setJMenuBar(menuBar1);

        //---- textArea ----
        textArea.setTabSize(9);
        textArea.setMinimumSize(new Dimension(100, 100));
        contentPane.add(textArea);
        textArea.setBounds(7, 7, 697, 478);

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

        //---- fileChooser ----
        fileChooser.setDialogTitle("Choosing a file");
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.setFileFilter(new TextFileFilter());

        //======== analyzeResult ========
        {
            Container analyzeResultContentPane = analyzeResult.getContentPane();
            analyzeResultContentPane.setLayout(null);

            //---- okBtn ----
            okBtn.setText("OK");
            okBtn.addActionListener(e -> okBtnActionPerformed(e));
            analyzeResultContentPane.add(okBtn);
            okBtn.setBounds(new Rectangle(new Point(90, 260), okBtn.getPreferredSize()));
            analyzeResultContentPane.add(resultArea);
            resultArea.setBounds(5, 5, 225, 255);

            { // compute preferred size
                Dimension preferredSize = new Dimension();
                for (int i = 0; i < analyzeResultContentPane.getComponentCount(); i++) {
                    Rectangle bounds = analyzeResultContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = analyzeResultContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                analyzeResultContentPane.setMinimumSize(preferredSize);
                analyzeResultContentPane.setPreferredSize(preferredSize);
            }
            analyzeResult.pack();
            analyzeResult.setLocationRelativeTo(analyzeResult.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - John Doe
    private JMenuBar menuBar1;
    private JMenu menu1;
    private JMenuItem open;
    private JMenuItem exit;
    private JMenuItem analyze;
    private JTextArea textArea;
    private JFileChooser fileChooser;
    private JDialog analyzeResult;
    private JButton okBtn;
    private JTextArea resultArea;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    class TextFileFilter extends FileFilter {

        @Override
        public boolean accept(File f) {
            if(f.isDirectory()) return true;
            else if(f.getName().endsWith(".txt")) return true;
            else return false;
        }



        @Override
        public String getDescription() {
            return "Text File (*.txt)";
        }
    }
}