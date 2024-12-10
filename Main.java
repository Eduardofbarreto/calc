import java.util.Scanner;

class Calcular{
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
        return num1/num2;
    }
}

public class Main {
    public static void main(String[] args) {
      

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor para num1: ");
        float num1 = scanner.nextFloat();

        System.out.print("Digite um valor para num2: ");
        float num2 = scanner.nextFloat();

        scanner.close();

        Calcular calcular();

        resultadoSoma = calcular.somar(num1, num2);

        System.out.print(resultadoSoma);


    }
}
