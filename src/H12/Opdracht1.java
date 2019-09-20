package H12;
import java.awt.*;
import java.applet.*;

public class Opdracht1 extends Applet{

    double[] cijfers = {6.5, 3, 7.2, 9, 2, 4.9, 2, 4.1, 8.2, 1.5};
    double totaal;
    int teller;

    public void init()
    {
        for ( teller = 0; teller < cijfers.length; teller++)
        {
            totaal += cijfers[teller];
        }
        totaal /= teller;
    }

    public void paint(Graphics g)
    {
        for (int i = 0; i < cijfers.length; i++)
        {
            g.drawString("" + cijfers[i],50,20 * i +20);
            g.drawString("Het gemiddelde is: " + totaal,100,20);
        }
    }


}
