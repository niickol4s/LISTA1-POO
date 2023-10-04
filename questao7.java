// Questão 7 - Escreva um programa em que, dada uma variável x com algum valor inteiro, temos um novo x de acordo com a seguinte regra:
// Se x é par, x = x / 2 ;
// Se x é impar, x = 3 * x + 1 ;
// Imprime x ;

import java.util.Scanner;

public class questao7 {

    public static int newValue (int vle) {
        if(vle % 2 == 0) vle /= 2;
        else vle = (3 * vle) + 1;

        return vle;
    }
    public static void main(String [] args) {
        Scanner inputValue = new Scanner(System.in);

        System.out.print("Valor: ");
        int value = inputValue.nextInt();

        while(value != 1) {
            System.out.print(value + " -> ");
            value = newValue(value);
        }

        System.out.println(value);
    }
}