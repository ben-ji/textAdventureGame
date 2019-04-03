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
// handles location change
// init hp/mana/weapon values
// updates user valuesb 
public class gameModel {

    private int playerHP, playerMana;
    private String weapon;
//            , position;
    
    public gameModel(String weapon, 
//            String position, 
            int playerHP, int playerMana){
        this.playerHP = playerHP;
        this.playerMana = playerMana;
//        this.position = position;
        this.weapon = weapon;
    }

    /**
     * @return the playerHP
     */
    public int getPlayerHP() {
        return playerHP;
    }

    /**
     * @param playerHP the playerHP to set
     */
    public void setPlayerHP(int playerHP) {
        this.playerHP = playerHP;
    }

    /**
     * @return the playerMana
     */
    public int getPlayerMana() {
        return playerMana;
    }

    /**
     * @param playerMana the playerMana to set
     */
    public void setPlayerMana(int playerMana) {
        this.playerMana = playerMana;
    }

    /**
     * @return the weapon
     */
    public String getWeapon() {
        return weapon;
    }

    /**
     * @param weapon the weapon to set
     */
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    /**
     * @return the position
     */
//    public String getPosition() {
//        return position;
//    }
//
//    /**
//     * @param position the position to set
//     */
//    public void setPosition(String position) {
//        this.position = position;
//    }
}
