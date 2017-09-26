package h01;

import java.awt.*;
import java.applet.*;

public class HalloRocDev extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.drawLine(300,300,100,300);
        g.drawLine(100,300,100,200);
        g.setColor(Color.black);
        g.fillRect(110,280,10,20);
        g.fillRect(130,260,10,40);
        g.fillRect(150,230,10,70);
        g.drawString("40 -",80,285);
        g.drawString("80 -",80,265);
        g.drawString("100 -",75,235);
    }
}