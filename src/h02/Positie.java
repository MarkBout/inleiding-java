package h02;
import java.awt.*;
import java.applet.*;

//maakt achtergrond wit
public class Positie extends Applet {
    public void init(){
        setBackground(Color.white);
    }
//zet voornaam in het rood
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawString("Mark", 100 , 100);
        //zet achternaam in het blauw onder m'n voornaam
        g.setColor(Color.blue);
        g.drawString("Bout", 100 , 110);
    }
}
