package H11;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class PraktijkopdrachtH11 extends Applet
{
    int tafel, y;
    TextField tekstveld;
    Button knopOK;
    String s;

    public void init()
    {
        tafel = 1;
        tekstveld = new TextField(20);
        tekstveld.addActionListener(new Tekstluisteraar());
        add(tekstveld);

        knopOK = new Button("OK");
        knopOK.addActionListener(new Knopluister());
        add(knopOK);

        s = "";
    }



    public class Tekstluisteraar implements ActionListener
        {
            public void actionPerformed(ActionEvent e)
            {
               s = tekstveld.getText();
               tafel = Integer.parseInt(s);
               repaint();
            }
        }

    public void paint(Graphics g)
    {
        int y = 60;
        g.drawString("vul een getal van 1 tot 10 in het tekstvak", 50, 40);
        for (int i = 1; i <= 10; i++)
        {
            g.drawString(i + " x " + tafel + " = " + tafel*i,20,y);
            y += 15;
        }
    }

        public class Knopluister implements ActionListener
        {
            public void actionPerformed(ActionEvent e)
            {
                s = tekstveld.getText();
                tafel = Integer.parseInt(s);
                tafel++;
                tekstveld.setText(Integer.toString(tafel));
                repaint();
            }
        }
}
