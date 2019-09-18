package H11;
import java.awt.*;
import java.applet.*;

public class Opdracht8 extends Applet{

    public void init() {
        setSize(800,800);
    }

    public void paint(Graphics g) {
    int teller;
    int lengte, breete;
    lengte = 20;
    breete = 20;

    for (teller = 0; teller < 100; teller++)
    {
        g.drawOval(40,10,lengte,breete);
        lengte += 10;
        breete += 10;
    }

    }
}
