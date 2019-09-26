package H12;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.Arrays;

public class PraktijkopdrachtH12 extends Applet{
    TextField[] namen;
    TextField[] nummers;
    Button nextknop;
    int aantal;
    public void init() {
        //tekstvelden toevoegen
        nummers = new TextField[10];
        namen = new TextField[10];
        for (int i = 0; i < namen.length; i++) {
          namen[i] = new TextField("namen",20);
          add(namen[i]);
        }
        for (int j = 0; j < nummers.length; j++) {
            nummers[j] = new TextField("telnummers",20);
        }
        nextknop = new Button("Volgende");
        nextknop.addActionListener(new Knoplistener());
    }
    public class Knoplistener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {

            aantal++;
            if (aantal == 10)
            {

            }
        }
    }
    public void paint(Graphics g) {
    }
}
