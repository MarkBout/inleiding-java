package H13;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Opdracht3 extends Applet
{
    Button beton, steen;
    public void init() {
        setSize(600,600);
        beton = new Button("betonmuur");
        steen = new Button("steenmuur");
        beton.addActionListener(new Betonmuurlistener());
        steen.addActionListener(new Steenlistener());
        add(beton);
        add(steen);
    }

    public void paint(Graphics g) {

    }
    public class Betonmuurlistener implements ActionListener
    {
        public void actionPerformed(ActionEvent e) {

        }
    }

    public class Steenlistener implements ActionListener
    {
        public void actionPerformed(ActionEvent e) {

        }
    }
 }
