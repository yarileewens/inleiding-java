package h011;

import java.awt.*;
import java.applet.*;


public class Opdracht2 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller = 20;
        int y = 0;

        while(teller > 10) {
            y += 20;
            g.drawString("" + teller, 305, y );
            teller--;
        }
    }
}