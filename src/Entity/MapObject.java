package Entity;

import TileMap.TileMap;
import javafx.animation.Animation;

/**
 * Created by Vika on 14.02.2017.
 */
public abstract class MapObject {

    //tile stuff
    protected  TileMap tileMap;
    protected int tileSize;
    protected double xmap;
    protected double ymap;

    //position and vector
    protected double x;
    protected double y;
    protected double dx;
    protected double dy;


    // dimensions
    protected int width;
    protected int height;

    //collision box

    protected int cwidth;
    protected int cheight;

    // collision
    protected int currRow;
    protected int currCol;
    protected double xdest;
    protected double ydest;
    protected double xtemp;
    protected double ytemp;
    protected boolean bottomLeft;
    protected boolean bottomRight;

    //animation
    protected Animation animation;
    protected int currentAction;
    protected int previsionAction;
    protected boolean facingRight;

    // movement
    protected boolean left;
    protected boolean right;
    protected boolean up;
    protected boolean down;
    protected boolean jumping;
    protected boolean falling;

    //moment attributes
    protected double maveSpeed;
    protected double maxSpeed;
    protected double stopSpeed;
    protected double fallSpeed;
    protected double maxFallSpeed;
    protected double jumpStart;
    protected double stopJumpSpeed;

    //constructor

    public MapObject(TileMap tm){
        tileMap = tm;
        tileSize = tm.getTileSize();
    }
    









}
