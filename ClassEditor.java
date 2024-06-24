import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileReader;
import java.util.Scanner;

public class ClassEditor implements ActionListener {
    JFrame frame;
    JTextArea area;
    JMenu fileMenu;
    JMenuItem newPage;
    JMenuItem openFile;
    JMenuItem exit;
    int count;
    String path; // Assuming this is a class variable that holds the current file path

    public ClassEditor() {
        frame = new JFrame("SimpleFrame");
        frame.setSize(new Dimension(500, 500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(new Point(500, 200));
        frame.setTitle("SimpleFrame");
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("lightOn.jpg"));
        frame.setLayout(new BorderLayout());

        area = new JTextArea(25, 50);
        area.setFont(new Font("serif", Font.BOLD, 14));
        frame.add(new JScrollPane(area));

        JMenuBar menuContainer = new JMenuBar();
        fileMenu = new JMenu("File");

        newPage = new JMenuItem("New", 'N');
        newPage.setAccelerator(KeyStroke.getKeyStroke('N', Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()));
        newPage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                count += 1;
                area.setText("");
            }
        });

        openFile = new JMenuItem("Open File", 'O');
        openFile.setAccelerator(KeyStroke.getKeyStroke('O', Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()));
        openFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JFileChooser fopen = new JFileChooser();
                int option = fopen.showOpenDialog(frame);
                if (option == JFileChooser.APPROVE_OPTION) {
                    area.setText("");
                    try {
                        Scanner scan = new Scanner(new FileReader(fopen.getSelectedFile().getPath()));
                        while (scan.hasNext()) {
                            area.append(scan.nextLine() + "\n");
                        }
                        frame.setTitle(fopen.getSelectedFile().getPath() + " - Editor");
                        path = fopen.getSelectedFile().getPath();
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                }
            }
        });

        exit = new JMenuItem("Exit");
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.ALT_MASK));
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int option = JOptionPane.showOptionDialog(null, "Do you wish to save?", "Warning",
                        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, null, null);
                if (option == JOptionPane.YES_OPTION) {
                    if (path == null) {
                        saveAsFile();
                    } else {
                        saveFile();
                    }
                    System.exit(0);
                } else if (option == JOptionPane.NO_OPTION) {
                    System.exit(0);
                }
            }
        });

        fileMenu.add(newPage);
        fileMenu.add(openFile);
        fileMenu.add(exit);
        menuContainer.add(fileMenu);

        frame.setJMenuBar(menuContainer);
        frame.pack();
        frame.setVisible(true);
    }

    private void saveAsFile() {
        // Implementation of save as file
        System.out.println("Save As File logic goes here");
    }

    private void saveFile() {
        // Implementation of save file
        System.out.println("Save File logic goes here");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        // Add your action handling code here if needed
    }

    public static void main(String[] args) {
        new ClassEditor();
    }
}
