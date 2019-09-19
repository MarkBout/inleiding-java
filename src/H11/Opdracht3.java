package H11;
import java.awt.*;
import java.applet.*;

public class Opdracht3 extends Applet
{
    int maxnummer;
    int eerste;
    int tweede;
    int y;

    public void init()
    {
        setSize(400, 400);
        maxnummer = 20;
        eerste = 0;
        tweede = 1;
        y = 50;
    }

    public void paint(Graphics g)
    {
        for (int i = 1; i < maxnummer; i++)
            {
                int totaal = eerste + tweede;
                eerste = tweede;
                tweede = totaal;

                g.drawString(tweede + "",50,y);
                y += 15;
            }
    }
}