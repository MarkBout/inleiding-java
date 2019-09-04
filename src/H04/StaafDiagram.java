package H04;
import java.awt.*;
import java.applet.*;

public class StaafDiagram extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        //verticale lijn
        g.drawLine( 50, 50, 50, 150);
        //horizontaale lijn
        g.drawLine(50, 150, 250, 150);
        //namen kinderen
        g.drawString("Jeroen", 60 , 160);
        g.drawString("Hans", 120, 160);
        g.drawString("Valerie", 180, 160);
        //nummering
        g.drawString("0", 40 , 150);
        g.drawString("20", 35, 130);
        g.drawString("40", 35, 110);
        g.drawString("60", 35, 90);
        g.drawString("80", 35, 70);
        g.drawString("100", 30, 50);
        //Staafdiagramen
            //jeroen
        g.setColor(Color.MAGENTA);
        g.fillRect(70, 50, 20, 100);
            //Hans
        g.setColor(Color.orange);
        g.fillRect(125 , 70, 20, 80);
            //Valerie
        g.setColor(Color.green);
        g.fillRect(190, 110, 20, 40);

    }
 }
