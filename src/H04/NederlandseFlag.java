package H04;
import java.awt.*;
import java.applet.*;

public class NederlandseFlag extends Applet {

    public void init()
    {
    setBackground(Color.black);
    }

    public void paint(Graphics g)
    {
        //rood van de flag
        g.setColor(Color.red);
        g.fillRect(50, 50, 150, 50);
        //wit van de flag
        g.setColor(Color.white);
        g.fillRect(50, 100, 150, 50);
        //blauw van de flag
        g.setColor(Color.blue);
        g.fillRect(50, 150, 150, 50);
        //stok van de flag
        g.setColor(Color.gray);
        g.fillRect(50 , 50, 20, 250);
    }

}
