package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht8 extends Applet {
    TextField tekstvak;
    TextField tekstvak2;
    Button plusKnop;
    Button minKnop;
    Button keerKnop;
    Button deelKnop;
    double a;
    double b;
    double antwoord;

    public void init() {
        tekstvak = new TextField("", 10);
        tekstvak2 = new TextField("", 10);
        plusKnop = new Button("+");
        plusKnop.addActionListener(new PlusknopListener());
        minKnop = new Button("-");
        minKnop.addActionListener(new MinknopListener());
        keerKnop = new Button("*");
        keerKnop.addActionListener(new KeerknopListener());
        deelKnop = new Button("/");
        deelKnop.addActionListener(new DeelknopListener());
        add(tekstvak);
        add(tekstvak2);
        add(plusKnop);
        add(minKnop);
        add(keerKnop);
        add(deelKnop);
    }

    public void paint(Graphics g) {
        g.drawString(String.valueOf(antwoord), 50, 60);
    }

    class PlusknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            a = Double.parseDouble(tekstvak.getText());
            b = Double.parseDouble(tekstvak2.getText());
            antwoord = a + b;
            repaint();
        }
    }

    class MinknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            a = Double.parseDouble(tekstvak.getText());
            b = Double.parseDouble(tekstvak2.getText());
            antwoord = a - b;
            repaint();
        }
    }

    class KeerknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            a = Double.parseDouble(tekstvak.getText());
            b = Double.parseDouble(tekstvak2.getText());
            antwoord = a * b;
            repaint();
        }
    }

    class DeelknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            a = Double.parseDouble(tekstvak.getText());
            b = Double.parseDouble(tekstvak2.getText());
            antwoord = a / b;
            repaint();
        }
    }
}


