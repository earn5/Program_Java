
class Sample {
    int rollNumber;
    Sample(int rollNumber) {
        this.rollNumber = rollNumber;
        System.out.println("Initializing Sample Constructor");
    }
}

interface inter {
    public Sample get(int number);
}
public class ConstructorRefDemo {
    public static void main(String[] args) {
        inter sq = (i) -> new Sample(i);
        sq.get(10);
        inter sq1 = Sample::new;
        sq1.get(20);
    }
}
