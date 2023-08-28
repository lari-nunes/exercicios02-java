import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for(int x = 0; x < vect.length; x++){
            System.out.println("-");
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[x] = new Product(name, price);
        }

        double soma = 0.0;
        for (int x=0; x < n; x++){
            soma += vect[x].getPrice();
        }

        double media = soma / n;

        System.out.printf("Resultado: %.2f%n", media);

        sc.close();
    }
}
