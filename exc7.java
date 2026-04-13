import java.util.Scanner;

//Júlio César da Silva

public class exc7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int contador = 1;
        int qtdSemObesidade = 0;
        double peso, altura, imc;

        while (contador <= 10) {
            System.out.println("Pessoa " + contador);

            System.out.print("Digite a altura (em metros): ");
            altura = scanner.nextDouble();

            System.out.print("Digite o peso (em kg): ");
            peso = scanner.nextDouble();

            imc = peso / (altura * altura);

            if (imc >= 18.5 && imc <= 24.9) {
                qtdSemObesidade++;
            }

            contador++;
            System.out.println();
        }

        System.out.println("Quantidade de pessoas sem obesidade: " + qtdSemObesidade);

        scanner.close();

    }
}
