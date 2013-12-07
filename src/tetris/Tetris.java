/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tetris;

import javax.swing.JFrame;

/**
 *
 * @author joelnpam
 */
public class Tetris {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Drawing gp = new Drawing();
        JFrame j = new JFrame();
        
        j.setSize(600, 800);
        j.setResizable(false);
	j.add(gp);        
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	j.setVisible(true);
    }
    
}
