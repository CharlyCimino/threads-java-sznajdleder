package threads;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    public static void main(String[] args) {
        DemoThread t1 = new DemoThread("Pedro");
        DemoThread t2 = new DemoThread("Pablo");
        DemoThread t3 = new DemoThread("Juan");
        t1.start();
        t2.start();
        t3.start();
    }

}
