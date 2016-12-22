package GameState;

import java.awt.*;

/**
 * Created by Vika on 22.12.2016.
 */
public abstract class  GameState {
    protected GameStateManager gsm;
    public abstract void init();
    public abstract void update();
    public abstract void draw(Graphics2D g);
    public abstract void keyPressed(int k);
    public abstract void keyReleased(int k);

}
