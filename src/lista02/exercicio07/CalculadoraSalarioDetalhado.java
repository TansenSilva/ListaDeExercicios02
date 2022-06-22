package lista02.exercicio07;

import java.util.Scanner;

public class CalculadoraSalarioDetalhado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor da hora trabalhada: ");
        double valorHora = input.nextDouble();
        System.out.print("Digite quantas hora trabalhou no referido mês: ");
        double horasTrabalhadas = input.nextDouble();

        input.close();

        double salarioMes = valorHora * horasTrabalhadas;
        double impostoDeRenda = (salarioMes * 11) / 100;
        double inss = (salarioMes * 8) / 100;
        double sindicato = (salarioMes * 5) / 100;
        double salarioLiquido = salarioMes - inss - impostoDeRenda - sindicato;

        System.out.println("O salário bruto no mês referido é de: R$ " + salarioMes);
        System.out.println("O valor pago ao INSS é de: R$ " + inss);
        System.out.println("O valor pago ao Sindicato é de: R$ " + sindicato);
        System.out.println("O salário líquido no mês referido é de: R$ " + salarioLiquido);


    }
}
