package h02;
import java.awt.*;
import java.applet.*;

public class MijnNaam extends Applet {

    //maak de achtergrond blauw
    public void init()
    {
        setBackground(Color.blue);
    }

    //maakt mijn naam geel
    public void paint(Graphics g)
    {
     g.setColor(Color.yellow);
     g.drawString("Mark Hendrik Bout", 100, 100);
    }

}
