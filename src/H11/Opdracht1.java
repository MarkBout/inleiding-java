package H11;
import java.awt.*;
import java.applet.*;


public class Opdracht1 extends Applet{

    public void init()
    {
        setSize(400, 400);
    }

    public void paint(Graphics g)
    {
        int teller;
        int x = 0;
        for(teller = 1; teller < 11; teller++)
        {
            x += 20;
            g.drawLine( x, 50, x, 150);
            g.drawString("" + teller, x, 160);
        }
    }
}
