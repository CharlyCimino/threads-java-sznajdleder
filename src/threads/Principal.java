package threads;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    public static void main(String[] args) {
        Thread t1 = new Thread(new DemoThread("Pedro"));
        Thread t2 = new Thread(new DemoThread("Pablo"));
        Thread t3 = new Thread(new DemoThread("Juan"));
        t1.start();
        t2.start();
        t3.start();
    }

}
