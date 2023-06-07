public class AnonymousInnerClassWthLambda {
    int x = 888;
    public void m2() {
        int y = 777;
        Interf i = (a, b) -> {
            int x =999;
            System.out.println("Addition:: " + (a+b));
            System.out.println("Variable Calling Inside Anonymous Class.. " + x);
            System.out.println("Variable Calling From Instance Variable.. " + this.x);
        };
        i.m1(10, 20);
    }

    public static void main(String[] args) {
        AnonymousInnerClassWthLambda ac = new AnonymousInnerClassWthLambda();
        ac.m2();
    }
}
