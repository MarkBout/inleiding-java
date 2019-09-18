package H11;
import java.awt.*;
import java.applet.*;

public class Opdracht9 extends Applet {
    int rij;
    int y;

    public void init() {
        setSize(500, 500);
        setBackground(Color.orange);
        y = 50;
    }

    public void paint(Graphics g) {
        //rijenTeller
        for (rij = 0; rij < 8; ) {
            //X-as steeds op de goede plek zetten
            int x = 50;
            //Rijen met eerste bloke zwart
            if (rij == 0 || rij == 2 || rij == 4 || rij == 6) {
                for (int kolom = 0; kolom <= 8; kolom++) {
                    //velden zwart/wit maken
                    if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6 || kolom == 8) {
                        g.setColor(Color.black);
                        g.fillRect(x, y, 20, 20);
                    } else {
                        g.setColor(Color.white);
                        g.fillRect(x, y, 20, 20);
                    }
                    //opschuiven voor volgend vierkantje
                    x += 20;

                }
                //ruimte maken voor rij eronder
                y += 20;
            }
            //Rijen met eerste bloke wit
            else if (rij == 1 || rij == 3 || rij == 5 || rij == 7) {
                for (int kolom = 0; kolom <= 8; kolom++) {
                    //velden zwart/wit maken
                    if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6 || kolom == 8) {
                        g.setColor(Color.white);
                        g.fillRect(x, y, 20, 20);
                    } else {
                        g.setColor(Color.black);
                        g.fillRect(x, y, 20, 20);
                    }
                    //opschuiven voor volgende vierkant
                    x += 20;
                }
                //ruimte maken voor rijen eronder
                y += 20;
            }
            rij++;
        }
    }
}