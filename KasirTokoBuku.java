import java.util.Scanner;

public class KasirTokoBuku {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // definisi variabel
        String nama_barang;
        double harga_barang, diskon, total_harga, harga = 0;
        int jumlah_barang;

        System.out.println("Nama Barang: ");
        nama_barang = scan.nextLine();

        System.out.println("Harga Barang: ");
        harga_barang = scan.nextDouble();

        System.out.println("Jumlah Barang: ");
        jumlah_barang = scan.nextInt();

        // menghitung total harga
        total_harga = (int) (harga_barang * jumlah_barang);
        System.out.println("HARGA: " + total_harga);

        if (total_harga >= 500000) { //jika total harga lebih dari 500000, maka mendapat diskon 50%
            diskon = total_harga * 50 / 100;
            total_harga = total_harga - diskon;
            System.out.println("Total Harga Setelah di Diskon: Rp" + total_harga);
        } else if (total_harga > 200000) { //jika total harga lebih dari 200000, maka mendapat diskon 20%
            diskon = total_harga * 20 / 100;
            total_harga = total_harga - diskon;
            System.out.println("Total Harga Setelah di Diskon: Rp" + total_harga);
        } else if (total_harga >= 100000) {  //jika total harga lebih dari 100000, maka mendapat diskon 10%
            diskon = total_harga * 10 / 100;
            total_harga = total_harga - diskon;
            System.out.println("Total Harga Setelah di Diskon: Rp" + total_harga);
        } else {
            diskon = total_harga * 1;
            System.out.println("Total Harga Rp" + total_harga);
        }
    }
}
