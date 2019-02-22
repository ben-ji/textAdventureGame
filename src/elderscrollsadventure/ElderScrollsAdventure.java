/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elderscrollsadventure;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Benjamin
 */
//refactor to View/UI
public class ElderScrollsAdventure {

    JFrame window;
    Container con;
    JPanel titleNamePanel, startButtonPanel, mainTextPanel, navButtonPanel, playerPanel;
    JLabel titleNameLabel, hpLabel, hpLabelNumber, weaponLabel, weaponLabelName;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 56);
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 18);
    JButton startButton, nav1, nav2, nav3, nav4;
    JTextArea mainTextArea;
    int playerHP, monsterHP, silverRing;
    String weapon, position;
    titleScreenHandler handleTS = new titleScreenHandler();
    navHandler handleNav = new navHandler();

    public static void main(String[] args) {
        new ElderScrollsAdventure();
    }

    public ElderScrollsAdventure() {

        // window
        window = new JFrame();
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        window.setVisible(true);
        window.setResizable(false);
        window.setTitle("Elder Scrolls Adventure");
        con = window.getContentPane();

        //title panel + label
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100, 100, 600, 150);
        titleNamePanel.setBackground(Color.black);
        titleNameLabel = new JLabel("Elder Scrolls: Adventure");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);

        //start button
        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 400, 200, 100);
        startButtonPanel.setBackground(Color.black);

        startButton = new JButton("START");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(normalFont);
        startButton.setFocusPainted(false);
        startButton.addActionListener(handleTS);

        //adds
        titleNamePanel.add(titleNameLabel);
        startButtonPanel.add(startButton);
        con.add(titleNamePanel);
        con.add(startButtonPanel);

    }

    public void createGameScreen() {

        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);

        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100, 100, 600, 250);
        mainTextPanel.setBackground(Color.black);
        window.add(mainTextPanel);

        mainTextArea = new JTextArea("Main text areaMain text areaMain text areaMain text areaMain text areaMain text areaMain text areaMain text areaMain text areaMain text area");
        mainTextArea.setBounds(100, 100, 600, 250);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextArea.setEditable(false);
        mainTextPanel.add(mainTextArea);

        navButtonPanel = new JPanel();
        navButtonPanel.setBounds(250, 350, 300, 150);
        navButtonPanel.setBackground(Color.black);
        navButtonPanel.setLayout(new GridLayout(4, 1));
        window.add(navButtonPanel);

        nav1 = new JButton("Button 1");
        nav1.setBackground(Color.black);
        nav1.setForeground(Color.white);
        nav1.setFont(normalFont);
        nav1.setFocusPainted(false);
        nav1.addActionListener(handleNav);
        nav1.setActionCommand("n1");
        navButtonPanel.add(nav1);

        nav2 = new JButton("Button 2");
        nav2.setBackground(Color.black);
        nav2.setForeground(Color.white);
        nav2.setFont(normalFont);
        nav2.setFocusPainted(false);
        nav2.addActionListener(handleNav);
        nav2.setActionCommand("n2");
        navButtonPanel.add(nav2);

        nav3 = new JButton("Button 3");
        nav3.setBackground(Color.black);
        nav3.setForeground(Color.white);
        nav3.setFont(normalFont);
        nav3.setFocusPainted(false);
        nav3.addActionListener(handleNav);
        nav3.setActionCommand("n3");
        navButtonPanel.add(nav3);

        nav4 = new JButton("Button 4");
        nav4.setBackground(Color.black);
        nav4.setForeground(Color.white);
        nav4.setFont(normalFont);
        nav4.setFocusPainted(false);
        nav4.addActionListener(handleNav);
        nav4.setActionCommand("n4");
        navButtonPanel.add(nav4);

        playerPanel = new JPanel();
        playerPanel.setBounds(100, 15, 600, 50);
        playerPanel.setBackground(Color.black);
        playerPanel.setLayout(new GridLayout(1, 4));
        window.add(playerPanel);

        hpLabel = new JLabel("HP: ");
        hpLabel.setFont(normalFont);
        hpLabel.setForeground(Color.white);
        playerPanel.add(hpLabel);

        hpLabelNumber = new JLabel();
        hpLabelNumber.setFont(normalFont);
        hpLabelNumber.setForeground(Color.white);
        playerPanel.add(hpLabelNumber);

        weaponLabel = new JLabel("Weapon: ");
        weaponLabel.setFont(normalFont);
        weaponLabel.setForeground(Color.white);
        playerPanel.add(weaponLabel);

        weaponLabelName = new JLabel();
        weaponLabelName.setFont(normalFont);
        weaponLabelName.setForeground(Color.white);
        playerPanel.add(weaponLabelName);

        playerSetup();
    }

    public void playerSetup() {
        playerHP = 15;
        monsterHP = 20;
        weapon = "Knife";
        weaponLabelName.setText(weapon);
        hpLabelNumber.setText("" + playerHP);

        townGate();
    }

    public void townGate() {
        position = "townGate";
        mainTextArea.setText("You are at the gate of the town. \nA guard is standing in front of you. \n\nWhat will you do?");
        nav1.setText("Talk to the guard");
        nav2.setText("Attack the guard");
        nav3.setText("Leave");
        nav4.setText("");
    }

    public void talkGuard() {
        position = "talkGuard";
        mainTextArea.setText("Guard: Hello stranger. I have never seen your face. I am sorry but we cannot let a stranger enter our town.");
        nav1.setText(">");
        nav2.setText("");
        nav3.setText("");
        nav4.setText("");
    }

    public void attackGuard() {
        position = "attackGuard";
        mainTextArea.setText("Guard: Hey don't be stupid!\n\n The Guard fought back and hit you hard.\n (You take 3 damage)");
        playerHP = playerHP - 3;
        hpLabelNumber.setText("" + playerHP);
        nav1.setText(">");
        nav2.setText("");
        nav3.setText("");
        nav4.setText("");
    }

    public void crossRoad() {
        position = "crossRoad";
        mainTextArea.setText("You are at a crossroad.\n If you go south, you will go back to the town.");
        nav1.setText("Go north");
        nav2.setText("Go east");
        nav3.setText("Go south");
        nav4.setText("Go west");
    }

    public void north() {
        position = "north";
        mainTextArea.setText("There is a river.\n You drink the water and rest at the riverside.\n (Your HP is recovered by 2)");
        playerHP = playerHP + 2;
        hpLabelNumber.setText("" + playerHP);
        nav1.setText("Go south");
        nav2.setText("");
        nav3.setText("");
        nav4.setText("");
    }

    public void east() {
        position = "east";
        mainTextArea.setText("You walked into a forest and found a Long Sword!\n\n (You obtained a Long Sword)");
        weapon = "Long Sword";
        weaponLabelName.setText(weapon);
        nav1.setText("Go west");
        nav2.setText("");
        nav3.setText("");
        nav4.setText("");
    }

    public void west() {
        position = "west";
        mainTextArea.setText("You encounter a goblin!");
        nav1.setText("Fight");
        nav2.setText("Run");
        nav3.setText("");
        nav4.setText("");
    }

    public void fight() {
        position = "fight";
        mainTextArea.setText("Monter HP: " + monsterHP + "\n\nWhat do you do?");
        nav1.setText("Attack");
        nav2.setText("Run");
        nav3.setText("");
        nav4.setText("");
    }

    public void playerAttack() {
        position = "playerAttack";

        int playerDamage = 0;

        if (weapon.equals("Knife")) {
            playerDamage = new java.util.Random().nextInt(3);
        } else if (weapon.equals("Long Sword")) {
            playerDamage = new java.util.Random().nextInt(12);
        }

        mainTextArea.setText("You attacked the monster and gave " + playerDamage + " damage!");

        monsterHP = monsterHP - playerDamage;

        nav1.setText(">");
        nav2.setText("");
        nav3.setText("");
        nav4.setText("");
    }

    public void monsterAttack() {
        position = "monsterAttack";

        int monsterDamage = 0;

        monsterDamage = new java.util.Random().nextInt(6);

        mainTextArea.setText("The monster attacked you and gave " + monsterDamage + " damage!");

        playerHP = playerHP - monsterDamage;
        hpLabelNumber.setText("" + playerHP);

        nav1.setText(">");
        nav2.setText("");
        nav3.setText("");
        nav4.setText("");
    }

    public void win() {
        position = "win";

        mainTextArea.setText("You defeated the monster!\nThe monster dropped a ring!\n\n(You obtained a Silver Ring)");

        silverRing = 1;

        nav1.setText("Go east");
        nav2.setText("");
        nav3.setText("");
        nav4.setText("");

    }

    public void lose() {
        position = "lose";

        mainTextArea.setText("You are dead!\n\n");

        nav1.setText("");
        nav2.setText("");
        nav3.setText("");
        nav4.setText("");
        nav1.setVisible(false);
        nav2.setVisible(false);
        nav3.setVisible(false);
        nav4.setVisible(false);
    }
    
    public static void exit() {
        System.exit(0);
    }

    public void ending() {
        position = "ending";

        mainTextArea.setText("Guard: Oh you killed that goblin!?\nThank you so much. You are true hero!\nWelcome to our town!\n\n");

        nav1.setText("");
        nav2.setText("");
        nav3.setText("");
        nav4.setText("");
        nav1.setVisible(false);
        nav2.setVisible(false);
        nav3.setVisible(false);
        nav4.setVisible(false);
    }

    public class titleScreenHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            createGameScreen();
        }
    }

    public class navHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            String yourChoice = event.getActionCommand();

            switch (position) {
                case "townGate":
                    switch (yourChoice) {
                        case "n1":
                            if (silverRing == 1) {
                                ending();
                            } else {
                                talkGuard();
                            }
                            break;
                        case "n2":
                            attackGuard();
                            break;
                        case "n3":
                            crossRoad();
                            break;
//                        case "n4": break;
                    }
                    break;
                case "talkGuard":
                    switch (yourChoice) {
                        case "n1":
                            townGate();
                            break;
                    }
                    break;
                case "attackGuard":
                    switch (yourChoice) {
                        case "n1":
                            townGate();
                            break;
                    }
                    break;
                case "crossRoad":
                    switch (yourChoice) {
                        case "n1":
                            north();
                            break;
                        case "n2":
                            east();
                            break;
                        case "n3":
                            townGate();
                            break;
                        case "n4":
                            west();
                            break;
                    }
                    break;
                case "north":
                    switch (yourChoice) {
                        case "n1":
                            crossRoad();
                            break;
                    }
                    break;
                case "east":
                    switch (yourChoice) {
                        case "n1":
                            crossRoad();
                            break;
                    }
                    break;
                case "west":
                    switch (yourChoice) {
                        case "n1":
                            fight();
                            break;
                        case "n2":
                            crossRoad();
                            break;
                    }
                    break;
                case "fight":
                    switch (yourChoice) {
                        case "n1":
                            playerAttack();
                            break;
                        case "n2":
                            crossRoad();
                            break;
                    }
                    break;
                case "playerAttack":
                    switch (yourChoice) {
                        case "n1":
                            if (monsterHP < 1) {
                                win();
                            } else {
                                monsterAttack();
                            }
                            break;
                    }
                    break;
                case "monsterAttack":
                    switch (yourChoice) {
                        case "n1":
                            if (playerHP < 1) {
                                lose();
                            } else {
                                fight();
                            }
                            break;
                    }
                    break;
                case "win":
                    switch (yourChoice) {
                        case "n1":
                            crossRoad();
                    }
                    break;
            }

        }
    }
}

