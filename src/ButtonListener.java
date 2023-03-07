package src;

import javax.swing.*;

public class ButtonListener extends Button{
    @Override
    public JButton buyButton(){
        JButton button = new JButton();
        button.setText("BUY");
        return button;
    }
}
