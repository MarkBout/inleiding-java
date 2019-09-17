package H11;
import java.awt.*;
import java.applet.*;

public class Opdracht4 extends Applet {
    public void init()
    {
        setSize(400, 400);
    }

    public void paint(Graphics g)
    {
        int uitkomst;
        int cijfer = 1;
        int teller;
        int y = 20;
        for (teller = 0; teller < 10; teller++)
        {
            uitkomst = cijfer * 3;
            g.drawString("" + uitkomst, 20, y);
            cijfer++;
            y += 15;
        }
    }
}
