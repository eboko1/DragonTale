package Main;

import javax.swing.*;

/**
 * Created by Vika on 19.12.2016.
 */
public class Game {
    public static void main(String[] args){
        JFrame windows=new JFrame("Dragon Tale ");
        windows.setContentPane(new GamePanel());
        windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
