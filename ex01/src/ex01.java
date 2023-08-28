import java.util.Locale;
import java.util.Scanner;

public class ex01{
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número pra fazer a média de altura: ");
        int numero = sc.nextInt();

        double[] vect = new double[numero];

        for (int x = 0; x<numero; x++){
            System.out.println("Digite um número: ");
            vect[x] = sc.nextDouble();
        }

        double sum = 0;
        for (int x = 0; x<numero; x++){
            sum += vect[x];
        }

        double media = sum / numero;

        System.out.println("O resultado será de: " + media);

        sc.close();
    }
}