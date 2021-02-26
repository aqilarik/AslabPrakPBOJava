//Sesuaikan dengan nama package kalian
package p3_variabel_ppt;

public class JenisVariabel {
    // Ini Instance Variable
    // Kalo nilai variabel1 dan variabel2 dihapus, ada yang error ga ya?
    String variabel1 = "Ini contoh variabel";
    String variabel2 = "Ini juga contoh variabel";
    
    // Ini Static/Class Variable
    // Kalo nilai variabel3 dihapus, ada yang error ga ya?
    static String variabel3 = "Ini variabel tapi kok ada static-nya?";
    
    // Membuat method untuk mencetak variabel yang ada
    public void cetakSemuaVariabel(){
        // Kita coba buat variabel baru didalam method ini
        // Kalo nilai variabel4 dihapus, ada yang error ga ya?
        // Ini local variable
        String variabel4 = "Ini variabel lagi. Karena local, ga bisa sembarangan dipanggil";
        
        // Kita cetak aja kali ye
        System.out.println(variabel1);
        System.out.println(variabel2);
        System.out.println(variabel3);
        System.out.println(variabel4);
    }
}

class main{
    public static void main(String[] args) {
        // Buat objek, biar bisa manggil instance variable
        JenisVariabel contoh = new JenisVariabel();
        
        // Yakali ga dicetak
        System.out.println(contoh.variabel1); // namaObjek.namaInstanceVariable
        System.out.println(contoh.variabel2); // namaObjek.namaInstanceVariable
        System.out.println(JenisVariabel.variabel3); // namaKelas.namaInstanceVariable
        // System.out.println(contoh.variabel4); // Gabisa dipanggil karena local
        
        System.out.println("\nCetak Variabel lagi, disini variabelnya jadi ada 4:");
        // Panggil method cetakSemuaVariabel()
        contoh.cetakSemuaVariabel();
    }
}


