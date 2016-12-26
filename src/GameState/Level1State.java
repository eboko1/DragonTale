package GameState;
import Main.GamePanel;
import TileMap.*;
import java.awt.*;

/**
 * Created by Vika on 23.12.2016.
 */
public class Level1State extends GameState {

    private TileMap tileMap;



    public Level1State(GameStateManager gsm){
      this.gsm=gsm;
    }
    public void init(){
        tileMap=new TileMap(30);
        tileMap.loadTiles("/Tilesets/grasstileset.gif");
        tileMap.loadMap("/Map/level1-1.map");
        tileMap.setPosition(0,0);
    }
    public void update(){}
    public void draw (Graphics2D g){
        // draw screen
        g.setColor(Color.WHITE);
        g.fillRect(0,0, GamePanel.WIDTH,GamePanel.HEIGHT);

        // draw tile map
         tileMap.draw(g);}

    public void keyPressed(int k){}
    public void keyReleased(int k){}




}
