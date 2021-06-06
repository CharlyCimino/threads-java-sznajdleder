package threads;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Consumidor extends Thread {

    private Monitor buff;
    private int n;
    private int sleep;

    public Consumidor(Monitor b, int n, int s) {
        this.buff = b;
        this.n = n;
        this.sleep = s;
    }

    @Override
    public void run() {
        try {
            char c;
            for (int i = 0; i < n; i++) {
                c = buff.sacar();
                System.out.println(i + " Consumí: " + c);
                Thread.sleep((int) (Math.random() * sleep));
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
