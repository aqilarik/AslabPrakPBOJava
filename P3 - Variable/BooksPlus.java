package pertemuan3;

class BooksPlus {

    String title;
    String author;
}

class BooksPlusTestDrive {

    public static void main(String[] args) {
        Books[] myBooks = new Books[3];
        
        // Menggunakan array 1D untuk menyimpan identitas dari tiap buku
        String[] judul = {"Melawan Kemustahilan", "Muhammad Al Fatih 1453", "awe-inspiring me"};
        String[] penulis = {"Dewa", "Felix", "Dewi"};

        for (int i = 0; i < 3; i++) {
            myBooks[i] = new Books();
            myBooks[i].title = judul[i];
            myBooks[i].author = penulis[i];
        }

        int x = 0;
        while (x < myBooks.length) {
            System.out.print(myBooks[x].title);
            System.out.print(" karya ");
            System.out.print(myBooks[x].author + "\n");
            x++;
        }
    }
}
