
package picture_puzzle_project;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Puzzle1 extends JFrame {

    JButton[][] sq = new JButton[4][4];
    int m, n;

    public Puzzle1() {
        this.setResizable(false);
        Container container = getContentPane();
        container.setLayout(new GridLayout(4, 4));

        ButaneListener pushed = new ButaneListener();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                JButton n = new JButton();
                sq[i][j] = n;
                sq[i][j].addActionListener(pushed);
                sq[i][j].setBackground(new Color(104,105,60));
                container.add(sq[i][j]);
            }
        }
    }

    public static void main(String args[]) {
        Thread obj = new Thread(new Runnable(){
        @Override
        public void run() {
            GameMusic ob = new GameMusic();
            ob.music();
        }
        
        
    });
        obj.start();
        
        Puzzle1 game = new Puzzle1();
        game.setTitle("THE FIFTEEN PUZZLE");
        game.setVisible(true);
        game.setSize(800, 800);
        game.scramble();
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
    }

    public void scramble() {
        boolean[] used = new boolean[16];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int val = (int) (16 * Math.random());
                while (used[val]) {
                    val = (int) (16 * Math.random());
                }
                used[val] = true;
                if (val != 0) {
                    sq[i][j].setText("" + val);
                    Font numberFont = new Font("Arial",Font.BOLD,35);
                    sq[i][j].setFont(numberFont);
                } else {
                    sq[i][j].setBackground(Color.gray);
                    m = i;
                    n = j;
                }
            }
        }
    }

    class ButaneListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Object square = e.getSource();
            outer:
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (sq[i][j] == square) {
                        moves(i, j);
                        break outer;
                    }
                }
            }
        }
    }

    public void moves(int i, int j) {
        if ((i + 1 == m && j == n) || (i - 1 == m && j == n) || (i == m && j + 1 == n) || (i == m && j - 1 == n)) {
            sq[m][n].setText(sq[i][j].getText());
            sq[m][n].setBackground(new Color(104,105,106));
            sq[i][j].setText("");
            sq[i][j].setBackground(Color.white);
            m = i;
            n = j;
        }
    }
}

