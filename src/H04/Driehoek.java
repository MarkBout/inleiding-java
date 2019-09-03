package H04;
import java.awt.*;
import java.applet.*;

public class Driehoek extends Applet {

    public void init() {
    }

    /*test voor mij om het lijnen tekenen te snappen
    public void paint(Graphics g) {
        g.drawLine(50, 100, 270, 50);
    }*/

    //Driehoek
    public void paint(Graphics g) {
    g.drawLine(20 , 100, 80 , 100);
    g.drawLine(20, 100, 40 , 50);
    g.drawLine(80, 100, 40 , 50);

    }
}