package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
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
        setFocusable(true);
        requestFocus();
    }
    public void addNotify(){
        super.addNotify();
        if (thread==null){
            thread=new Thread(this);
            addKeyListener(this);
            thread.start();

        }
    }
    private void init(){
     image =new BufferedImage(WIDTH,HEIGHT,BufferedImage.TYPE_INT_RGB);
        g=(Graphics2D) g;

        running = true;
    }

    public void run(){
        init();

        long start;
        long elapsed;
        long wait;
        // game loop
        while (running){
            start=System.nanoTime();

            update();
            draw();
            drawToScreen();

            elapsed=System.nanoTime()-start;

            wait = targeTime-elapsed/1000000;

            try{
                Thread.sleep(wait);
            } catch (Exception e){
               e.printStackTrace();
            }
        }
    }
    private void update(){

    }
    private void draw() {
    }

    private void drawToScreen() {
        Graphics g2=getGraphics();
        g2.drawImage(image,0,0,null);
        g2.dispose();
    }

    public void keyTyped(KeyEvent key){}
    public void keyPressed(KeyEvent key){}
    public void keyReleased(KeyEvent key){}
//p1...13.00

}
