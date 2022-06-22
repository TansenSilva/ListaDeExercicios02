package lista02.exercicio06;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class AntecessorESucessor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = input.nextInt();

        input.close();

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("O antecessor do número digitado é: " + antecessor);
        System.out.println("O Sucessor do número digitado é: " + sucessor);


    }
}
