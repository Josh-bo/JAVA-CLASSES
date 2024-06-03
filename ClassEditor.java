import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.io.FileReader;
import java.util.Scanner;

public class ClassEditor implements ActionListener {
    JFrame frame;
    JTextArea area;
    JMenu fileMenu;
    JMenuItem newPage;
    JMenuItem openFile;
    int count;

    public ClassEditor() {
        frame = new JFrame();
        frame.setSize(new Dimension(500, 500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(new Point(500, 200));
        frame.setTitle("SimpleFrame");
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("lightOn.jpg"));
        frame.setLayout(new BorderLayout());

        area = new JTextArea(25, 50);
        area.setFont(new Font("serif", Font.BOLD, 14));
        frame.add(new JScrollPane(area));

        JMenuBar menuContainer = new JMenuBar(); // The bar where the menu can be placed
        fileMenu = new JMenu("File");

        newPage = new JMenuItem("New", 'N');
        newPage.setAccelerator(
                KeyStroke.getKeyStroke('N', Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()));
        newPage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                count += 1;
                area.setText("");
            }
        });

        openFile = new JMenuItem("Open File", 'O');
        openFile.setAccelerator(
                KeyStroke.getKeyStroke('O', Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()));
        openFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JFileChooser fopen = new JFileChooser();
                int option = fopen.showOpenDialog(frame);
                int fileToOpen = option;
                JFileChooser fileOpen = fopen;
                if (fileToOpen == JFileChooser.APPROVE_OPTION) {
                    area.setText("");
                    try {
                        Scanner scan = new Scanner(new FileReader(fileOpen.getSelectedFile().getPath()));
                        while (scan.hasNext()) {
                            area.append(scan.nextLine() + "\n");
                        }

                        frame.setTitle(fileOpen.getSelectedFile().getPath() + "- Editor");
                        // path = fileOpen.getSelectedFile().getPath();
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                    // Implement open file action here
                }
            }
        });

        fileMenu.add(newPage);
        fileMenu.add(openFile);
        menuContainer.add(fileMenu);

        frame.setJMenuBar(menuContainer);

        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        // Add your action handling code here if needed
    }

    public static void main(String[] args) {
        ClassEditor ce = new ClassEditor();
    }
}
