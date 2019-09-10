package H10;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht103 extends Applet {

    TextField tekstveld;
    int maandnummer;
    String s;
    String maand;
    String aantal;


    @Override
    public void init() {
        maandnummer = 0;
        tekstveld = new TextField(20);
        tekstveld.addActionListener(new Veldluister());
        add(tekstveld);
    }
    public void paint(Graphics g) {
        g.drawString("Er zitten " + aantal + " dagen in de maand " + maand, 20, 50);
    }


    public class Veldluister implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            s = tekstveld.getText();
            maandnummer = Integer.parseInt(s);
            switch (maandnummer){
                case 1:
                    aantal = "31";
                    maand = "Januari";
                    break;
                case 2:
                    aantal = "28";
                    maand = "Februari";
                    break;
                case 3:
                    aantal = "31";
                    maand = "Maart";
                    break;
                case 4:
                    aantal = "30";
                    maand = "April";
                    break;
                case 5:
                    aantal = "31";
                    maand = "Mei";
                    break;
                case 6:
                    aantal = "30";
                    maand = "Juni";
                    break;
                case 7:
                    aantal = "31";
                    maand = "Juli";
                    break;
                case 8:
                    aantal = "31";
                    maand = "Augustus";
                    break;
                case 9:
                    aantal = "30";
                    maand = "September";
                    break;
                case 10:
                    aantal = "31";
                    maand = "Oktober";
                    break;
                case 11:
                    aantal = "30";
                    maand = "November";
                    break;
                case 12:
                    aantal = "31";
                    maand = "December";
                    break;
            }
            repaint();
        }
    }
}