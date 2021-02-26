package pertemuan3;

class BooksPlusPlus {

    String title;
    String author;
}

class BooksPlusPlusTestDrive {

    public static void main(String[] args) {
        Books[] myBooks = new Books[3];

        // Array 2D untuk menyimpan tiap identitas buku berupa judul dan nama penulis
        String[][] idBuku = {
            {"Melawan Kemustahilan", "Dewa Eka Prayoga"},
            {"Muhammad Al Fatih 1453", "Felix Siauw"},
            {"awe-inspiring me", "Dewi Nur Aisyah"}
        };

        /*
            Menggunakan nested loop untuk menginisialisasi identitas buku.
            Juga untuk menampilkan output.
        */
        for (int i = 0; i < myBooks.length; i++) {
            myBooks[i] = new Books();
            for (int j = 0; j < idBuku.length; j++) {
                myBooks[i].title = idBuku[i][0];
                myBooks[i].author = idBuku[i][1];
            }
            System.out.print(myBooks[i].title);
            System.out.print(" karya ");
            System.out.print(myBooks[i].author + "\n");
        }
    }
}
