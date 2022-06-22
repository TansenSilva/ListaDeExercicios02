package lista02.exercicio04;

import java.util.Scanner;

public class CalculadoraSalario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculadora de salário por horas trabalhadas");
        System.out.print("Digite o valor da hora trabalhada: ");
        double valorHora = input.nextDouble();
        System.out.print("Digite quantas hora trabalhou no referido mês: ");
        double horasTrabalhadas = input.nextDouble();

        input.close();

        double salarioMes = valorHora * horasTrabalhadas;

        System.out.println("O salário no mês referido é de: R$ " + salarioMes + " reais.");
    }
}
