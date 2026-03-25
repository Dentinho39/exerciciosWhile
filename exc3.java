import java.util.Scanner;

//Júlio César da Silva

public class exc3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num , sequencia = 1;


        num = entrada.nextInt();
        while (num >= sequencia) {
            System.out.println(sequencia);
            sequencia *= 2;

        }
    }
}
