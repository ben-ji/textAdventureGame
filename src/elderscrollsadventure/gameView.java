/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elderscrollsadventure;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Benjamin
 */

// everything Spring related 
// everything that handles the screen
// all buttons, text, etc.

public class gameView {

    /**
     * @return the manaLabel
     */
        
        private JFrame gameWindow;
        private JPanel titleNamePanel;
        private JPanel startButtonPanel;
        private JPanel mainTextPanel;
        private JPanel navButtonPanel;
        private JPanel playerPanel;
        private JLabel titleNameLabel;
        private JLabel hpLabel;
        private JLabel hpLabelNumber;
        private JLabel manaLabel;
        private JLabel manaLabelNumber;
        private JLabel weaponLabel;
        private JLabel weaponLabelName;
        private Font titleFont = new Font("Times New Roman", Font.PLAIN, 56);
        private Font normalFont = new Font("Times New Roman", Font.PLAIN, 18);
        private JButton startButton;
        private JButton navButton1;
        private JButton navButton2;
        private JButton navButton3;
        private JButton navButton4;
        private JTextArea mainTextArea;

        
        public gameView(String title){
                    
            // create initial gameWindow
            gameWindow = new JFrame();
            gameWindow.setSize(800, 600);
            gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            gameWindow.getContentPane().setBackground(Color.black);
            gameWindow.setLayout(null);
//            gameWindow.setVisible(true);
            gameWindow.setResizable(false);
            gameWindow.setTitle("Elder Scrolls Adventure");

            //title panel
            titleNamePanel = new JPanel();
            titleNamePanel.setBounds(100, 100, 600, 150);
            titleNamePanel.setBackground(Color.black);
            titleNameLabel = new JLabel("Elder Scrolls: Adventure");
            titleNameLabel.setForeground(Color.white);
            titleNameLabel.setFont(titleFont);
            gameWindow.add(titleNamePanel);

            //start button panel
            startButtonPanel = new JPanel();
            startButtonPanel.setBounds(300, 400, 200, 100);
            startButtonPanel.setBackground(Color.black);
            startButton = new JButton("START");
            startButton.setBackground(Color.black);
            startButton.setForeground(Color.white);
            startButton.setFont(normalFont);
            startButton.setFocusPainted(false);
            gameWindow.add(startButtonPanel);

            //add elements to panel
            titleNamePanel.add(titleNameLabel);
            startButtonPanel.add(startButton);
            
            
            //create new game gameWindow?
            //create 
            
            navButtonPanel = new JPanel();
            navButtonPanel.setBounds(250, 350, 300, 150);
            navButtonPanel.setBackground(Color.black);
            navButtonPanel.setLayout(new GridLayout(4, 1));
            gameWindow.add(navButtonPanel);

            navButton1 = new JButton("Button 1");
            navButton1.setBackground(Color.black);
            navButton1.setForeground(Color.white);
            navButton1.setFont(normalFont);
            navButton1.setFocusPainted(false);
//            navButton1.addActionListener(handleNav);
            navButton1.setActionCommand("n1");
            navButtonPanel.add(navButton1);

            navButton2 = new JButton("Button 2");
            navButton2.setBackground(Color.black);
            navButton2.setForeground(Color.white);
            navButton2.setFont(normalFont);
            navButton2.setFocusPainted(false);
//            navButton2.addActionListener(handleNav);
            navButton2.setActionCommand("n2");
            navButtonPanel.add(navButton2);

            navButton3 = new JButton("Button 3");
            navButton3.setBackground(Color.black);
            navButton3.setForeground(Color.white);
            navButton3.setFont(normalFont);
            navButton3.setFocusPainted(false);
//            navButton3.addActionListener(handleNav);
            navButton3.setActionCommand("n3");
            navButtonPanel.add(navButton3);

            navButton4 = new JButton("Button 4");
            navButton4.setBackground(Color.black);
            navButton4.setForeground(Color.white);
            navButton4.setFont(normalFont);
            navButton4.setFocusPainted(false);
//            navButton4.addActionListener(handleNav);
            navButton4.setActionCommand("n4");
            navButtonPanel.add(navButton4);
            
            mainTextPanel = new JPanel();
            mainTextPanel.setBounds(100, 100, 600, 250);
            mainTextPanel.setBackground(Color.black);
            gameWindow.add(mainTextPanel);

            mainTextArea = new JTextArea("Main text areaMain text areaMain text areaMain text areaMain text areaMain text areaMain text areaMain text areaMain text areaMain text area");
            mainTextArea.setBounds(100, 100, 600, 250);
            mainTextArea.setBackground(Color.black);
            mainTextArea.setForeground(Color.white);
            mainTextArea.setFont(normalFont);
            mainTextArea.setLineWrap(true);
            mainTextArea.setWrapStyleWord(true);
            mainTextArea.setEditable(false);
            mainTextPanel.add(mainTextArea);
            
//            gameWindow = new JFrame();
            playerPanel = new JPanel();
            playerPanel.setBounds(100, 15, 800, 50);
            playerPanel.setBackground(Color.black);
            playerPanel.setLayout(new GridLayout(2, 6));
            gameWindow.add(playerPanel);

            hpLabel = new JLabel("HP: ");
            hpLabel.setFont(normalFont);
            hpLabel.setForeground(Color.white);
            playerPanel.add(hpLabel);
            
            manaLabel = new JLabel("Mana: ");
            manaLabel.setFont(normalFont);
            manaLabel.setForeground(Color.white);
            playerPanel.add(manaLabel);
            
            weaponLabel = new JLabel("Weapon: ");
            weaponLabel.setFont(normalFont);
            weaponLabel.setForeground(Color.white);
            playerPanel.add(weaponLabel);

            
            hpLabelNumber = new JLabel();
            hpLabelNumber.setFont(normalFont);
            hpLabelNumber.setForeground(Color.white);
            playerPanel.add(hpLabelNumber);
            
            manaLabelNumber = new JLabel();
            manaLabelNumber.setFont(normalFont);
            manaLabelNumber.setForeground(Color.white);
            playerPanel.add(manaLabelNumber);
            
            weaponLabelName = new JLabel();
            weaponLabelName.setFont(normalFont);
            weaponLabelName.setForeground(Color.white);
            playerPanel.add(weaponLabelName);
            
    }

