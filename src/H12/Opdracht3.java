package H12;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.*;

public class Opdracht3 extends Applet
{
    TextField teksttabel[];
    Button knopOK;
    int teller = 0;
    public void init()
    {
        teksttabel = new TextField[5];
        for ( teller = 0; teller < teksttabel.length; teller++)
        {
            teksttabel[teller] = new TextField( 10);
            add(teksttabel[teller]);
        }
        knopOK = new Button("OK");
        knopOK.addActionListener(new Knopluisterraar());
        add(knopOK);
    }

    public class Knopluisterraar implements ActionListener
    {
        public void actionPerformed(ActionEvent e) {
            Arrays.sort(teksttabel);
        }
    }
}
