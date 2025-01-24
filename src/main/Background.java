package main;

import javax.swing.*;
import java.awt.*;

public class Background extends JLayeredPane {

    Background(GamePanel g){
        this.setBackground(Color.red);
        this.setVisible(true);
        this.add(g);
    }
}
