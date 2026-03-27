import java.util.Scanner;

public class ex02 {
public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    double gorjeta;
    double totalGorjetas = 0;

    System.out.print("Gorjeta: ");
    gorjeta = scanner.nextDouble();

    while (gorjeta != 0) {
        totalGorjetas += gorjeta;
        System.out.print("Gorjeta: ");
        gorjeta = scanner.nextDouble();
    }
    System.out.println("Total de gorjetas: " + totalGorjetas);
}
}