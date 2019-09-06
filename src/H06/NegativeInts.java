package H06;

import java.applet.Applet;
import java.awt.*;

public class NegativeInts extends Applet {

    int teller;
    int uitkomst;


    public void init() {
        teller = 2147483647;
        uitkomst = 0;
    }


    public void paint(Graphics g) {
        uitkomst = teller + teller;
        g.drawString("Uitkomst: " + uitkomst, 20, 20);

    }
}
