/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author joelnpam
 */
public class Input implements KeyListener {

    int rotation = 0;
    int direction = 0;
    boolean accelerate = false;

    public void keyTyped(KeyEvent e) {
        if (e.getKeyCode() == e.VK_UP) {
            if (rotation < 3) {
                rotation++;
            } else {
                rotation = 0;
            }
        }
        if (e.getKeyCode() == e.VK_Z) {
            if (rotation > 0) {
                rotation--;
            } else {
                rotation = 3;
            }
        }
        if (e.getKeyCode() == e.VK_LEFT) {
            
        }
        
        if (e.getKeyCode() == e.VK_RIGHT) {
            
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == e.VK_DOWN) {
            accelerate = true;
        } else {
            accelerate = false;
        }
        if (e.getKeyCode() == e.VK_LEFT) {
            direction = -1;
        }
        
        if (e.getKeyCode() == e.VK_RIGHT) {
            direction = 1;
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == e.VK_LEFT) {
            direction = 0;
        }
        
        if (e.getKeyCode() == e.VK_RIGHT) {
            direction = 0;
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
