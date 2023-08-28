import java.util.Locale;
import java.util.Scanner;

public class FolhaDePagamento {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário base do funcionário: ");
        double salarioBase = scanner.nextDouble();

        System.out.print("Digite o número de horas trabalhadas extras: ");
        double horasTrabalhadas = scanner.nextDouble();

        Funcionario funcionario = new Funcionario(nome, salarioBase, horasTrabalhadas);

        funcionario.gerarResumoFolhaPagamento();

        scanner.close();
    }
}
