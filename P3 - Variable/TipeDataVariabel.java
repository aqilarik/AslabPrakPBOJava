//Sesuaikan dengan nama package kalian
package p3_variabel_ppt;

public class TipeDataVariabel {

    /*
        TIPE DATA PRIMITIF, ADA 8 JENIS
        Variabel dibawah ini adalah Instance Variable
     */
    // komentar disebelah instance variable adalah ukuran dari tipe data tersebut
    byte angkaPertama = 1; // -128 sampe 127
    short angkaKedua = 2; // -/+ 32++ ribu
    int angkaKetiga = 3; // -/+ 2.1++ miliar
    long angkaKeempat = 4; // -/+ 9.2++ Quintillion
    float desimalFloat = 0.07f; // 6 - 7 digit desimal
    double desimalDouble = 0.001; // sampai 15 digit desimal
    boolean benar = true; //hanya bisa bernilai true atau false
    char a = 'a'; //karakter/huruf tunggal

    /*
        Kenapa String ga termasuk tipe data primitif?
        .
        Dibandingkan dengan tipe data primitif lain, kenapa cuma String yang 
        "tipe data"-nya diawali dengan huruf kapital?
        .
        String termasuk tipe data apa dong?
     */
    public void cetak() {
        // Kalimat adalah local variable karena didalam method cetak()
        String kalimat = "\n###### Tipe Data Primitif ######";
        System.out.println(kalimat);
    }
}

class mainTPV {

    public static void main(String[] args) {
        // Perbandingan variabel primimitif dengan non-primitif
        int angka = 1; // ini local variable dan tipe datanya primitif
        TipeDataVariabel tpv = new TipeDataVariabel(); // tipe data non-primitif

        // Bukti variabel primitif berisi nilai aktual
        System.out.println("Nilai dari variabel primitif adalah " + angka);
        // Bukti variabel non-primitif merujuk ke objek (nilainya berupa alamat)
        System.out.println("Nilai dari variabel non-primitif adalah " + tpv);

        /*
            Untuk memanggil instance variable dan method di class
            TipeDataVariabel, formatnya adalah:
                        - namaReferensiObjek.namaInstanceVariable
                        - namaReferensiObjek.namaMethod
         */

        tpv.cetak();
        System.out.println(tpv.angkaPertama);
        System.out.println(tpv.angkaKedua);
        System.out.println(tpv.angkaKetiga);
        System.out.println(tpv.angkaKeempat);
        System.out.println(tpv.desimalFloat);
        System.out.println(tpv.desimalDouble);

    }
}