    /**
     * @return the gameWindow
     */
    public JFrame getGameWindow() {
        return gameWindow;
    }

    /**
     * @param gameWindow the gameWindow to set
     */
    public void setGameWindow(JFrame gameWindow) {
        this.gameWindow = gameWindow;
    }

    /**
     * @return the titleNamePanel
     */
    public JPanel getTitleNamePanel() {
        return titleNamePanel;
    }

    /**
     * @param titleNamePanel the titleNamePanel to set
     */
    public void setTitleNamePanel(JPanel titleNamePanel) {
        this.titleNamePanel = titleNamePanel;
    }

    /**
     * @return the startButtonPanel
     */
    public JPanel getStartButtonPanel() {
        return startButtonPanel;
    }

    /**
     * @param startButtonPanel the startButtonPanel to set
     */
    public void setStartButtonPanel(JPanel startButtonPanel) {
        this.startButtonPanel = startButtonPanel;
    }

    /**
     * @return the mainTextPanel
     */
    public JPanel getMainTextPanel() {
        return mainTextPanel;
    }

    /**
     * @param mainTextPanel the mainTextPanel to set
     */
    public void setMainTextPanel(JPanel mainTextPanel) {
        this.mainTextPanel = mainTextPanel;
    }

    /**
     * @return the navButtonPanel
     */
    public JPanel getNavButtonPanel() {
        return navButtonPanel;
    }

    /**
     * @param navButtonPanel the navButtonPanel to set
     */
    public void setNavButtonPanel(JPanel navButtonPanel) {
        this.navButtonPanel = navButtonPanel;
    }

    /**
     * @return the playerPanel
     */
    public JPanel getPlayerPanel() {
        return playerPanel;
    }

    /**
     * @param playerPanel the playerPanel to set
     */
    public void setPlayerPanel(JPanel playerPanel) {
        this.playerPanel = playerPanel;
    }

    /**
     * @return the titleNameLabel
     */
    public JLabel getTitleNameLabel() {
        return titleNameLabel;
    }

