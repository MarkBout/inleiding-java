package H10;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht101 extends Applet {

    TextField tekstveld;
    int hoogsteGetal, input;
    String s;

    public void init() {
        hoogsteGetal = 0;
        tekstveld = new TextField(30);
        tekstveld.addActionListener(new Getalteller());
        add(tekstveld);
    }


    public void paint(Graphics g) {
        g.drawString("Het hoogste getal is: " + hoogsteGetal, 20, 50);
    }

    //Getal word nagekeken en wanneer nodig vervangen
    public class Getalteller implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstveld.getText();
            input = Integer.parseInt(s);
            if (input > hoogsteGetal){
                hoogsteGetal = input;
                repaint();
            }
            }
        }
    }

