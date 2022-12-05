package Assignment13;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Smiling extends Applet {


    public void init() {
        setSize(500,500);
    }
    public void paint(Graphics g){
        g.setColor(Color.yellow);
        g.fillOval(100, 100, 300, 300);
        g.setColor(Color.BLACK);
        g.fillOval(180, 190, 30  , 50);
        g.fillOval(290, 190, 30  , 50);
        g.fillOval(235, 240, 30  , 30);
        g.fillArc(200, 290, 110,50, 0, -180);
        g.setColor(Color.ORANGE);
        g.fillArc(75, 200, 50, 50, 70, 200);
        g.fillArc(375, 200, 50, 50,102, -190);
    }
}