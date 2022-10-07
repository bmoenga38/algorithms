package Exarms;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;

class TextAreaDemo extends JFrame {

    private JScrollPane jScrollPane;
    private JTextArea jTextArea;
    private static final String FILE_PATH = "home/Brycode/Desktop/Brian/STAGE_3_Algorithms/";

    public TextAreaDemo() {

        try {
            jTextArea = new JTextArea(24, 31);

            jTextArea.read(new BufferedReader(new FileReader(FILE_PATH)), null);

        } catch (Exception e) {

            e.printStackTrace();
        }

        jScrollPane = new JScrollPane(this.jTextArea);
        this.add(this.jScrollPane);
        this.setVisible(true);
        this.setSize(400, 200);
    }

    public static void main(String[] args) {
        TextAreaDemo textAreaDemo = new TextAreaDemo();
    }
}
