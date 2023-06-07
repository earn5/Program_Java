import java.time.ZoneId;

public class ZoneID {
    public static void main(String[] args) {
        ZoneId z = ZoneId.systemDefault();
        System.out.println(z);
    }
}
