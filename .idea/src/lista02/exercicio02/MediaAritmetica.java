package lista02.exercicio02;

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("A segir digite 4 notas bimestrais para o calculo da média entre elas.");
        System.out.print("Digite a primeira nota bimestral: ");
        double nota1 = input.nextDouble();
        System.out.print("Digite a segunda nota bimestral: ");
        double nota2 = input.nextDouble();
        System.out.print("Digite a terceira nota bimestral: ");
        double nota3 = input.nextDouble();
        System.out.print("Digite a quarta nota bimestral: ");
        double nota4 = input.nextDouble();

        input.close();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média das notas é: " + media);

    }


}
