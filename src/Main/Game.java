package Main;

import javax.swing.*;

/**
 * Created by Vika on 19.12.2016.
 */
public class Game {
    public static void main(String[] args){
        JFrame window=new JFrame("Dragon Tale ");
        window.setContentPane(new GamePanel());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.pack();
        window.setVisible(true);
    }
}//3
