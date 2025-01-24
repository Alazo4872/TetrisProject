package login;

import javax.swing.*;

public class LoginPanel extends JLayeredPane {
    JPanel background;
    JLabel loginDisplay;
    JTextField userName, password;


    // screen will have minos falling because why not!
    LoginPanel(){
        this.setVisible(true);// at the very end

        background = new JPanel();



    }

}
