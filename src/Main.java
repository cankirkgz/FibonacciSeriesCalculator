import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisi eleman sayısını giriniz: ");
        int elemanSayisi = input.nextInt();

        int ilkSayi = 0, ikinciSayi = 1;

        System.out.print(elemanSayisi + " Elemanlı Fibonacci Serisi: ");

        if (elemanSayisi >= 1) {
            System.out.print(ilkSayi + " ");
        }
        if (elemanSayisi >= 2) {
            System.out.print(ikinciSayi + " ");
        }

        for (int i = 3; i <= elemanSayisi; i++) {
            int yeniSayi = ilkSayi + ikinciSayi;
            System.out.print(yeniSayi + " ");

            ilkSayi = ikinciSayi;
            ikinciSayi = yeniSayi;
        }
    }
}