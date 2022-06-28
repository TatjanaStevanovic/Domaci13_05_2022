import java.util.Scanner;

public class proba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj pesama:");
        int n = sc.nextInt();
        String[] nizPesama = new String[n];

        int i = 0;
        while (i < n) {
            System.out.println("Unesi pesmu:");
            nizPesama[i] = sc.next();
            i = i + 1;
        }
        int j = 0;
        while (j < n) {
            System.out.println(nizPesama[j]);
            j = j + 1;

        }
    }
}