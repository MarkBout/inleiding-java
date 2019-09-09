package H08;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht82 extends Applet{
    Button mannen;
    Button vrouwen;
    Button jongens;
    Button meisjes;
    double counterMannen;
    double countervrouwen;
    double counterJongens;
    double countermeisjes;
    double countertotaal;


    public void init() {
        counterMannen = 0;
        counterJongens = 0;
        countermeisjes = 0;
        countervrouwen = 0;
        countertotaal = 0;

        mannen = new Button("mannen");
        vrouwen = new Button("vrouwen");
        jongens = new Button("Jongens");
        meisjes = new Button("Meisjes");
        mannen.addActionListener(new Mannenteller());
        vrouwen.addActionListener(new Vrouwenteller());
        meisjes.addActionListener(new Meisjesteller());
        jongens.addActionListener(new Jongensteller());
        add(mannen);
        add(vrouwen);
        add(jongens);
        add(meisjes);
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Het aantal mannen is: " + counterMannen, 20,90);
        g.drawString("Het aantal vrouwen is: " + countervrouwen, 20,80);
        g.drawString("Het aantal jongens is: " + counterJongens, 20,70);
        g.drawString("Het aantal meisjes is: " + countermeisjes,20, 60);
        g.drawString("Het totaal is: " + countertotaal, 20, 50);
    }

    class Mannenteller implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            counterMannen++;
            countertotaal++;
            repaint();
        }
    }

    class Vrouwenteller implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            countervrouwen++;
            countertotaal++;
            repaint();
        }
    }

    class Jongensteller implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            counterJongens++;
            countertotaal++;
            repaint();
        }
    }

    class Meisjesteller implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            countermeisjes++;
            countertotaal++;
            repaint();
        }
    }
}
