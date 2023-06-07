public class RunnableTest {
    public static void main(String[] args) {
        RunnableDemo r = new RunnableDemo();
        Thread t = new Thread(r);
        t.start();
        for(int i = 0; i < 3; i++) {
            System.out.println("Main Thread:: " + i);
        }
    }
}
