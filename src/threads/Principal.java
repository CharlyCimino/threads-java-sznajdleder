package threads;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    public static void main(String[] args) throws InterruptedException {
        DemoThread t1 = new DemoThread("Pablo");
        DemoThread t2 = new DemoThread("Pedro");
        t1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(Thread.MAX_PRIORITY);
        System.out.println(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }

}
