import java.util.function.Predicate;

public class PredicateJoinDemo {
    public static void main(String[] args) {
        int[] x = {0,5,10,15,20};
        Predicate<Integer> p1 = i -> i > 10;
        Predicate<Integer> p2 = i -> i%2 == 0;

        System.out.println("**Numbers Greater Than 10::**");
        m1(p1, x);

        System.out.println();
        System.out.println("**Even Numbers Are::**");
        m1(p2, x);

        System.out.println();
        System.out.println("**Not Greater Than 10::**");
        m1(p1.negate(), x);

        System.out.println();
        System.out.println("**The Numbers Greater Than 10 And Even::**");
        m1(p1.and(p2), x);

        System.out.println();
        System.out.println("**The Numbers Greater Than 10 Or Even::**");
        m1(p1.or(p2), x);
    }

    public static void m1(Predicate<Integer> p, int[] x) {
        for (int x1:
            x ) {
            System.out.println(p.test(x1));
        }
    }
}
