import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class RunningButton {

    private JPanel panel1;
    private JButton button1;
    private Random rand;

    RunningButton() {

        rand = new Random();

        button1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                button1.setLocation(
                        rand.nextInt(
                                panel1.getWidth()),
                        rand.nextInt(panel1.getHeight())
                );
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("RunningButton");
        frame.setContentPane(new RunningButton().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }
}
