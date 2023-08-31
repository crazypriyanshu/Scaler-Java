package main.java.DesignPatterns.Structural.DecoratorPattern.canvasExample;

import javax.swing.*;
import java.awt.*;

public class Canvas extends JPanel {
    Component circle1 = new Circle(15, 15);
    Component circle2 = new Circle(75, 15);
    Component circle3 = new Circle(135, 15);

    public void paint(Graphics graphics) {
        circle1.draw(graphics);
        circle2 = new ComponentWithRedBorder(circle2);
        circle2 = new ComponentWithYellowFill(circle2);
        circle2.draw(graphics);
        circle3.draw(graphics);
    }

}
