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
        
        // make necessary panels visible
        VIEW.getGameWindow().setVisible(true);
        VIEW.getPlayerPanel().setVisible(false);
        VIEW.getNavButtonPanel().setVisible(false);
        VIEW.getMainTextPanel().setVisible(false);
        VIEW.getImagePanel().setVisible(true);
        
        // set initial player info values
        VIEW.getHpLabelNumber().setText(String.valueOf(MODEL.getPlayerHP()));
        VIEW.getWeaponLabelName().setText(MODEL.getWeapon());
        VIEW.getManaLabelNumber().setText(String.valueOf(MODEL.getPlayerMana()));
        
        // set start screen background image
        VIEW.getImageLabel().setIcon(VIEW.getDragonImage());
       
    }
    
        // initialize any events for the view to handle
    
    public void initCntl() {
        //maybe add difficulty selection button 
        VIEW.getStartButton().addActionListener(e -> startGame());
    }
    
    
        // handled by startButton
        // this is the first UI 
    private void startGame() {
        
        // make necessary panels visible
        VIEW.getStartButtonPanel().setVisible(false);
        VIEW.getTitleNamePanel().setVisible(false);
        VIEW.getPlayerPanel().setVisible(true);
        VIEW.getMainTextPanel().setVisible(true);
        VIEW.getNavButtonPanel().setVisible(true);
        VIEW.getImagePanel().setVisible(true);
        
        // make necessary buttons visible
        VIEW.getNavButton3().setVisible(false);
        VIEW.getNavButton4().setVisible(false);
        VIEW.getNavButton1().setText("Talk to Whiterun Guard");
        VIEW.getNavButton2().setText("Attack Whiterun Guard");
        
        // set story text
        VIEW.getMainTextArea().setText("Greetings, Adventurer! \nYour journey starts here - in the small village of Whiterun. "
                + "\nA guard stands at its gates. What will you do?");
        
        // set background image
        VIEW.getImageLabel().setIcon(VIEW.getGuardImage());
        
        
        
    }
    
    
    // other paths of the story will go here, such as crossRoadNav
    
//    private void crossRoadNav() {
//        
//    }
}
