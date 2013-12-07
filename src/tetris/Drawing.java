/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Drawing extends JPanel {

    int[][] arrayOfColorBlocks = new int[10][20];
    
    BufferedImage img = null;
    BufferedImage red = null;
    BufferedImage blue = null;
    BufferedImage green = null;
    BufferedImage purple = null;
    BufferedImage orange = null;
    BufferedImage yellow = null;
    BufferedImage teal = null;

    {
        try {
            img = ImageIO.read(new File("Field.jpg"));
            red = ImageIO.read(new File("Red.png"));
            blue = ImageIO.read(new File("Blue.png"));
            green = ImageIO.read(new File("Green.png"));
            purple = ImageIO.read(new File("Purple.png"));
            orange = ImageIO.read(new File("Orange.png"));
            yellow = ImageIO.read(new File("Yellow.png"));
            teal = ImageIO.read(new File("Teal.png"));
        } catch (IOException ie) {
            System.out.println("Did not find images");
        }
    }

    int xPos = 300-150;
    int yPos = 400-300;
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        arrayOfColorBlocks[1][2] = 3;
        arrayOfColorBlocks[9][0] = 1;
        arrayOfColorBlocks[5][19] = 6;
        
        g.setColor(Color.GRAY);
        g.fillRect( 0, 0, 600, 760);
        g.setColor(Color.BLACK);
        g.fillRect(xPos, yPos, 300, 600);
        g.setColor(Color.WHITE);
        g.drawRect(xPos, yPos, 300, 600);
        g.setColor(Color.GRAY);
        for(int x = 30; x<300;x+=30){
            g.drawLine(xPos+x,yPos+1, xPos+x,yPos-1+600);
        }
        for(int y = 30; y<600;y+=30){
            g.drawLine(xPos+1,yPos+y, xPos-1+300,yPos+y);
        }
        drawArray(arrayOfColorBlocks, g);
        
    }
    
    public void drawArray(int[][]colorBlockArray, Graphics g){
        for(int x = 0;x<colorBlockArray.length;x++){
            for(int y = 0; y<colorBlockArray[x].length;y++){
                if(colorBlockArray[x][y] == 0){
                    
                }else if(colorBlockArray[x][y] == 1){
                    g.drawImage(red, xPos+x*30, yPos+y*30, this);
                }else if(colorBlockArray[x][y] == 2){
                    g.drawImage(blue, xPos+x*30, yPos+y*30, this);
                }else if(colorBlockArray[x][y] == 3){
                    g.drawImage(green, xPos+x*30, yPos+y*30, this);
                }else if(colorBlockArray[x][y] == 4){
                    g.drawImage(purple, xPos+x*30, yPos+y*30, this);
                }else if(colorBlockArray[x][y] == 5){
                    g.drawImage(orange, xPos+x*30, yPos+y*30, this);
                }else if(colorBlockArray[x][y] == 6){
                    g.drawImage(yellow, xPos+x*30, yPos+y*30, this);
                }else if(colorBlockArray[x][y] == 7){
                    g.drawImage(teal, xPos+x*30, yPos+y*30, this);
                }
            }
        }
    }
}
