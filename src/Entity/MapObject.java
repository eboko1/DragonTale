package Entity;

import TileMap.TileMap;
import TileMap.*;
import javafx.animation.Animation;

import java.awt.*;
import java.io.IOException;
import java.nio.CharBuffer;

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

    public boolean intersects(MapObject o){
     Rectangle r1 = getRectangle();
     Rectangle r2 = o.getRectangle();
     return  r1.intersects(r2);
    }

    public  Rectangle getRectangle(){
        return  new Rectangle((int) x-cwidth, (int)y-cheight, cwidth, cheight);
    }

    public void  calculateCorners (double x, double y){
        int leftTile = (int)(x - cwidth / 2) / tileSize;
        int rightTile = (int)(x + cwidth / 2-1) / tileSize;
        int topTile =   (int)(y - cheight / 2) / tileSize;
        int bottomTile = (int)(y - cheight / 2-1) / tileSize;

        int tl = tileMap.getType(topTile, leftTile);
        int tr = tileMap.getType(topTile, rightTile);
        int bl = tileMap.getType(bottomTile, leftTile);
        int br = tileMap.getType(bottomTile, rightTile);

        boolean topLeft = tl == Tile.BLOCKED;
        boolean topRight = tr == Tile.BLOCKED;
        bottomLeft = bl == Tile.BLOCKED;
        bottomRight = br == Tile.BLOCKED;
        

    }

    public  void  checkTileMapCollision(){
        currCol = (int)x/tileSize;
        currRow = (int)y/tileSize;

        xdest = x + dx;
        ydest = y + dy;

        xtemp = x;
        ydest = y;

        calculateCorners(x, ydest);

    }








}
