/*
 * Experiment 24 – AWT GUI: Draw Cone, Cylinder, and Shapes
 * File: ShapeDrawer.java
 *
 * This program uses AWT to draw:
 * - A cone using lines
 * - A cylinder using ovals and lines
 * - A square inside a circle inside an oval
 */

import java.awt.*;

public class ShapeDrawer extends Frame {
    public void paint(Graphics g) {
        // Draw Cone
        g.drawLine(100, 250, 150, 150);
        g.drawLine(200, 250, 150, 150);
        g.drawOval(100, 240, 100, 20);
        g.drawString("Cone", 130, 270);

        // Draw Cylinder
        g.drawOval(250, 150, 100, 20);         // Top
        g.drawLine(250, 160, 250, 250);        // Left line
        g.drawLine(350, 160, 350, 250);        // Right line
        g.drawOval(250, 240, 100, 20);         // Bottom
        g.drawString("Cylinder", 280, 270);

        // Draw Oval → Circle → Square inside
        g.drawOval(400, 150, 100, 70);         // Oval
        g.drawOval(415, 160, 70, 70);          // Circle
        g.drawRect(430, 175, 40, 40);          // Square
        g.drawString("Oval, Circle, Square", 405, 240);
    }

    public static void main(String[] args) {
        ShapeDrawer frame = new ShapeDrawer();
        frame.setTitle("AWT Shape Drawer");
        frame.setSize(600, 400);
        frame.setVisible(true);
    }
}
