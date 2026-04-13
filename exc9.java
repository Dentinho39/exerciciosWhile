import java.util.Scanner;

//Júlio César da Silva

public class exc9 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int codigo, quantidade;
        double preco = 0, totalProduto, totalCompra = 0;
        char continuar = 'S';

        while (continuar == 'S' || continuar == 's') {

            System.out.print("Digite o código do produto: ");
            codigo = entrada.nextInt();

            System.out.print("Digite a quantidade: ");
            quantidade = entrada.nextInt();

            switch (codigo) {
                case 100:
                    preco = 1.20;
                    break;
                case 101:
                    preco = 1.30;
                    break;
                case 102:
                    preco = 1.50;
                    break;
                case 103:
                    preco = 1.20;
                    break;
                case 104:
                    preco = 1.30;
                    break;
                case 105:
                    preco = 1.00;
                    break;
                default:
                    System.out.println("Código inválido!");
                    preco = 0;
            }

            totalProduto = preco * quantidade;
            totalCompra += totalProduto;

            System.out.println("Valor a pagar por este produto: R$ " + totalProduto);

            System.out.print("Deseja continuar comprando? (S/N): ");
            continuar = entrada.next().charAt(0);

            System.out.println();
        }

        System.out.println("Valor total da compra: R$ " + totalCompra);

        entrada.close();

    }
}
