import java.util.Scanner;

//Júlio César da Silva

public class exc2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int contador = 0;
        int pares = 0;
        int impares = 0;

        int num = 0;

        while (contador < 10) {
            System.out.println("Digite um número");
            num = entrada.nextInt();

            if (num % 2 == 0) {
                pares = pares + 1;
            } else {
                impares = impares + 1;
            }

            contador++;
        }

        System.out.println("O total de pares é: " + pares);
        System.out.println("O total de impares é: " + impares);


    }
}
