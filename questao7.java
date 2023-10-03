// Questão 7 - Escreva um programa em que, dada uma variável x com algum valor inteiro, temos um novo x de acordo com a seguinte regra:
// Se x é par, x = x / 2 ;
// Se x é impar, x = 3 * x + 1 ;
// Imprime x ;


public class questao7 {

    public static int newValue (int vle) {
        if(vle % 2 == 0) vle /= 2;
        else vle = 3 * (vle + 1);

        return vle;
    }
    public static void main(String [] args) {
        int value = 4;

        System.out.print(newValue(value));
    }
}
