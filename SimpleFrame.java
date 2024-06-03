import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleFrame implements ActionListener {
    JLabel label;
    boolean state = true;

    public SimpleFrame() {
        JFrame frame = new JFrame();
        frame.setSize(new Dimension(500, 500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(new Point(500, 200));
        frame.setTitle("SimpleFrame");
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("lightOn.jpg"));
        frame.setLayout(new FlowLayout());
        label = new JLabel("This is a java GUI class");
        frame.add(label);
        JButton but = new JButton("Change Text");
        but.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (state) {
                    label.setText("He don burst 😂😎👍...");
                    state = false;
                } else {
                    label.setText("This is a java GUI class");
                    state = true;
                }
            }
        });
        frame.add(but);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        SimpleFrame fr = new SimpleFrame();
    }

}
