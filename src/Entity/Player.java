package Entity;

import TileMap.TileMap;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 * Created by Vika on 18.02.2017.
 */
public class Player extends  MapObject {

    // player stuff
     private int health;
     private  int maxHealth;
     private  int fire;
     private int maxFire;
     private boolean dead;
     private boolean flinching;
     private long flinchTime;

     //fireball
    private boolean firing;
    private int fireCost;
    private int fireBallDamage;
    //private ArrayList<FireBall>fireBalls;

    //scratch
    private boolean scratching;
    private int scrachDamage;
    private int scrachRange;


    //gliding
    private boolean gliding;

    //animation
    private ArrayList<BufferedImage[]> sprites;

    // animations actions
    private static final int IDLE = 0;
    private static final int WALKING = 1;
    private static final int JUMPING = 2;
    private static final int FALLING = 3;
    private static final int GLIDING = 4;
    private static final int FIREBALL = 5;
    private static final int SCRATCHING = 6;


    public Player(TileMap tm) {
        super(tm);
    }


 }
