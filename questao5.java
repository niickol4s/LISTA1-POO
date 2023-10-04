// Questão 5 - Imprima os primeiros números da série de Fibonacci até passar de 100.

public class questao5 {
    public static void main(String [] args) {
        int firstValue = 0;
        int secondValue = 1;

        while(firstValue <= 100) {
            System.out.println(firstValue + " ");

            int nextValue = firstValue + secondValue;
            firstValue = secondValue;
            secondValue = nextValue;
        }
    }
}
