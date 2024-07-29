import javax.swing.*;
import java.awt.*;

public class currecaljf {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("currecaljf");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new FlowLayout());
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel();
        JButton button = new JButton();
        button.setText("Button");
        panel.add(label);
        frame.add(panel);
        panel.add(button);
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
