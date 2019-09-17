package H10;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Praktijkopdracht extends Applet {

    TextField tekstveld;
    String t, tekst;
    int cijfer;

    public void init() {
        tekstveld = new TextField(20);
        tekstveld.addActionListener(new Cijferluisteraar());
        add(tekstveld);
    }

    public class Cijferluisteraar implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            t = tekstveld.getText();
            cijfer = Integer.parseInt(t);
            switch (cijfer)
            {
                case 1:
                    tekst = "Je cijfer " + cijfer + "is slecht";
                    break;
                case 2:
                    tekst = "Je cijfer " + cijfer + " is slecht";
                    break;
                case 3:
                    tekst = "Je cijfer " + cijfer + " is slecht";
                    break;
                case 4:
                    tekst = "Je cijfer " + cijfer + " is onvoldoende";
                    break;
                case 5:
                    tekst = "Je cijfer " + cijfer + " is matig";
                    break;
                case 6:
                    tekst = "Je cijfer " + cijfer + " is voldoende";
                    break;
                case 7:
                    tekst = "Je cijfer " + cijfer + " is Voldoende";
                    break;
                case 8:
                    tekst = "Je cijfer " + cijfer + " is goed";
                    break;
                case 9:
                    tekst = "Je cijfer " + cijfer + " is Goed";
                    break;
                case 10:
                    tekst = "Je cijfer " + cijfer + " is goed";
                    break;
                default:
                    tekst = "Je hebt een ongeldig cijfer ingevoerd";
            }
            getGraphics().drawString(tekst, 20, 50);
        }
    }
}