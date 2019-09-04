package H04;
import java.awt.*;
import java.applet.*;

public class Arc extends Applet {

    //Achrwegrondkleur
    public void init() {
        setBackground(Color.BLUE);
    }

    //Gele elips
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillArc(20, 20, 50, 120, 90, 360);
    }
}
