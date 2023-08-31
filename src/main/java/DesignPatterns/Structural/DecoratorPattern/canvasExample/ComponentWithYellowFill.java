package main.java.DesignPatterns.Structural.DecoratorPattern.canvasExample;

import java.awt.*;

public class ComponentWithYellowFill implements Component{
    Component decoratedComponent;
    public ComponentWithYellowFill(Component component) {
        decoratedComponent = component;
    }
    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(Color.YELLOW);
        graphics.fillOval(75,15, 50, 50);
        decoratedComponent.draw(graphics);
        graphics.setColor(Color.BLACK);

    }
}
