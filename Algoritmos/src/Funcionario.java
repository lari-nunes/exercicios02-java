public class Funcionario {
    String nome;
    double salarioBase;
    double horasTrabalhadas;

    public Funcionario(String nome, double salarioBase, double horasTrabalhadas) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double calcularSalarioBruto() {
        return salarioBase + (horasTrabalhadas * 10);
    }

    public double calcularDescontos(double salarioBruto) {
        return salarioBruto * 0.1;
    }

    public double calcularSalarioLiquido(double salarioBruto, double descontos) {
        return salarioBruto - descontos;
    }

    public void gerarResumoFolhaPagamento() {
        double salarioBruto = calcularSalarioBruto();
        double descontos = calcularDescontos(salarioBruto);
        double salarioLiquido = calcularSalarioLiquido(salarioBruto, descontos);

        System.out.println("\nResumo da folha de pagamento:");
        System.out.println("Nome: " + nome);
        System.out.println("Salário Bruto: R$" + salarioBruto);
        System.out.println("Descontos: R$" + descontos);
        System.out.println("Salário Líquido: R$" + salarioLiquido);
    }
}
