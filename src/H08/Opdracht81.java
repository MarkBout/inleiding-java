package H08;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht81 extends Applet {
    //Variabelen
    Button okKnop;
    String schermtekst;
    TextField tekstveld;
    Button reset;


    public void init() {
        okKnop = new Button("Ok");
        tekstveld = new TextField("type iets in het tekstvak en druk op OK.", 30);
        reset = new Button("Reset");
        okKnop.addActionListener(new onclick());
        reset.addActionListener(new resetveld() );
        add(tekstveld);
        add(okKnop);
        add(reset);
        schermtekst = "";
    }

    public void paint(Graphics g) {
        g.drawString(schermtekst, 50, 50);
    }

    class onclick implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            schermtekst = tekstveld.getText();
            repaint();
        }
    }

    class resetveld implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            tekstveld.setText("");
            schermtekst = "";
            repaint();
        }
    }
}
