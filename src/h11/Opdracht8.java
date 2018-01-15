package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht8 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller = 0;
        int x = 250;
        int r = 0;
        int y = 250;

        do {
            x -= 5;
            r += 10;
            y -= 5;
            g.drawArc(10,10,r,r,0,360);
            teller++;
        } while (teller < 100);
    }
}