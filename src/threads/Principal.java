package threads;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    public static void main(String[] args) throws InterruptedException {
        Monitor m = new Monitor(3);
        Productor p = new Productor(m, 6, 2000);
        Consumidor c = new Consumidor(m, 6, 4000);
        p.start();
        c.start();
    }

}
