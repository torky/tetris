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

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.GRAY);
        g.fillRect( 0, 0, 600, 800);
        //g.drawImage(red, 0, 0, this);
        g.setColor(Color.BLACK);
        g.fillRect(300-150, 400-300, 300, 600);
        g.setColor(Color.WHITE);
        g.drawRect(300-150, 400-300, 300, 600);
    }
}
