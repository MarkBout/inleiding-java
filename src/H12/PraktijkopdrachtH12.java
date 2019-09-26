package H12;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.Arrays;

public class PraktijkopdrachtH12 extends Applet{
    TextField nameninput,nummers;
    boolean genoeg;
    Button okKnop;
    int aantal;
    String[] gebruikersnamen;
    public void init() {
        setSize(800,800);
        nameninput = new TextField("naam", 20);
        nummers = new TextField("Telnummer",30);
        genoeg = false;
        add(nameninput);
        add(nummers);
        okKnop = new Button("Ok");
        okKnop.addActionListener(new Knoplistener());
        add(okKnop);
        gebruikersnamen = new String[10];

        /* NullPointerException Fix */
        Arrays.fill(gebruikersnamen, "");
    }

    public void paint(Graphics g) {
        int y = 50;
        for (String namen : gebruikersnamen)
        {
            g.drawString(namen, 60, y+=15);
        }
    }

    public class Knoplistener implements ActionListener
    {
        String snamen, snummers;
        public void actionPerformed(ActionEvent e)
        {
            //nummers en namen uit de tekstvakken halen
            snamen = nameninput.getText().toLowerCase();
            snummers = nummers.getText();
            if (aantal < gebruikersnamen.length);
            {
                gebruikersnamen[aantal] = "Naam " + snamen + "   Tel-nummer: " + snummers;
                aantal++;
                System.out.println("Nummers toegevoegd "+ aantal);

                if (aantal == gebruikersnamen.length)
                {
                    genoeg = true;
                }
            }
            //wanneer er genoeg (10) nummers/namen zijn toegevoegd
            if (genoeg)
            {
                Arrays.sort(gebruikersnamen);
                repaint();
            }
            nameninput.setText("");
            nummers.setText("");
        }
    }
}