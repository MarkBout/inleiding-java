package H13;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {
    public void init() {

    }
    //aanmaken functie en variabelen aanmaken
    void driehoekTekenen( Graphics g, int x1, int y1, int x2, int y2, int x3, int y3)
    {
        //coordinazt variabelen van de lijnen opzetten
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2, x3, y3);
        g.drawLine(x3, y3, x1, y1);

    }
    public void paint(Graphics g) {
        driehoekTekenen(g, 50,100,100,100,75,50);
    }
}
