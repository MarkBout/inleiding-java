package H05;
import java.awt.*;
import java.applet.*;

public class Variabelen extends Applet {
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    @Override
    public void init() {
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.black;
        breedte = 200;
        hoogte = 100;
    }

    public void paint(Graphics g) {
        //rechthoek
    g.drawRect(100, 100, breedte, hoogte);
        //afgewerkte rechthoek
    g.drawRoundRect(100, 255, breedte, hoogte, 30, 30);
    //opgevulde rechthoek kleur
    g.setColor(opvulkleur);
    g.fillRect(315, 100, breedte, hoogte);
    g.setColor(lijnkleur);
    g.drawOval(315, 100, breedte, hoogte);
    }
}
