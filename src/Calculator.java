
import java.text.NumberFormat;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Double rate = (Double) 3.76;
        Double period  = (Double) 3.6;
        Scanner scanner = new Scanner(System.in);
        Double annual =  scanner.nextDouble();
        System.out.println(annual);
        scanner.close();
        Double mortgage = (Double) annual / (Double)rate + (Double) period;
//         Scanner scanner = new Scanner(System.in);
// Double value =  scanner.nextDouble();
// scanner.close();



NumberFormat currency = NumberFormat.getCurrencyInstance(); 
  String result = currency.format(mortgage) ;
  
  System.out.println(result); 

        
    }
}
