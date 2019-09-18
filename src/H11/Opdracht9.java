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
        for (rij = 0; rij < 8; ) {

            int x = 50;
            //eerste rij
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
                y += 20;
            }
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
                y += 20;
            }
            rij++;
        }
    }
}