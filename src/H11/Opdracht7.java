package H11;
import java.awt.*;
import java.applet.*;

public class Opdracht7 extends Applet {

    public void init() {
        setSize(600,600);

    }
    public void paint(Graphics g) {
        int teller;
        int lengte, breete, x, y;
        x = 250;
        y = 250;
        lengte = 20;
        breete = 20;
        for (teller = 0; teller < 50; teller++)
        {
            g.drawOval(x,y,lengte,breete);
            x += -5;
            y += -5;
            lengte += 10;
            breete += 10;
        }
    }
}
