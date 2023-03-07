package src;

import javax.swing.*;
import java.io.File;

public class ImageFiles {
    private File latteFile = new File("lat.png");
    private File CapuccinoFile = new File("cap.png");
    private File espressoFile = new File("es.png");
    private File turFile = new File("t.png");
    private JLabel latte;
    public ImageFiles(){
        latte = new JLabel( new ImageIcon(((new ImageIcon(getLatteAbsolutePath())).getImage()).getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH)));

    }

    public JLabel getLatteLabel(){
        return this.latte;
    }
    public String getLatteAbsolutePath(){
        return latteFile.getAbsolutePath();
    }

}
