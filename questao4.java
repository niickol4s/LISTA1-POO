// Questão 4 - Elabore um código que ao informar um número, imprima se este número é primo.

import java.util.Scanner;

public class questao4 {
    public static void main(String [] args) {

        Scanner inputNumber = new Scanner(System.in);
        int number;
        System.out.print("Valor: ");
        number = inputNumber.nextInt();
        if(number % 1 == 0 && number % number == 0 && number % number == 1) System.out.printf("%d é primo.", number);
        else System.out.printf("%d não é primo.", number);
    }
}
