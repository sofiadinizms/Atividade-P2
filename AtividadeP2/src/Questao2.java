import java.util.Scanner;

//QUESTAO 2
//Faça um programa que receba três notas, calcule e mostre a média aritmética entre elas.
public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input das notas
        System.out.println("Informe três notas, em sequência:");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        //Cálculo da média simples e output do resultado
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Média aritmética: " + media);

        scanner.close();
    }
}

