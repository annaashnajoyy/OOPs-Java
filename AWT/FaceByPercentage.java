/*
 * Experiment 26 – AWT GUI: Draw Face Based on Percentage
 * File: FaceByPercentage.java
 *
 * This program takes percentage input from the user using AWT components
 * and displays a happy or sad face depending on the value.
 */

import java.awt.*;
import java.awt.event.*;

public class FaceByPercentage extends Frame implements ActionListener {
    Label l1;
    TextField t1;
    Button b;
    int percent = -1;

    FaceByPercentage() {
        setLayout(new FlowLayout());

        l1 = new Label("Enter your percentage:");
        t1 = new TextField(10);
        b = new Button("Show Face");

        add(l1); add(t1); add(b);

        b.addActionListener(this);

        setTitle("Face Based on Percentage");
        setSize(300, 400);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            percent = Integer.parseInt(t1.getText());
            repaint();
        } catch (NumberFormatException ex) {
            percent = -1;
            repaint();
        }
    }

    public void paint(Graphics g) {
        if (percent == -1) return;

        g.setColor(Color.BLACK);
        g.drawOval(100, 100, 100, 100);           // Face outline

        g.fillOval(125, 130, 10, 10);             // Left eye
        g.fillOval(165, 130, 10, 10);             // Right eye

        if (percent >= 50) {
            // Smiley
            g.drawArc(125, 140, 50, 30, 180, 180);
        } else {
            // Sad
            g.drawArc(125, 160, 50, 30, 0, 180);
        }

        g.drawString("Percentage: " + percent + "%", 115, 90);
    }

    public static void main(String[] args) {
        new FaceByPercentage();
    }
}
