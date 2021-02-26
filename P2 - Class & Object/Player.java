package pertemuan2;

public class Player {

    /*
        Variabel "number" menampung angka tebakan
        Kenapa variabel "number" tidak dideklarasikan didalam method guess()? 
        Alasannya adalah agar nilai dari variabel "number" dinamis. 
        Jawaban kurang memuaskan, ya? Tenang, kita akan membahas tentang 
        variabel dipertemuan selanjutnya.
     */
    int number = 0;

    // Method untuk pemain agar dapat menebak/memikirkan angka
    public void guess() {
        /*
            Menggunakan Math.random() untuk menghasilkan angka tebakan pemain
            Karena hasil dari Math.random() < 1, makanya kita kali 10 dahulu, dan
            di-casting dengan "int" agar menghasilkan angka tebakan yang bulat.
        */
        number = (int) (Math.random() * 10);
        System.out.println("\"Saya menebak angka " + number + "!\"");
    }
}
