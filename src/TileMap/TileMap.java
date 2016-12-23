package TileMap;

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
    private int [][]map;
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
    private int roeOffset;
    private int colOffset;
    private int numRowsToDraw;
    private int numColsToDraw;

    public TileMap(int tileSize){
        

    }




}
