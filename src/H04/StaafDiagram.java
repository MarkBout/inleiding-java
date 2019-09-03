package H04;
import java.awt.*;
import java.applet.*;

public class StaafDiagram extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine( 50, 50, 50, 150);
        g.drawLine(50, 150, 200, 150);
    }
}
