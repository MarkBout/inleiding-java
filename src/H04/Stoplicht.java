package H04;
import java.awt.*;
import java.applet.*;

public class Stoplicht extends Applet
{
    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRoundRect(50 , 100 , 100, 300, 10, 10);
        g.setColor(Color.red);
        g.fillOval(60, 110, 80, 80);
        g.setColor(Color.orange);
        g.fillOval(60, 200, 80, 80);
        g.setColor(Color.green);
        g.fillOval(60, 290, 80, 80);
    }
}
