package GameState;
import java.util.ArrayList;
/**
 * Created by Vika on 22.12.2016.
 */
public class GameStateManager {

    private ArrayList<GameState> gameState;
    private int currentState;

    public static final int MENUSTATE=0;
    public static final int LEVEL1STATE=1;


    public GameStateManager() {
        gameState= new ArrayList<GameState>();

        currentState=MENUSTATE;

        gameState.add(new MenuState(this));
        gameState.add(new Level1State(this));

    }


    public void setState(int state){
        currentState=state;
        gameState.get(currentState).init();

    }
    public void update(){
        gameState.get(currentState).update();

    }
    public void draw(java.awt.Graphics2D g){
        gameState.get(currentState).draw(g);
    }
    public void keyPressed(int k){
        gameState.get(currentState).keyPressed(k);
    }
    public void Released (int k){
        gameState.get(currentState).keyReleased(k);
    }
}
