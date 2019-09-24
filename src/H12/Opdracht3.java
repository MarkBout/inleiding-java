package H12;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.Arrays;

public class Opdracht3 extends Applet {

    TextField[] tekstvakken;
    int[] getallen;
    Button knopOK;
    public void init()
    {
        //Variabelen initialiseren
        tekstvakken = new TextField[5];
        getallen = new int[5];
        knopOK = new Button("OK");
        knopOK.addActionListener(new knoplistener());
        add(knopOK);

        for (int i = 0; i < tekstvakken.length; i++) {
            tekstvakken[i] = new TextField("",10);
            add(tekstvakken[i]);
        }
    }

    public class knoplistener implements ActionListener
    {
        public void actionPerformed(ActionEvent e) {
            //getallen uit tekstvakken pakken
            for (int t = 0; t < tekstvakken.length; t++) {
                getallen[t] = Integer.parseInt(tekstvakken[t].getText());
            }

            Arrays.sort(getallen);

            //Getallen in juiste volgorde zetten
            for (int i = 0; i < tekstvakken.length; i++) {
                tekstvakken[i].setText("" + (getallen[i]));
            }
        }
    }
}