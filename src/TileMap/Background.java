package TileMap;
import Main.GamePanel;

import java.awt.*;
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
             this.x = (x*moveScale) % GamePanel.WIDTH;
             this.y = (y*moveScale) % GamePanel.HEIGHT;
         }

         public  void setVector (double dx, double dy){
             this.dx=dx;
             this.dy=dy;
         }

         public void update(){
            x+=dx;  //x=x+dx;
            y+=dy;  //y=y+dy;
         }

         public void draw(Graphics2D g){
            // if(image==null){System.out.print("IMAGE NULL");
            //System.exit(0);
            //}

            // if(g==null){System.out.print("g NULL");
            //System.exit(0);
            //}

            g.drawImage(image,(int)x, (int) y, null);
            if (x<0){
                g.drawImage(image,(int)x+ GamePanel.WIDTH,(int) y, null);
            }
            if (x>0){
                g.drawImage(image, (int)x-GamePanel.WIDTH,(int)y,null);
            }
         }

    }

