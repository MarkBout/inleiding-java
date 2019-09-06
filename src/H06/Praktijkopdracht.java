package H06;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht extends Applet {
    double cijfer1;
    double cijfer2;
    double cijfer3;
    double uitkomst;
    int conversie;
    double resultaat;

    public void init() {
        cijfer1 = 5.9;
        cijfer2 = 6.3;
        cijfer3 = 6.9;
        uitkomst = 0;
        conversie = 0;
        resultaat = 0;
    }

    public void paint(Graphics g) {
        //gemiddelde wordt berekend geconverteerd naar int en weer terug naar double
        uitkomst = (cijfer1 + cijfer2 + cijfer3) / 3;
        conversie = (int) uitkomst *10;
        resultaat = conversie;
        resultaat = resultaat / 10;

        //weergeven resultaat
        g.drawString("Je gemiddelde is: " + resultaat, 20, 20);


    }
}
