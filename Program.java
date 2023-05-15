import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Program {

    public static void main(String[] args) {
        final int[] count = {0};

        JFrame frame = new JFrame("clicker");
        JButton button = new JButton("click me");
        JLabel label = new JLabel("click counter: " + count[0]);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setSize(new Dimension(200, 200));

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count[0] = count[0] + 1;
                label.setText("click counter: " + count[0]);
            }
        });

        label.setHorizontalAlignment(0);
        frame.getContentPane().add(label, BorderLayout.CENTER);
        frame.getContentPane().add(button, BorderLayout.SOUTH);

        frame.setVisible(true);




    }
}
