package H08;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class PraktijkopdrachtH8 extends Applet {
    TextField ltekst;
    TextField rtekst;
    Button vermenigvuldigen;
    Button delen;
    Button optellen;
    Button aftrekken;
    double field1;
    double field2;
    double totaal;

    public void init() {
        ltekst = new TextField(10);
        rtekst = new TextField(10);
        field1 = 0;
        field2 = 0;
        totaal = 0;
        optellen = new Button("+");
        aftrekken = new Button("-");
        vermenigvuldigen = new Button("*");
        delen = new Button("/");
        optellen.addActionListener(new Bijtellen());
        aftrekken.addActionListener(new Aftellen());
        delen.addActionListener(new Division());
        vermenigvuldigen.addActionListener(new Multiply());
        add(ltekst);
        add(rtekst);
        add(optellen);
        add(aftrekken);
        add(vermenigvuldigen);
        add(delen);
    }

    public class Bijtellen implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            field1 = Double.parseDouble(ltekst.getText());
            field2 = Double.parseDouble(rtekst.getText());
            totaal = field1 + field2;
            ltekst.setText("" + totaal);
            rtekst.setText("");
            repaint();
        }
    }

    public class Aftellen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            field1 = Double.parseDouble(ltekst.getText());
            field2 = Double.parseDouble(rtekst.getText());
            totaal = field1 - field2;
            ltekst.setText("" + totaal);
            rtekst.setText("");
            repaint();
        }
    }

    public class Division implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            field1 = Double.parseDouble(ltekst.getText());
            field2 = Double.parseDouble(rtekst.getText());
            totaal = field1 / field2;
            ltekst.setText("" + totaal);
            rtekst.setText("");
            repaint();
        }
    }

    public class Multiply implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            field1 = Double.parseDouble(ltekst.getText());
            field2 = Double.parseDouble(rtekst.getText());
            totaal = field1 * field2;
            ltekst.setText("" + totaal);
            rtekst.setText("");
            repaint();
        }
    }
}