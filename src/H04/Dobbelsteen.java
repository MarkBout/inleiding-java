package H04;
import java.awt.*;
import java.applet.*;

public class Dobbelsteen extends Applet {

    public void init() {
    }

    //dobbelsteen met de 4 naar boven
    public void paint(Graphics g) {
        g.drawRoundRect(100, 100, 150, 150, 10, 10);
        g.fillOval(110, 110 , 50,50);
        g.fillOval(110, 190 , 50,50);
        g.fillOval(190, 110 , 50,50);
        g.fillOval(190, 190 , 50,50);
    }
}
