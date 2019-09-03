package H04;
import java.awt.*;
import java.applet.*;

public class Huis extends Applet {

    public void init() {

    }

    //huis met raam en deur
    public void paint(Graphics g) {
        //frame van het huis
       g.drawRect(50, 100, 200, 150);
       //de deur
       g.drawRect(100, 175 , 50 , 75);
       //raam
       g.drawRect(170 , 110 , 50 , 50);
    }
}
