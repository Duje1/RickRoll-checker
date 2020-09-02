package com.duje1;

import javax.swing.*;
import java.awt.image.ImageObserver;

public class Main {
    private static final String TITLE = "Rick Checker";
    private static final int WIDTH=600,HEIGHT=300;
    public static void main(String[] args) {

        //initializing frame
        JFrame frame = new JFrame(TITLE);
        frame.setSize(WIDTH,HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
