package H06;

import java.applet.Applet;
import java.awt.*;

public class Verdelen extends Applet {

    //Variabelen
    double salaris;
    double uitkomst;


    public void init() {
        salaris = 113;
        uitkomst = 0;
    }

    public void paint(Graphics g) {
        uitkomst = salaris / 4;
        g.drawString("Salaris Jan: " + uitkomst, 20 ,20);
        g.drawString("Salaris Ali: " + uitkomst, 20 ,30);
        g.drawString("Salaris Jeannette: " + uitkomst, 20 ,40);
        g.drawString("Salaris Mark: " + uitkomst, 20 ,50);


    }
}
