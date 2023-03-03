public class SequenciasLogicas {

    public static void main(String[] args) {
        // Sequência a) 1, 3, 5, 7, ___
        int a1 = 1;
        int r1 = 2;
        int n1 = 5;
        int an1 = a1 + (n1 - 1) * r1;
        System.out.println("Próximo elemento da sequência a): " + an1);

        // Sequência b) 2, 4, 8, 16, 32, 64, ____
        int a2 = 2;
        int n2 = 7;
        int an2 = a2 * (int) Math.pow(2, n2 - 1);
        System.out.println("Próximo elemento da sequência b): " + an2);

        // Sequência c) 0, 1, 4, 9, 16, 25, 36, ____
        int n3 = 8;
        int an3 = (int) Math.pow(n3 - 1, 2);
        System.out.println("Próximo elemento da sequência c): " + an3);

        // Sequência d) 4, 16, 36, 64, ____
        int a4 = 4;
        int r4 = 12;
        int n4 = 5;
        int an4 = a4 + (n4 - 1) * r4;
        System.out.println("Próximo elemento da sequência d): " + an4);

        // Sequência e) 1, 1, 2, 3, 5, 8, ____
        int a5 = 2;
        int b5 = 3;
        int n5 = 7;
        int an5 = a5 + b5;
        for (int i = 3; i < n5; i++) {
            int temp = an5;
            an5 = a5 + b5;
            a5 = temp;
            b5 = an5;
        }
        System.out.println("Próximo elemento da sequência e): " + an5);

        // Sequência f) 2,10, 12, 16, 17, 18, 19, ____
        int a6 = 19;
        int r6 = -1;
        int n6 = 8;
        int an6 = a6 + (n6 - 1) * r6;
        System.out.println("Próximo elemento da sequência f): " + an6);
    }
}