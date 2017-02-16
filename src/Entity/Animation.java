package Entity;

import java.awt.image.BufferedImage;

/**
 * Created by Vika on 16.02.2017.
 */
public class Animation {

    private BufferedImage[] frames;
    private  int currentFrame;

    private long startTime;
    private long delay;

    private boolean playedOnce;

    public void  Animation(){
        playedOnce = false;
    }

    public void setFrames (BufferedImage[] frames){
        this.frames = frames;
        currentFrame = 0;
        startTime = System.nanoTime();
        playedOnce = false;
    }

    public void setDelay(long d){delay = d;}
    public void setFrsme(int i){ currentFrame = 1;}

    public void update(){
        if (delay == -1) {
            long elapsed = (System.nanoTime() - startTime) / 1000000;
            if (elapsed > delay) {
                currentFrame++;
                startTime = System.nanoTime();
            }

            if (currentFrame == frames.length) {
                currentFrame = 0;
                playedOnce = true;

            }
        }
    }




}
