package H12;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.Arrays;

public class Opdracht6 extends Applet
{
    int[] cijfers = {5, 10, 20, 10, 5, 20};
    TextField tekstvak;
    int input,aantal;
    String message;


    public void init()
    {
        tekstvak = new TextField(20);
        tekstvak.addActionListener(new veldlistener());
        add(tekstvak);
        message = "voer een getal in";
    }

    public class veldlistener implements ActionListener{
        //Tekst ophalen en bekijken of input ook echt in de tabel staat
        public void actionPerformed(ActionEvent e)
        {
            input = Integer.parseInt(tekstvak.getText());
            for (int counter = 0; counter < cijfers.length; counter++) {
                if (cijfers[counter] == input)
                {
                    aantal++;
                }
            }
            //Aantal keer weergeven
            if (aantal > 0)
            {
                message = "Het getal " + input + " staat " + aantal + " keer in de tabel";
            }
            else
            {
                message = "Het getal " + input + " staat niet in de tabel";
            }
            repaint();

            aantal = 0;
        }
    }
    public void paint(Graphics g) {
        g.drawString(message,20, 50);
    }
}
