package H13;
import java.applet.*;
import java.awt.*;

public class Opdracht2 extends Applet
{
    public void init() {
        setSize(400,400);

    }

    void muurTekenen(Graphics g, int x1, int y1, int beete, int hoogte)
    {
        int steenteller;
        boolean rij2 = false;
        for (steenteller = 0; steenteller < 5; steenteller++)
        {
            g.setColor(Color.red);
            g.fillRect(x1, y1, beete, hoogte);
            g.setColor(Color.black);
            g.drawRect(x1, y1, beete, hoogte);
            x1  += beete;
        }
        if (steenteller == 5)
        { rij2 = true; }
        if (rij2)
        {
            for (int muurteller = 0; muurteller < 5; muurteller++) {
                x1 = 20;
                y1 += hoogte;
                for (steenteller = 0; steenteller < 5; steenteller++) {
                    g.setColor(Color.red);
                    g.fillRect(x1, y1, beete, hoogte);
                    g.setColor(Color.black);
                    g.drawRect(x1, y1, beete, hoogte);
                    x1 += beete;
                }
            }
        }
        }
    public void paint(Graphics g)
    {
        muurTekenen(g,20,50,100,50);
    }
}
