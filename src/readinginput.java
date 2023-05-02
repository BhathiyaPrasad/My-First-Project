import java.util.Scanner;

public class readinginput {
 public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Age: ");
        byte age = scanner.nextByte();
        System.out.println("Your age " + age );
    }
     
        
    }
}
