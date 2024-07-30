import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input do primeiro número
        System.out.println("Insira o primeiro número:");
        double base = scanner.nextDouble();

        //Input do segundo número
        System.out.println("Insira o segundo número:");
        double expoente = scanner.nextDouble();

        //Cálculo da potência
        double resultado = Math.pow(base, expoente);
        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}

