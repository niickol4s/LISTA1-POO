// Questão 6 - Imprima os fatoriais de 1 a 10.

public class questao6 {

    public static long calculateFactorial(int fct) {
    if(fct == 0 || fct == 1) {
        return 1;
    }

    long factorial = 1;

    for(int i = 2; i <= fct; i++) {
        factorial *= i;
    }

    return factorial;
}
    public static void main(String [] args) {
        for(int i = 1; i <= 10; i++) {
            long factorial = calculateFactorial(i);
            System.out.println(i + "! = " + factorial);
        }
    }
}
