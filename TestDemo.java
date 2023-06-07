public class TestDemo {

    public void m2() {
        for(int i = 0; i < 3; i++) {
            System.out.println("Child Thread:: " + i);
        }
    }

    public static void main(String[] args) {
        LeftInterf l = () -> System.out.println("Implementation Class");
        l.m1();
        TestDemo t = new TestDemo();
        LeftInterf l1= t::m2;
        l1.m1();
//        Runnable r = TestDemo::m1;
//        Thread t = new Thread(r);
//        t.start();
    }
}
