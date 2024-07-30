import java.util.Scanner;

//QUESTAO 3
// Faça um programa que receba o salário de um funcionário, calcule e mostre o novo salário,
// sabendo-se que este sofreu um aumento de 25%.
public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Input do salário atual
        System.out.println("Insira o salário:");
        double salario = scanner.nextDouble();

        //Calculo e output do novo salário com reajuste de 25%
        double novoSalario = salario * 1.25;
        System.out.println("Novo salário: " + novoSalario);

        scanner.close();
    }
}

