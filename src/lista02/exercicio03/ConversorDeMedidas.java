package lista02.exercicio03;

import java.util.Scanner;

public class ConversorDeMedidas {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Conversor de metros para centimtros");
        System.out.print("Digite a medida em metros: ");
        double metros = input.nextDouble();

        input.close();

        double centimetros = metros * 100;

        System.out.println("A medida digitada em metros corresponte à: " + centimetros + " cm.");


    }
}
