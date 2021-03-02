package pertemuan1;


public class p1_bentukFrasa {

    public static void main(String[] args) {
        String[] listKataSatu = {"rumah", "sepeda", "ayam", "jam", "baju", "mobil", "laptop", "smartphone"};
        String[] listKataDua = {"canggih", "nyaman", "enak", "terbaru", "besar", "hitam", "bagus", "luas"};
        String[] listKataTiga = {"itu", "diatas", "milikmu", "miliknya", "di toko", "baru", "putih"};

        // Banyak kata disetiap list
        System.out.println("Ada " + listKataSatu.length + " kata pada listKataSatu");
        System.out.println("Ada " + listKataDua.length + " kata pada listKataDua");
        System.out.println("Ada " + listKataTiga.length + " kata pada listKataTigas");

        // Generate 3 bilangan random untuk listKataSatu
        /*
            Kenapa Math.random * banyak kata dalam tiap list?
            Nilai dari Math.random() selalu < 1, dikalikan dengan
            (panjang maksimal tiap list - 1)) + 1) untuk bisa mendapatkan 
            kemungkinan indeks angka terendah dan tertinggi. Misalkan:
                - Math.random() = 0 -> 0 * (7 - 1) + 1 = 1 (indeks terkecil)
                - Math.random() = 0 -> 1 * (7 - 1) + 1 = 7 (indeks tertinggi)
         */
        int randomLKS = (int) ((Math.random() * (listKataSatu.length - 1)) + 1);
        int randomLKD = (int) ((Math.random() * (listKataDua.length - 1)) + 1);
        int randomLKT = (int) ((Math.random() * (listKataTiga.length - 1)) + 1);

        // Membangun sebuah frasa
        String frasa = listKataSatu[randomLKS] + " " + listKataDua[randomLKD] + " " + listKataTiga[randomLKT];

        // Cetak frasa tersebut
        System.out.println("Saya menginginkan sebuah " + frasa);
    }
}
