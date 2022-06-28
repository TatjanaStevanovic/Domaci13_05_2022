import java.util.Scanner;

public class Zadatak {
    public static void main(String[] args) {
        // Poziv metode
        System.out.println(Pesme());
    }
    //Napisati funkciju koja od korisnika prikuplja njegove najdraze pesme, kao rezultat vrtatiti niz tih
    //pesama (niz String-ova). Od korisnika najpre traziti koliko pesama zeli da unese.

    public static String Pesme() {

        Scanner sc = new Scanner(System.in);
        //  Unos dužine niza
        System.out.println("Unesite broj pesama:");
        int n = sc.nextInt();
        // Definisanje niza od n članova
        String[] nizPesama = new String[n];

        // Unos pesama
        int i = 0;
        while (i < n) {
            System.out.println("Unesi naziv pesme. AKO SE NAZIV PESME SASTOJI OD VIŠE REČI,SPOJITI REČI  DONJOM CRTOM!!!:");
            nizPesama[i] = sc.next();
            i = i + 1;
        // Ispis pesama
        }
        int j=0;
        while (j < n) {
            System.out.println(nizPesama[j]);
            j = j + 1;


        }
        return nizPesama[j] ;
    }
}