import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> list = new ArrayList<>();

        System.out.println("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int x = 1; x <= n; x++) {
            System.out.println("Employee #" + x + " data:");
            System.out.print("Outsourced (y/n)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hour = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if (ch == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                Funcionario funcionario = new FuncionarioTercerizado(name, hour, valuePerHour, additionalCharge);
                list.add(funcionario);
            } else {
                Funcionario funcionario = new Funcionario(name, hour, valuePerHour);
                list.add(funcionario);
            }
        }

        System.out.println();
        System.out.println("PAYMENTS: ");
        for(Funcionario funcionario : list){
            System.out.println(funcionario.getName() + " - $" + String.format("%.2f", funcionario.payment()));
        }


        sc.close();
    }
}
