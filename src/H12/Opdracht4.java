package H12;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht4 extends Applet
{
    //Variabelen
    int[] getallen = {6, 3, 7, 9, 2, 4, 2, 4, 82, 15};
    TextField tekstvak;
    Button knopOK;
    String s, message;
    int userinput;

    public void init()
    {
        setSize(500,500);
        //Aanmaken knop/tekstvak
        tekstvak = new TextField(20);
        knopOK = new Button("Zoeken");
        tekstvak.addActionListener(new Vakluister());
        knopOK.addActionListener(new Vakluister());
        add(tekstvak);
        add(knopOK);
        //bericht aan de gebruiker
        message = "Welk getal wilt u zoeken?";
    }

    public class Vakluister implements ActionListener
    {

        public void actionPerformed(ActionEvent e)
        {
            //invoer uit het tekstvak pakken en kijken of deze in de tabel staat
            s = tekstvak.getText();
            userinput = Integer.parseInt(s);
            for (int teller = 0; teller < getallen.length ; teller++)
            {
                if (userinput == getallen[teller])
                {
                    message = "Het getal " + userinput + " is gecvonden op Index " + teller;
                    break;
                }
                else
                {
                    message = "Dit getal staat niet in de index";
                }
            }
            repaint();
            }
    }

    public void paint(Graphics g)
    {
        g.drawString(message,20,50);
    }
}