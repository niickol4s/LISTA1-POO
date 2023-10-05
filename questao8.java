
import java.util.Scanner;

public class questao8 {
    public static void main(String[] args) {

        Scanner inputNmbLine = new Scanner(System.in);

        System.out.print("Quantidade de linhas (entre 1 e 10): ");
        int numberLine = inputNmbLine.nextInt(); 

        for (int i = 1; i <= numberLine; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
