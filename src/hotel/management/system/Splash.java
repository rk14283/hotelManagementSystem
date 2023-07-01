package hotel.management.system;

import javax.swing.*;

public class Splash extends JFrame {
    Splash (){
        //Find location of image using imageIcon
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/splash.gif"));
        JLabel label = new JLabel(imageIcon);

        label.setBounds(0,0,858,680);
        add(label);
        //by default layout is border
        setLayout(null);
        setLocation(300, 80);
        setSize(858, 680);
        //frame would not show without it
        //All things you want to display is above setVisible(true)
        setVisible(true);

        try {
            Thread.sleep(5000);
            setVisible(false);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        new Splash();
    }
}
