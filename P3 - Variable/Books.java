//Sesuaikan dengan nama package kalian
package pertemuan3;

class Books {

    // INSTANCE VARIABLE
    String title;
    String author;
    static String penerbit;
}

class BooksTestDrive {
    public static void main(String[] args) {
        // Array 1 dimensi digunakan untuk menyimpan seluruh buku
        // Ibaratkan Array myBooks INGIN kita jadikan rak;
        Books[] myBooks = new Books[3];
        
        /*
            Karena komputer ga bisa otomatis paham data apa yang akan disimpan 
            didalamnya (komputer cuma paham kalo myBook itu rak, tapi tiap baris 
            raknya belum didefinisiin buat apa), makanya kita definisikan dulu
            kalo tiap baris rak akan kita isikan buku baru. Kalo ga 
            didefinisikan, komputer bakal bingung a.k.a error.
        */
        
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();
        
        /*
            Komputer sekarang udah tau kalo bakal ada buku yang disimpan dalam
            rak buku (array), sebenernya komputer udah nyiapin tempat nyimpen 
            bukunya tapi masih gatau informasi tentang bukunya. Nah, tiap buku 
            pastinya punya identitas kan? Misalkan kayak judul dan nama penulis
            bukunya. Nah berarti kita harus definisiin dulu identitasnya biar 
            komputer tau.
        */
        
        // Menyimpan judul dari buku indeks ke-n 
        myBooks[0].title = "Belajar Bahasa Pemrograman Java";
        myBooks[1].title = "Java: Pemrograman Berbasis Objek";
        myBooks[2].title = "Java untuk Pemula";
        
        // Menyimpan nama penulis dari buku indeks ke-n 
        myBooks[0].author = "Aqilarik";        
        myBooks[1].author = "Nugra";        
        myBooks[2].author = "Rezkanintio";
        
        // Menyimpan nama Penerbit
        Books.penerbit = "Percetakan Mantul";
        
        // Variabel untuk perulangan. Ini contoh dari variabel lokal
        int x = 0;
        while (x < myBooks.length) {
            System.out.print(myBooks[x].title);
            System.out.print(" karya ");
            System.out.print(myBooks[x].author);
            System.out.print(". Dicetak oleh Penerbit " + Books.penerbit + "\n");
            x++;
        }
    }
}
