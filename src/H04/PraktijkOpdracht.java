package H04;
import java.awt.*;
import java.applet.*;
public class PraktijkOpdracht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        //lijn
        g.drawLine(10, 50, 100, 50);
        g.drawString("Lijn",50, 70);
        //rechthoek
        g.drawRect(10, 80, 100, 50);
        g.drawString("Rechthoek", 30, 145);
        //Afgeronde rechthoek
        g.drawRoundRect(10, 150, 100, 50, 30, 30);
        g.drawString("Afgeronde Rechthoek", 10, 220);
    }
}
