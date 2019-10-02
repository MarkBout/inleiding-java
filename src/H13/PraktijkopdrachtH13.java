package H13;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

public class PraktijkopdrachtH13 extends Applet {


    public void init() {
        setSize(800,500);

    }

    public void paint(Graphics g) {
    boomTekenen(g);

    }
    public void boomTekenen(Graphics g) {
        //mooie kleur bruin maken
        Color Bruin = new Color(153, 102, 0);
        //kleuren voor boom
        Color Groen = Color.green;
        Color boomstam = Bruin;
        //grootes en lengtes voor boom
        int bladsize = 80;
        int Xas = 20;
        int Yas = 50;
        int hoogte = 120;
        int breete = 50;
        int boomstamX = 35;
        int boomstamY = 110;
        //mos tekenen
        for (int bosteller = 0; bosteller < 2; bosteller++) {
            //Rij een
            for (int rijteller = 0; rijteller < 5; rijteller++) {
                g.setColor(boomstam);
                g.fillRect(boomstamX, boomstamY, breete, hoogte);
                g.setColor(Groen);
                g.fillOval(Xas, Yas, bladsize, bladsize);

                Xas += bladsize;
                boomstamX += bladsize;
            }
            //rij twee
            for (int tweederij = 0; tweederij < 4; tweederij++) {
                Xas = 50;
                Yas = 80;
                boomstamX = 65;
                boomstamY = 140;

                g.setColor(boomstam);
                g.fillRect(boomstamX, boomstamY, breete, hoogte);
                g.setColor(Groen);
                g.fillOval(Xas, Yas, bladsize, bladsize);

                Xas += bladsize;
                boomstamX += bladsize;
            }
        }
    }
    }