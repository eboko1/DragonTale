package Main;

import com.sun.corba.se.pept.transport.ListenerThread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

/**
 * Created by Vika on 19.12.2016.
 */
public class GamePanel extends JPanel implements  Runnable,KeyListener{

    //dimensions
    public  static final int WIDTH=320;
    public static final int HEIGHT=240;
    public static final int SCALE=2;

    // game thread
    private Thread thread;
    private boolean running;
    private int FSP=60;
    private long targeTime=1000/FSP;


    // image
    private BufferedImage image;
    private Graphics2D g;

    public GamePanel(){
        super();
        setPreferredSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));
    }

}
