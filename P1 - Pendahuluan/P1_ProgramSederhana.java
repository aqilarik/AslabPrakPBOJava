package pertemuan1;

import javax.swing.JOptionPane;

public class P1_ProgramSederhana {

    public static void main(String[] args) {
        System.out.println("######## Menentukan Ganjil-Genap dari Bilangan Random########");
        // Ini statement
        int bilangan, input;
        
        // Perulangan untuk menangani input bukan angka
        while (true) {
            try {
                // Mengubah input dari String ke Integer
                input = Integer.parseInt(JOptionPane.showInputDialog("Masukkan banyak angka yang akan ditampilkan: "));
                // Keluar dari perulangan jika input adalah angka
                break;
            } catch (NumberFormatException e) {
                // Jika input bukan angka, maka akan menampilkan pesan ini
                JOptionPane.showMessageDialog(null, "Input bukan angka. Coba lagi!");
            }
        }
        
        // Perulangan untuk menampilkan angka random sesuai dengan jumlah inputan
        for (int i = 0; i < input; i++) {
            // Dikalikan 100 agar range angka random ada diantara 0 - 100
            bilangan = (int) (Math.random() * (Math.random() * 100));
            // Jika hasil dari modulo 2 adalah 0, maka bilangan genap
            if (bilangan % 2 == 0) {
                System.out.println("Angka " + bilangan + " adalah bilangan genap");
            } else {
                // Jika hasil modulo tidak sama dengan 0, maka bilangan ganjil
                System.out.println("Angka " + bilangan + " adalah bilangan ganjil");
            }
        }
    }
}
