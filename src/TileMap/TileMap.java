package TileMap;

import Main.GamePanel;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

/**
 * Created by Vika on 23.12.2016.
 */
public class TileMap {
    // position
    private double x;
    private double y;

    //bounds
    private int xmin;
    private int ymin;
    private int xmax;
    private int ymax;

    private double tween;

    // map
    private int [][]  map;
    private int tileSize;
    private int numRows;
    private int numCols;
    private int width;
    private int height;

    // tile set
    private BufferedImage tileSet;
    private  int numTilesAcross;
    private Tile[][] tiles;

    // drawing
    private int rowOffset;
    private int colOffset;
    private int numRowsToDraw;
    private int numColsToDraw;

    public TileMap(int tileSize){
        this.tileSize=tileSize;
        numRowsToDraw= GamePanel.HEIGHT/tileSize+2;
        numColsToDraw=GamePanel.WIDTH/tileSize+2;
        tween=0.07;
    }

    public void loadTiles(String s){
        try {
            tileSet= ImageIO.read(getClass().getResourceAsStream(s));
            numTilesAcross=tileSet.getWidth()/tileSize;
            tiles=new Tile[2][numTilesAcross];

            BufferedImage subImage;
            for(int col=0;col<numTilesAcross;col++) {
                subImage=tileSet.getSubimage(col*tileSize,0,tileSize,tileSize);
                tiles[0][col]=new Tile (subImage,Tile.NORMAl);
                subImage=tileSet.getSubimage(col*tileSize,tileSize,tileSize,tileSize);
                tiles[1][col]=new Tile (subImage,Tile.BLOCKED)
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public void loadMap(String s){}


}
