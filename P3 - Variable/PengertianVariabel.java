//Sesuaikan dengan nama package kalian
package p3_variabel_ppt;

public class PengertianVariabel {
    public static void main(String[] args) {
        //Format -> tipeData namaVariabel = nilai
        String helloWorld = "Hello World!";
        int angka1 = 1;
        double phi = 3.14;
        boolean benar = true;
        
        /*           
            Aturan nama variabel: 
                1. Nama variabel membedakan huruf besar/kecil (case sensitive)
                2. Diawali dengan huruf kecil, meskipun $ (lambang dollar) 
                   atau _ (underscore) diperbolehkan.
                3. Tidak boleh diawali dengan angka
                4. Tidak menggunakan kata kunci yang digunakan pada Java
        
            Cek di website Oracle bagian "Naming Convention"!
            https://www.oracle.com/java/technologies/javase/codeconventions-namingconventions.html
        */
        
        String beda = "nama variabel ini tidak sama";
        String bEda = "nama variabel ini berbeda";
        String b3dA = "nama variabel yang alay, tidak disarankan";
        String duaKata = "Kalo nama variabelnya dua kata, huruf pertama kata ke-2 dibuat kapital";
        String dua_kata = "Boleh juga gini, tapi biasanya kayak diatas";
    }
    
}
