package H13;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Opdracht3 extends Applet
{
    Button beton, steen;
    TextField hoogtemuur, breetemuur;
    private boolean betonMuur, baksteenMuur;
    int hoogte, breette;
    public void init() {
        betonMuur = false;
        baksteenMuur = false;

        setSize(500,800);

        beton = new Button("betonmuur");
        steen = new Button("steenmuur");

        beton.addActionListener(new Betonmuurlistener());
        steen.addActionListener(new Steenlistener());

        hoogtemuur = new TextField("hoogte",20);
        breetemuur = new TextField("Breette",20);

        add(beton);
        add(steen);
        add(hoogtemuur);
        add(breetemuur);
    }

    public void paint(Graphics g) {
        if (baksteenMuur)
        {
            steenmuur(g,hoogte, breette);
        }
        if (betonMuur)
        {
            betonmuur(g,hoogte, breette);
        }
    }
    public class Betonmuurlistener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            hoogte = Integer.parseInt(hoogtemuur.getText());
            breette = Integer.parseInt(breetemuur.getText());
            betonMuur = true;
            baksteenMuur = false;
            repaint();
        }
    }

    public class Steenlistener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            hoogte = Integer.parseInt(hoogtemuur.getText());
            breette = Integer.parseInt(breetemuur.getText());
            betonMuur = false;
            baksteenMuur = true;
            repaint();
        }
    }
    void steenmuur(Graphics g, int hoogte, int breette)
    {
        int counter = 0;
        int x, y=40, breedte=50, hoog=25, breedteEind=25, beginX;
        Color zwart = Color.black;
        Color rood = Color.red;
        for (counter = 0; counter < hoogte; counter++)
        {
         x = 50;
         beginX = breedte + breedteEind;
            // Even rijen
            if (counter % 2 == 0) {
                /* Eindstukken van de muur */
                for (int i=0; i < breette; i++) {
                    if (i == 0 || i == breette-1) {
                        g.setColor(zwart);
                        g.drawRect(beginX,y,breedteEind,hoogte);
                        g.setColor(rood);
                        g.fillRect(beginX+1,y+1,breedteEind-1,hoogte-1);
                        beginX = breedte* breette;
                    }
                    // Vullen
                    else {
                        g.setColor(zwart);
                        g.drawRect(x,y,breedte,hoogte);
                        g.setColor(rood);
                        g.fillRect(x+1,y+1,breedte-1,hoogte-1);
                    }
                    x+=breedte;
                }
            } else {
                x= breedte +breedteEind;
                for (int i = 0; i < breette-1; i++) {
                    g.setColor(zwart);
                    g.drawRect(x,y,breedte,hoogte);
                    g.setColor(rood);
                    g.fillRect(x+1,y+1,breedte-1,hoogte-1);
                    x += breedte;
                }
            }
            y +=hoog;
        }
    }

    private void betonmuur(Graphics g, int hoogte, int breette)
    {

    }
 }