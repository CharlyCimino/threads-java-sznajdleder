package threads;

import java.awt.Button;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class VentanaDemora extends Frame {

    private Button boton;
    private Choice combo;

    public VentanaDemora() {
        setLayout(new FlowLayout());
        add(boton = new Button("Esto va a demorar..."));
        boton.addActionListener(new EscuchaBoton());
        add(combo = new Choice());
        combo.addItem("Item 1");
        combo.addItem("Item 2");
        combo.addItem("Item 3");
        setSize(300, 300);
        setVisible(true);
    }

    class EscuchaBoton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            boton.setEnabled(false);
            TareaBoton t = new TareaBoton();
            t.start();
        }
    }

    class TareaBoton extends Thread {

        @Override
        public void run() {
            try {
                Thread.sleep(10000);
                System.out.println("Termino la espera...!");
                boton.setEnabled(true);
            } catch (Exception ex) {
                ex.printStackTrace();
                throw new RuntimeException(ex);
            }
        }
    }
}
