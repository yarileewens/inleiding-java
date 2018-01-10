package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht6 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller = 0;
        int x = 30;
        int r = 0;

        do {
            x += 5;
            r += 10;
            g.drawArc(x,x,r,r,0,360);
            teller++;
        } while (teller < 5);
    }
}