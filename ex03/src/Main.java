import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar? ");
        int numeros = sc.nextInt();

        double[] vect = new double[numeros];

        for (int x=0; x<numeros ;x++){
            System.out.println("Digite um número");
            vect[x] = sc.nextDouble();
        }

        System.out.println("Números negativos: ");

        for (int x=0; x<numeros; x++){
            if (vect[x] < x){
                System.out.println(vect[x]);
            }
        }

        sc.close();
    }
}