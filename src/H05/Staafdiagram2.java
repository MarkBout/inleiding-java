package H05;
import java.awt.*;
import java.applet.*;

public class Staafdiagram2 extends Applet{

    //Variabelen
    int gewichtJeroen;
    int gewichtValerie;
    int gewichtHans;
    int hoogteXas;
    int ruimte;


    public void init() {
         setSize(400,400);
         gewichtValerie = 40;
         gewichtJeroen = 100;
         gewichtHans = 80;
         hoogteXas = 350;
         ruimte = 10;
    }


    public void paint(Graphics d) {
        //Verticale lijn
        d.drawLine(50,50,50,hoogteXas);
        //Horizontaale lijn
        d.drawLine(50,hoogteXas,hoogteXas,hoogteXas);
        //tekenen staven
            //Valerie
        d.setColor(Color.green);
        d.fillRect(50 + 20, hoogteXas - gewichtValerie, 50, gewichtValerie);
            //Jeroen
        d.setColor(Color.YELLOW);
        d.fillRect(100 + 40, hoogteXas - gewichtJeroen, 50, gewichtJeroen);
            //Hans
        d.setColor(Color.RED);
        d.fillRect(150 + 60, hoogteXas - gewichtHans, 50, gewichtHans);
    }
}
