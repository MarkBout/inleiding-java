package H12;
import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet{
    //declareren array
    Button knppen[];

    public void init() {
        //aangeven groote array
        knppen = new Button[25];
        //aantal knoppen die aangegeven zijn toevoegen aan het scherm
        for (int teller = 0; teller < knppen.length; teller++)
        {
            //maak een knop voor de huidige stap in de array
            knppen[teller] = new Button("" + teller);
            add(knppen[teller]);
        }
    }
}
