public class RLClassDemo implements RightInterf, LeftInterf{
    @Override
    public void m1() {
        System.out.println("Test Class Method");
    }
    public static void main(String[] args) {
//        RightInterf r = () -> System.out.println("Right InterFace Method Call");
//        LeftInterf l = () -> System.out.println("Left Interface Method Call");

        RLClassDemo t = new RLClassDemo();
        t.m1();
    }
}
