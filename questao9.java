import java.util.Scanner;

public class questao9 {
    public static void main(String[] args) {
        Scanner inputOption = new Scanner(System.in);
        
        while (true) {
            menu();
            
            int option = inputOption.nextInt();
            
            switch (option) {
                case 1:
                    System.out.print("\nSalário (R$): ");
                    double salary = inputOption.nextDouble();
                    
                    double[] adjustment = salaryAdjustment(salary);
                    double percentage = adjustment[0];
                    double increase = adjustment[1];
                    double newSalary = adjustment[2];
                    
                    System.out.println("\nInformações salariais: ");
                    System.out.printf("Salário original (R$): %.2f%n", salary);
                    System.out.printf("Aumento salarial (%%): %.0f%n", percentage);
                    System.out.printf("Valor do aumento (R$): %.2f%n", increase);
                    System.out.printf("Salário atual (R$): %.2f%n", newSalary);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
    
    public static double[] salaryAdjustment(double slr) {
        double[] result = new double[3];
        
        if (slr <= 280) {
            double newSlr = slr + (slr * 20 / 100);
            double ics = newSlr - slr;
            double pct = (newSlr - slr) / slr * 100;
            result[0] = pct;
            result[1] = ics;
            result[2] = newSlr;
        } else if (280 < slr && slr < 700) {
            double newSlr = slr + (slr * 15 / 100);
            double ics = newSlr - slr;
            double pct = (newSlr - slr) / slr * 100;
            result[0] = pct;
            result[1] = ics;
            result[2] = newSlr;
        } else if (700 < slr && slr < 1500) {
            double newSlr = slr + (slr * 10 / 100);
            double ics = newSlr - slr;
            double pct = (newSlr - slr) / slr * 100;
            result[0] = pct;
            result[1] = ics;
            result[2] = newSlr;
        } else if (slr >= 1500) {
            double newSlr = slr + (slr * 5 / 100);
            double ics = newSlr - slr;
            double pct = (newSlr - slr) / slr * 100;
            result[0] = pct;
            result[1] = ics;
            result[2] = newSlr;
        }
        
        return result;
    }
    
    public static void menu() {
        System.out.println("\nEscolha uma opção:\n");
        System.out.println("1 - Inserir salário;");
        System.out.println("0 - Encerrar.");
        System.out.print("\nOpção: ");
    }
}

