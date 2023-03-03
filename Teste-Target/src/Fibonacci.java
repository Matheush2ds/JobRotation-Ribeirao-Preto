import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scan.nextInt();

        int fibo1 = 0;
        int fibo2 = 1;
        int fibo3 = 0;
        boolean pertence = false;

        System.out.print("Sequência de Fibonacci até " + num + ": ");
        System.out.print(fibo1 + ", " + fibo2);

        while (fibo3 < num) {
            fibo3 = fibo1 + fibo2;
            System.out.print(", " + fibo3);
            if (fibo3 == num) {
                pertence = true;
            }
            fibo1 = fibo2;
            fibo2 = fibo3;
        }

        if (pertence) {
            System.out.println("\n" + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("\n" + num + " não pertence à sequência de Fibonacci.");
        }
    }
}