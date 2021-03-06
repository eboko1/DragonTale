package TileMap;

import java.awt.image.BufferedImage;

/**
 * Created by Vika on 23.12.2016.
 */
public class Tile {

    private BufferedImage image;

    private int type;

    //tile types
    public static final int NORMAL=0;
    public static final int BLOCKED=1;


    public Tile(BufferedImage image,int type){
        this.image=image;
        this.type=type;
    }
    public BufferedImage getImage(){
    return image;
    }

    public int getType(){
        return type;
    }

}
