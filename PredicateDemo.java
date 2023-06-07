import java.util.Collection;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {

        /*To Check Integer Is Greater Than 10*/
        Predicate<Integer> p = i -> (i > 10);
        System.out.println(p.test(100));

        /*To Check Length Of String Is Greater Than 3*/
        Predicate<String> p1 = s -> (s.length() > 3);
        System.out.println("String Length:: " + p1.test("Bro"));

        /*To Check Whether the collection is empty or not*/
        Predicate<Collection> p2 = c -> c.isEmpty();
    }

}
