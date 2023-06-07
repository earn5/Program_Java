import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("**Enter The Number** ");
        int scanner = sc.nextInt();
        SqareRoot sq = (x) -> System.out.println("Square Root:: " + x*x);
        sq.squareRoot(scanner);
    }
}
