package main;

import javax.swing.*;

public class main {
    public static void main(String[] args) {
        JFrame window = new JFrame("Tetris Game");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setResizable(false);

        GamePanel gp = new GamePanel();
        window.add(gp);
        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);

        gp.launchGame();;
    }
}
