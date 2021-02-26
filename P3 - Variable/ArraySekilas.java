//Sesuaikan dengan nama package kalian
package p3_variabel_ppt;

public class ArraySekilas {

    /*
    Kita buat instance variable dulu. Variabel ini dideklarasikan untuk 
    membuat array yang elemennya adalah variabel referensi
     */
    String nim;
    String nama;
    /* 
        Ceritanya semua mahasiswa dari UIN Malang, jadi nilai dari variabel 
        kampus tidak unik. Cocok untuk menggunakan static variable.
    */    
    static String kampus = "UIN Malang"; 
}

class ArraySekilasTestDrive {

    public static void main(String[] args) {
        // Kita coba buat array yang elemennya adalah variabel primitif
        int[] angka = new int[3];
        
        // Diinisialisasikan dengan nilai aktual
        angka[0] = 1;
        angka[1] = 2;
        angka[2] = 3;
        // Menampikan array berelemen variabel primitif
        System.out.println("Ini adalah contoh array berelemen variabel primitif: ");
        for (int i = 0; i < angka.length; i++) {
            System.out.println(angka[i]);
        }
        
        ArraySekilas[] arrayMhs = new ArraySekilas[3];
        
        // Diinisialisasi dengan referensi objek
        arrayMhs[0] = new ArraySekilas();
        arrayMhs[1] = new ArraySekilas();
        arrayMhs[2] = new ArraySekilas();
        
        arrayMhs[0].nama = "Aqilarik";
        arrayMhs[1].nama = "Nugra";
        arrayMhs[2].nama = "Rezkanintio";
        
        arrayMhs[0].nim = "17650001";
        arrayMhs[1].nim = "17650002";
        arrayMhs[2].nim = "17650003";
        
        // Menampikan array berelemen variabel referensi
        System.out.println("\nIni adalah contoh array berelemen variabel referensi: ");
        for (int i = 0; i < arrayMhs.length; i++) {
            System.out.println("NIM dari " + arrayMhs[i].nama + " adalah " + 
                    arrayMhs[i].nim + ". " + arrayMhs[i].nama + " adalah mahasiswa " + 
                    ArraySekilas.kampus);
        }
    }
}
