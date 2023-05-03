
import java.text.NumberFormat;
import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Double rate = (Double) 3.76;
      Double years = (Double) 3.6;
    System.out.print("Captial: ");
    Scanner scanner = new Scanner(System.in);
    Double principal = scanner.nextDouble();

    scanner.close();
    Double mortgage = (Double) principal / (Double) rate *( 1 + (Double) rate )*years / (1 + (Double) rate) *years - 1;

    NumberFormat currency = NumberFormat.getCurrencyInstance();
    String result = currency.format(mortgage);

    System.out.println("Monthly Payment= "+result);

  }
}
