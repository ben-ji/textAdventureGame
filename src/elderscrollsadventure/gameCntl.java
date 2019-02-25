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


// helps view and gameModel communicate
public class gameCntl {
    
    private gameModel model;
    private gameView view;
    
    public gameCntl(gameModel m, gameView v){
        model = m;
        view = v;
    }
    
    private void initView() {
        
    }
}
