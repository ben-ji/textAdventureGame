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
public class elderScrollsGame {
    
    public static void main(String[] args){
        gameModel m = new gameModel("Ancient Nord Sword", 15, 100);
        gameView v = new gameView("Elder Scrolls: Adventure");
        gameCntl c = new gameCntl(m,v);
        c.initCntl();
    }
}
