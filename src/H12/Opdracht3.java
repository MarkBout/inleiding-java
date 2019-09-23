package H12;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.lang.reflect.Array;
import java.util.*;

public class Opdracht3 extends Applet
{
    TextField teksttabel[];
    Button knopOK;
    int teller = 0;
    int numsort[];
    String[] strarray;
    int i;
    public void init()
    {
        //tekstvelden maken en toevoegen
        teksttabel = new TextField[5];
        for ( teller = 0; teller < teksttabel.length; teller++)
        {
            teksttabel[teller] = new TextField( 10);
            add(teksttabel[teller]);
        }
        //knop maken en toevoegen
        knopOK = new Button("OK");
        knopOK.addActionListener(new Knopluisterraar());
        add(knopOK);
        i = 0;
    }

    public class Knopluisterraar implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            //Strings van tekstveld naar integers converteren
            for ( i = 0; i < numsort.length; i++)
            {
                    numsort[i] = Integer.parseInt(teksttabel[teller].getText());
            }
            Arrays.sort(numsort);
            strarray[i] = Integer.toString(numsort[i]);
            teksttabel[teller].setText(strarray[i]);
        }
    }
}
