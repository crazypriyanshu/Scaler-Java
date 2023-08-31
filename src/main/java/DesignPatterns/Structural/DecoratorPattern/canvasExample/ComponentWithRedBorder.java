package main.java.DesignPatterns.Structural.DecoratorPattern.canvasExample;

import java.awt.*;

public class ComponentWithRedBorder implements Component{
    Component decoratedComponent;
    public ComponentWithRedBorder(Component component) {
        decoratedComponent = component;
    }
    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(Color.RED);
        decoratedComponent.draw(graphics);
        graphics.setColor(Color.BLACK);

    }
}
