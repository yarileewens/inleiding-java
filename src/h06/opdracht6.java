package h06;

import java.awt.*;
import java.applet.*;


public class opdracht6 extends Applet {
    int a, b, c;
    double uitkomst;


    public void init() {
        a = 59+63+69;
        b = 3;
        uitkomst = a/b;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}