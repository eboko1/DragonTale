package Entity;

import TileMap.TileMap;

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

    

    public Player(TileMap tm) {
        super(tm);
    }


 }
