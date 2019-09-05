package H05;
import java.awt.*;
import java.applet.*;

public class Variabelen extends Applet {
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.black;
        breedte = 200;
        hoogte = 100;

    }

    public void paint(Graphics g) {
        //lijn
        g.drawLine(50, 10,250, 10);
        //Rechthoek
        g.drawRect(50, 30, breedte, hoogte);
        //Rechthoek met ovaal
        g.setColor(opvulkleur);
        g.fillRect(300, 30, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawOval(300, 30, breedte, hoogte);
        //Taartpunt
        g.setColor(lijnkleur);
        g.drawOval(550, 30, breedte, hoogte);
        g.setColor(opvulkleur);
        g.fillArc(550, 30, breedte, hoogte, 0, 45);
        //Cirkel
        g.setColor(lijnkleur);
        g.drawOval(550, 175, breedte, breedte);
        //gevulde ovaal
        g.setColor(opvulkleur);
        g.fillOval(300, 175, breedte, hoogte);
        //rechthoek met kanten
        g.setColor(lijnkleur);
        g.drawRoundRect(50, 175, breedte, hoogte,30,30);
    }

}
