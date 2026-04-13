import java.util.Scanner;

//Júlio César da Silva

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int contador = 1;
        int numero;
        int menor;

        System.out.println("Digite o 1º número: ");
        numero = scanner.nextInt();
        menor = numero;

        while (contador < 10) {
            System.out.printf("%nDigite o %dº número: " , contador + 1);
            numero = scanner.nextInt();

            if (numero < menor) {
                menor = numero;
            }

            contador++;
        }

        System.out.println("O menor número é: " + menor);

        scanner.close();
    }
}
