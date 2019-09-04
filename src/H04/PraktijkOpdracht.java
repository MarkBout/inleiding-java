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
        //Gevulde ovaal
        g.setColor(Color.magenta);
        g.fillOval(130, 150, 100, 50);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal", 145, 220);
        //Cirkel
        g.drawOval(250, 150, 50, 50);
        g.drawString("Cirkel", 250, 220);
        //Gevulde rechthoek met ovaal
        g.setColor(Color.magenta);
        g.fillRect(130, 80, 100, 50);
        g.setColor(Color.black);
        g.drawOval(130, 80, 100, 50);
        g.drawString("Gevulde rechthoek ovaal", 130, 145);
        //Taartpunt met ovaal
        g.drawOval(250, 80, 100, 50);
        g.setColor(Color.magenta);
        g.fillArc(250, 80, 100, 50, 0, 45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal", 280, 145);
    }
}
