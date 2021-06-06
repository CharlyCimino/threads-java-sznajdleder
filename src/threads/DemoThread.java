package threads;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class DemoThread implements Runnable {

    private String nombre;

    public DemoThread(String nombre) {
        this.nombre = nombre;
    }

    public void run() {
        try {
            int x = (int) (Math.random() * 5000);
            Thread.sleep(x);
            System.out.println("Soy: " + nombre + " (" + x + ")");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
