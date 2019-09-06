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
    Color tekstkleur;


    public void init() {
         setSize(400,400);
         gewichtValerie = 40;
         gewichtJeroen = 100;
         gewichtHans = 80;
         hoogteXas = 350;
         ruimte = 10;
         tekstkleur = Color.black;
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
        //teksten en numering van tabel
            //Valerie
        d.setColor(tekstkleur);
        d.drawString("Valerie", 75, hoogteXas +15);
            //Hans
        d.setColor(tekstkleur);
        d.drawString("Hans", 210, hoogteXas +15);
            //Jeroen
        d.setColor(tekstkleur);
        d.drawString("Jeroen", 140, hoogteXas +15);
        //Nummering
        d.drawString("0", 35, hoogteXas);
        d.drawString("20", 35, hoogteXas - 20);
        d.drawString("40", 35, hoogteXas - 40);
        d.drawString("60", 35, hoogteXas - 60);
        d.drawString("80", 35, hoogteXas - 80);
        d.drawString("100", 27, hoogteXas - 100);
        d.drawString("120", 27, hoogteXas - 120);
        d.drawString("140", 27, hoogteXas - 140);
        d.drawString("160", 27, hoogteXas - 160);
        d.drawString("180", 27, hoogteXas - 180);
        d.drawString("200", 27, hoogteXas - 200);
        d.drawString("220", 27, hoogteXas - 220);
        d.drawString("240", 27, hoogteXas - 240);
        d.drawString("260", 27, hoogteXas - 260);
        d.drawString("280", 27, hoogteXas - 280);
        d.drawString("300", 27, hoogteXas - 300);

    }
}
