package h01;

import java.awt.*;
import java.applet.*;

public class tekenpraktijk extends Applet {public void init() {
}

    public void paint(Graphics g){
        setBackground(Color.white);
        g.drawLine(10,10, 90, 10);
        g.drawRect(10, 30,140, 60);
        g.setColor(Color.magenta);
        g.fillRect(160, 30, 140, 60);
        g.setColor(Color.black);
        g.drawOval(160, 30,140,60);
        g.drawOval(10, 120, 120,80);
        g.setColor(Color.magenta);
        g.fillArc(10, 120, 120,80,0,50);
        g.setColor(Color.black);
        g.drawRoundRect(150, 120,140, 60, 20, 20);
        g.setColor(Color.magenta);
        g.fillOval(10, 220, 120,80);
        g.setColor(Color.black);
        g.drawArc(150, 190, 100,100,0,360);
    }
}