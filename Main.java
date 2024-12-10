import java.util.Scanner;

//Classe calcular

class Calcular {
    public int somar(int num1, int num2){
        return num1 + num2;
    }

    public int subtrair(int num1, int num2){
        return num1 - num2;
    }

    public int multiplicar(int num1, int num2){
        return num1 * num2;
    }

    public int dividir(int num1, int num2){
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Erro: Divisão por zero");
            return 0;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor para num1: ");
        int num1 = scanner.nextInt(); // Alterar float para int

        System.out.print("Digite um valor para num2: ");
        int num2 = scanner.nextInt(); // Alterar float para int

        Calcular calcular = new Calcular(); // Correção na instanciação da classe

        int resultadoSoma = calcular.somar(num1, num2);

        System.out.println("O resultado da soma é: " + resultadoSoma); // Alterar para println

        scanner.close();
    }
}

