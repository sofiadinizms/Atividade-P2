import java.util.Scanner;

//QUESTAO 1
// Faça um programa que receba quatro números inteiros, calcule e mostre a soma desses números.

public class Questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input dos números
        System.out.println("Informe quatro números, em sequência:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        //Soma e output do resultado
        int soma = num1 + num2 + num3 + num4;
        System.out.println("Resultado da soma: " + soma);

        scanner.close();
    }
}
