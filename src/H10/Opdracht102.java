package H10;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht102 extends Applet {

    TextField tekstveld;
    int hoogsteGetal, input, laagsteGetal;
    String s;
    Button reset;

    public void init() {
        hoogsteGetal = 0;
        laagsteGetal = 10;
        tekstveld = new TextField(30);
        reset = new Button("Reset");
        reset.addActionListener(new Reset());
        tekstveld.addActionListener(new Getalteller());
        add(tekstveld);
        add(reset);
    }


    public void paint(Graphics g) {
        g.drawString("Het hoogste getal is: " + hoogsteGetal, 20, 50);
        g.drawString("Het laagste getal is: " + laagsteGetal,20, 60);
    }

    //Getal word nagekeken en wanneer nodig vervangen
    public class Getalteller implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstveld.getText();
            input = Integer.parseInt(s);
            if (input >= hoogsteGetal){
                hoogsteGetal = input;}
            if (input <= laagsteGetal){
                laagsteGetal = input;
                }
                repaint();
            }
        }
        //Resetknop
    public class Reset implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                hoogsteGetal = 0;
                laagsteGetal = 0;
                repaint();
            }
        }
    }


