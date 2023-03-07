package src;

import src.ButtonListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class MainFrame {
    JFrame frame = new JFrame("CoffeeMachine");
    public MainFrame(){
        createJFrame();
        setFirstPage(frame);

    }
    private void createJFrame(){
        frame.setSize(350,370);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                setTitleCenter(frame);
            }
        });

    }
    private void setTitleCenter(JFrame frame){
        Font font = frame.getFont();
        String currentTitle = frame.getTitle().trim();
        FontMetrics fm = frame.getFontMetrics(font);
        int frameWidth = frame.getWidth();
        int titleWidth = fm.stringWidth(currentTitle);
        int spaceWidth = fm.stringWidth(" ");
        int centerPos = (frameWidth / 2) - (titleWidth / 2);
        int spaceCount = centerPos / spaceWidth;
        String pad = "";
        pad = String.format("%" + (spaceCount - 14) + "s", pad);
        frame.setTitle(pad + currentTitle);

    }

    private void setFirstPage(JFrame frame){
        ButtonListener button = new ButtonListener();
        JPanel panel = new JPanel();
        panel.add(button.buyButton());
        frame.add(panel);
    }

    public static void main(String[] args){
        new MainFrame();
    }
}
