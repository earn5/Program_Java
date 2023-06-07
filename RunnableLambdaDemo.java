public class RunnableLambdaDemo{
    public static void main(String[] args) {
        Runnable r = () -> {
            for(int i = 0; i < 3; i++) {
                System.out.println("Lambda Expression Child Thread:: " + i);
            }
        };

        Thread t = new Thread(r);
        t.start();
        for (int i = 0; i < 3; i++) {
            System.out.println("Parent Thread:: " + i);
        }
    }
}
