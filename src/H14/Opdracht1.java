package H14;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht1 extends Applet {
    String[] vormen;
    String[] getal;
    Button deelknop;
    public void init()
    {
        //kaart arrays
        vormen = new String[4];
        vormen[0] = "Klaver";
        vormen[1] = "Schoppen";
        vormen[2] = "Ruiten";
        vormen[3] = "Harten";

        getal = new String[13];
        getal[0] = "Een";
        getal[1] = "Twee";
        getal[2] = "Drie";
        getal[3] = "Vier";
        getal[4] = "Vijf";
        getal[5] = "Zes";
        getal[6] = "Zeven";
        getal[7] = "Acht";
        getal[8] = "Negen";
        getal[9] = "Tien";
        getal[10] = "Boer";
        getal[11] = "Koningin";
        getal[12] = "Koning";

        //deelknop
        deelknop = new Button("Deel kaart");
        deelknop.addActionListener(new Deellistener());
        add(deelknop);
    }
    public void paint(Graphics g) {
        //kijken welke kaart er wordt gedeeld
        int kaartsort = (int) (Math.random() * 4);
        int getalsort = (int) (Math.random() * 13);
        g.drawString("" + vormen[kaartsort] + " " + getal[getalsort] + " Is gedeeld", 20,40);
    }

    //nieuwe kaart delen
    public class Deellistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            repaint();
        }
    }
}