import java.util.Scanner;

//QUESTAO 4
// Faça um programa que calcule e mostre a área de um triângulo.
// Sabe-se que: Área = (base * altura)/2.
public class Questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Inout das medidas
        System.out.println("Insira a base:");
        double base = scanner.nextDouble();

        System.out.println("Insira a altura:");
        double altura = scanner.nextDouble();

        //Calculo da área e output do resultado
        double area = (base * altura) / 2;
        System.out.println("Área do triângulo: " + area);

        scanner.close();
    }
}

