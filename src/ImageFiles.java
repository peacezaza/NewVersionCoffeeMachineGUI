package src;

import javax.swing.*;
import java.io.File;

public class ImageFiles {
    private File latteFile = new File("lat.png");
    private File CapuccinoFile = new File("cap.png");
    private File espressoFile = new File("es.png");
    private File turFile = new File("t.png");
    public ImageFiles(){
    }

    public JLabel getLatteLabel(){
        JLabel latte = new JLabel( new ImageIcon(((new ImageIcon(latteFile.getAbsolutePath())).getImage()).getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH)));
        JFrame frame = new JFrame();
        frame.setSize(200,200);
        frame.add(latte);
        frame.setVisible(true);




        return latte;
    }
    public String getLatteAbsolutePath(){
        return latteFile.getAbsolutePath();
    }

}
