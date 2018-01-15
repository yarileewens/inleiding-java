package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht9 extends Applet {

    public void paint(Graphics g) {
        int y = 50;
        int x = 50;
        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y,10 ,10 );
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, 10, 10);
            }
            x += 10;
        }

        x = 50;
        y += 20;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, 10, 10);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, 10, 10);

            }
            x += 10;
        }
    }}