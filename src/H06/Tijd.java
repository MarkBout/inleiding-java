package H06;

import java.applet.Applet;
import java.awt.*;

public class Tijd extends Applet {

    double seconden;

    public void init() {
        seconden = 60;
    }

    public void paint(Graphics g) {
        g.drawString("Seconden in een minuut: " + seconden, 20, 20);
        g.drawString("seconden in een uur: " + seconden*60, 20, 35);
        g.drawString("Seconden in een dag: " + seconden*60*24, 20 ,50);
        g.drawString("seconden in een jaar: " + seconden *60*24*365, 20, 65);
    }
}
