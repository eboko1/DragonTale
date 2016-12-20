package Main;

import javax.swing.*;

/**
 * Created by Vika on 19.12.2016.
 */
public class GamePanel extends JPanel {
    //dimensions
    public  static final int WIDTH=320;
    public static final int HEIGHT=240;
    public static final int SCALE=2;

    // game thread
    private Thread thread;
    private boolean running;
    private int FSP=60;
    private long targeTime=1000/FSP;

}
