import java.rmi.StubNotFoundException;
import java.text.NumberFormat;

public class arithmatic {
    public static void main(String[] args) {
        String result =NumberFormat.getPercentInstance().format(0.2);
        System.out.println(result);

    }
}
