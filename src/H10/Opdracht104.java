package H10;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht104 extends Applet {

    TextField tekstveld;
    int maandnummer, jaar;
    String s, s2;
    String maand, jaart;
    String aantal;
    TextField jaartal;



    public void init() {
        maandnummer = 0;
        tekstveld = new TextField("maand nr", 10);
        jaartal = new TextField("jaartal",10);
        jaartal.addActionListener(new Veldluister());
        tekstveld.addActionListener(new Veldluister());
        add(jaartal);
        add(tekstveld);

    }
    public void paint(Graphics g) {
        g.drawString("Er zitten " + aantal + " dagen in de maand " + maand, 20, 50);
        g.drawString(jaart,20,70);
    }


    public class Veldluister implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            //schrikkeljaar vinden
            s2 = jaartal.getText();
            jaar = Integer.parseInt(s2);
            if ( (jaar % 4 == 0 && !(jaar % 100 == 0)) ||
                    jaar % 400 == 0 ){
                jaart = "" + jaar + " Is een schrikkeljaar";}
                else{
                    jaart = "" + jaar + " is geen schrikkeljaar";
                }
            //maand en dag zoeken
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
                default: aantal = "Ongeldig";
                maand = "Ongeldige maand";
            }
            repaint();
        }
    }
}
