package H13;
import java.applet.*;
import java.awt.*;

public class Opdracht2 extends Applet
{
    public void init() {

    }

    void muurTekenen(Graphics d, int x1, int y1, int beete, int hoogte)
    {
        d.setColor(Color.red);
        d.fillRect(x1,y1,beete,hoogte);
    }
    public void paint(Graphics g) {
        muurTekenen();
    }
}
