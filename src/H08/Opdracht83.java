package H08;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht83 extends Applet {
    //variabelen
    Button okKnop;
    TextField tekstveld;
    double bedrag;
    double uitkomst;

    public void init() {
        uitkomst = 0;
        okKnop = new Button("OK");
        tekstveld = new TextField("", 30);
        okKnop.addActionListener(new OkKnop());
        tekstveld.addActionListener(new OkKnop());
        add(okKnop);
        add(tekstveld);
    }

    //pakken bedrag en berekenen btw
    public class OkKnop implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            bedrag = Double.parseDouble(tekstveld.getText());
            uitkomst = bedrag + (bedrag/100) *21;
            repaint();
        }
    }
    //Weergeven uitkomst
    public void paint(Graphics g) {
        g.drawString("Het bedrag is: " + uitkomst, 20, 50);
    }
}