package main.java.DesignPatterns.Structural.DecoratorPattern.canvasExample;

import javax.swing.*;

public class Client {
    public static void main(String[] args) {
//        System.out.println("A");
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.add(new Canvas());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
