package H11;
import java.awt.*;
import java.applet.*;

public class Opdracht6 extends Applet{

    public void init() {
    }


    public void paint(Graphics g) {
        int teller;
        int lengte, breete, x, y;
        x = 50;
        y = 50;
        lengte = 20;
        breete = 20;
        for (teller = 0; teller < 5; teller++)
            {
                g.drawOval(x,y,lengte,breete);
                x += -5;
                y += -5;
                lengte += 10;
                breete += 10;
            }
    }
}
