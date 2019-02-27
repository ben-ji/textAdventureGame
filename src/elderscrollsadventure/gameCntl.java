/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elderscrollsadventure;

/**
 *
 * @author Benjamin
 */


// helps VIEW and gameModel communicate
public class gameCntl {
    
    private final gameModel MODEL;
    private final gameView VIEW;

    
    public gameCntl(gameModel m, gameView v){
        MODEL = m;
        VIEW = v;
        INITVIEW();
    }
    
    public final void INITVIEW() {
        VIEW.getGameWindow().setVisible(true);
        VIEW.getPlayerPanel().setVisible(false);
        VIEW.getNavButtonPanel().setVisible(false);
        VIEW.getHpLabelNumber().setText(String.valueOf(MODEL.getPlayerHP()));
        VIEW.getWeaponLabelName().setText(MODEL.getWeapon());
        VIEW.getManaLabelNumber().setText(String.valueOf(MODEL.getPlayerMana()));
        
       
    }
    
    public void initCntl() {
        VIEW.getStartButton().addActionListener(e -> startGame());
    }
    
    //this will change the window to the gamewindow in the future
    //gamewindow will house all of the navigation (position changes), as well as the fighting mechanics
    //hp, mana, and weapons will change based on story
    private void startGame() {
        
        VIEW.getTitleNameLabel().setText("Your Adventure Awaits!");
        VIEW.getStartButtonPanel().setVisible(false);
        VIEW.getTitleNamePanel().setVisible(false);
        VIEW.getPlayerPanel().setVisible(true);
        VIEW.getMainTextPanel().setVisible(true);
        VIEW.getNavButtonPanel().setVisible(true);
              
    }
}
