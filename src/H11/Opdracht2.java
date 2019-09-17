package H11;
import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet{
    public void init()
    {
        setSize(400,400);

    }


    public void paint(Graphics g) {
        int teller;
        int y = 50;
        for(teller = 20; teller > 9; teller--)
        {
            g.drawString("" + teller,20,y);
            y += 15;
        }
    }
}
