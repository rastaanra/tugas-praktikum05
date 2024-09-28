import java.util.Scanner;
public class kategoriUsia19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Pastikan usia yang anda inputkan merupakan angka positif");
        System.out.println("Masukkan usia anda: ");
        int usia = sc.nextInt();

        if (usia >= 0 && usia <=12) {
            System.out.println("Kategori Anak");
        }  else if (usia >= 13 && usia <= 19) {
            System.out.println("Kategori Remaja");
        } else if (usia >= 20 && usia <=64) {
            System.out.println("Kategori Dewasa");
        } else if (usia >=65) {
            System.out.println("Kategori Lansia");
        } else {
            System.out.println("Data tidak valid");
        }
        
    }
}