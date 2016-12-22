package TileMap;
import java.awt.image.*;
import javax.imageio.ImageIO;

/**
 * Created by Vika on 22.12.2016.
 */
public class Background {

    private BufferedImage image;
    private double x;
    private double y;
    private double dx;
    private double dy;

    private double moveScale;

    public Background(String s, double ms){

        try{
       image= ImageIO.read(getClass().getResourceAsStream(s));
            moveScale=ms;
        }catch (Exception e){
            e.printStackTrace();
        }
    }
 public void setPosition(double x,double y){
     this.x=x;
     this.y=y;
      }
 public  void setVector (double dx, double dy){
     this.dx=dx;
     this.dy=dy;
 }
public void update(){
     x=x+dx; //x+=dx
     y=y+dy;
}


}
