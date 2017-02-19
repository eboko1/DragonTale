package GameState;


import Main.GamePanel;
import TileMap.*;
import java.awt.*;
import java.awt.event.KeyEvent;

import Entity.*;

/**
 * Created by Vika on 23.12.2016.
 */
public class Level1State extends GameState {

    private TileMap tileMap;
    private Background bg;

    private Player player;





    public Level1State(GameStateManager gsm){
      this.gsm=gsm;
      init();
    }


    public void init(){
        tileMap = new TileMap(30);
        tileMap.loadTiles("/Resources/Tilesets/grasstileset.gif");
        tileMap.loadMap("/Resources/Maps/level1-1.map");
        tileMap.setPosition(0,0);

        bg = new Background("/Resources/Backgrounds/grassbg1.gif", 0.1);

        player = new Player(tileMap);
        player.setPosition(100,100);
    }

   public void update(){
        player.update();
        tileMap.setPosition(GamePanel.WIDTH / 2 - player.getx(), GamePanel.WIDTH / 2 - player.gety()  );
   }

   public void draw (Graphics2D g){
       // clear screen
       // g.setColor(Color.WHITE);
        //g.fillRect(0,0, GamePanel.WIDTH,GamePanel.HEIGHT);

        // draw bg
        bg.draw(g);

        // draw tile map
        tileMap.draw(g);

        // draw player
        player.draw(g);
   }

    public void keyPressed(int k){
        if (k == KeyEvent.VK_LEFT) player.setLeft(true);
        if (k == KeyEvent.VK_RIGHT) player.setRight(true);
        if (k == KeyEvent.VK_UP) player.setUp(true);
        if (k == KeyEvent.VK_DOWN) player.setDown(true);
        if (k == KeyEvent.VK_SPACE) player.setJumping(true);
        if (k == KeyEvent.VK_E) player.setGliding(true);
        if (k == KeyEvent.VK_F) player.setFiring();
        if (k == KeyEvent.VK_S) player.setScratching();
    }
    public void keyReleased(int k){
        if (k == KeyEvent.VK_LEFT) player.setLeft(false);
        if (k == KeyEvent.VK_RIGHT) player.setRight(false);
        if (k == KeyEvent.VK_UP) player.setUp(false);
        if (k == KeyEvent.VK_DOWN) player.setDown(false);
        if (k == KeyEvent.VK_SPACE) player.setJumping(false);
        if (k == KeyEvent.VK_E) player.setGliding(false);

    }




}
