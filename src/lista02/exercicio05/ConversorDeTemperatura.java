package lista02.exercicio05;

import java.util.Scanner;

public class ConversorDeTemperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a temperatura em Fahrenheit (°F): ");
        double tempFahrenheit = input.nextDouble();

        input.close();

        int i = 8;
        double tempCelsius = (tempFahrenheit - 32) / 1.8;

        System.out.printf("A temperatura digitada em Fahrenheit (°F) corresponde em Celsius (°C) à %.1f", tempCelsius);

    }
}
