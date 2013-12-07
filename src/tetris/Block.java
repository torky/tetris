/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tetris;

/**
 *
 * @author joelnpam
 */
public abstract class Block {
    
    int[][] absoluteCoordinates = new int[4][2];
    int[][] axis = new int [1][1];
    int currentOrientation = 0;
    
    public void moveDown() {
        for (int[] absoluteCoordinate : absoluteCoordinates) {
            absoluteCoordinate[1] -= 1;
        }
    }
    
    public void moveSide(int direction) {
        //Move the block to the side
        //direction parameter specifies left or right
        // -1 is left, 1 is right
        
        for (int[] absoluteCoordinate : absoluteCoordinates) {
            absoluteCoordinate[0] += direction;
        }
    }
    public abstract void rotate(int direction);
}
