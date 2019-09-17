package H11;
import java.awt.*;
import java.applet.*;

public class Opdracht5 extends Applet{

    public void init() {

    }
    public void paint(Graphics g) {
        int teller;
        int x,y;
        x = 20;
        y = 50;
        for (teller = 0; teller < 5; teller++)
        {
            g.drawRect(x,y,20,20);
            x += 20;
            y += 20;
        }
    }
}