    /**
     * @param titleNameLabel the titleNameLabel to set
     */
    public void setTitleNameLabel(JLabel titleNameLabel) {
        this.titleNameLabel = titleNameLabel;
    }

    /**
     * @return the hpLabel
     */
    public JLabel getHpLabel() {
        return hpLabel;
    }

    /**
     * @param hpLabel the hpLabel to set
     */
    public void setHpLabel(JLabel hpLabel) {
        this.hpLabel = hpLabel;
    }

    /**
     * @return the hpLabelNumber
     */
    public JLabel getHpLabelNumber() {
        return hpLabelNumber;
    }

    /**
     * @param hpLabelNumber the hpLabelNumber to set
     */
    public void setHpLabelNumber(JLabel hpLabelNumber) {
        this.hpLabelNumber = hpLabelNumber;
    }

    /**
     * @return the weaponLabel
     */
    public JLabel getWeaponLabel() {
        return weaponLabel;
    }

    /**
     * @param weaponLabel the weaponLabel to set
     */
    public void setWeaponLabel(JLabel weaponLabel) {
        this.weaponLabel = weaponLabel;
    }

    /**
     * @return the weaponLabelName
     */
    public JLabel getWeaponLabelName() {
        return weaponLabelName;
    }

    /**
     * @param weaponLabelName the weaponLabelName to set
     */
    public void setWeaponLabelName(JLabel weaponLabelName) {
        this.weaponLabelName = weaponLabelName;
    }

    /**
     * @return the titleFont
     */
    public Font getTitleFont() {
        return titleFont;
    }

    /**
     * @param titleFont the titleFont to set
     */
    public void setTitleFont(Font titleFont) {
        this.titleFont = titleFont;
    }

    /**
     * @return the normalFont
     */
    public Font getNormalFont() {
        return normalFont;
    }

    /**
     * @param normalFont the normalFont to set
     */
    public void setNormalFont(Font normalFont) {
        this.normalFont = normalFont;
    }

    /**
     * @return the startButton
     */
    public JButton getStartButton() {
        return startButton;
    }

    /**
     * @param startButton the startButton to set
     */
    public void setStartButton(JButton startButton) {
        this.startButton = startButton;
    }

    /**
     * @return the navButton1
     */
    public JButton getNavButton1() {
        return navButton1;
    }

    /**
     * @param navButton1 the navButton1 to set
     */
    public void setNavButton1(JButton navButton1) {
        this.navButton1 = navButton1;
    }

    /**
     * @return the navButton2
     */
    public JButton getNavButton2() {
        return navButton2;
    }

    /**
     * @param navButton2 the navButton2 to set
     */
    public void setNavButton2(JButton navButton2) {
        this.navButton2 = navButton2;
    }

    /**
     * @return the navButton3
     */
    public JButton getNavButton3() {
        return navButton3;
    }

    /**
     * @param navButton3 the navButton3 to set
     */
    public void setNavButton3(JButton navButton3) {
        this.navButton3 = navButton3;
    }

    /**
     * @return the navButton4
     */
    public JButton getNavButton4() {
        return navButton4;
    }

    /**
     * @param navButton4 the navButton4 to set
     */
    public void setNavButton4(JButton navButton4) {
        this.navButton4 = navButton4;
    }

    /**
     * @return the mainTextArea
     */
    public JTextArea getMainTextArea() {
        return mainTextArea;
    }

    /**
     * @param mainTextArea the mainTextArea to set
     */
    public void setMainTextArea(JTextArea mainTextArea) {
        this.mainTextArea = mainTextArea;
    }

    /**
     * @return the manaLabelNumber
     */
    public JLabel getManaLabelNumber() {
        return manaLabelNumber;
    }

    /**
     * @param manaLabelNumber the manaLabelNumber to set
     */
    public void setManaLabelNumber(JLabel manaLabelNumber) {
        this.manaLabelNumber = manaLabelNumber;
    }
    
    public JLabel getManaLabel() {
        return manaLabel;
    }

    /**
     * @param manaLabel the manaLabel to set
     */
    public void setManaLabel(JLabel manaLabel) {
        this.manaLabel = manaLabel;
    }
}