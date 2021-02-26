package pertemuan2;

public class GuessGame {

    /*
        Deklarasi variabel objek untuk menyimpan data pemain
        Sebenarnya player1, player2, player3 bukan benar-benar "objek", nanti 
        akan dibahas dipertemuan selanjutnya.
    
        Cuma dibuat sekali, tapi bisa menghasilkan 3 player!
     */
    Player player1, player2, player3;

    // Deklarasi variabel untuk menyimpan angka tebakan pemain
    int guessP1, guessP2, guessP3;

    /* 
        Deklarasi variabel untuk menyimpan kondisi menang atau 
        tidaknya seorang pemain
     */
    boolean player1isRight, player2isRight, player3isRight;

    // Method yang berisi jalannya permainan tebak angka
    public void startGame() {
        // Inisialisasi semua variabel!
        player1 = new Player();
        player2 = new Player();
        player3 = new Player();

        guessP1 = 0;
        guessP2 = 0;
        guessP3 = 0;

        player1isRight = false;
        player2isRight = false;
        player3isRight = false;

        /*  
            Mendeklarasikan variabel targetNumber yang berisi angka 
            yang harus ditebak oleh pemain
            Sama seperti di class Player, menggunakan Math.random() untuk 
            menghasilkan angka target
         */
        int targetNumber = (int) (Math.random() * 10);

        /*
            Angka target sudah disimpan di variabel targetNumber
            Selanjutnya, pemain akan diminta untuk menebak angka tersebut!
         */
        System.out.println("################ GUESS GAME ################");
        System.out.println("Aku lagi mikirin angka antara 0-9...");
        System.out.println("Angka yang harus ditebak adalah " + targetNumber);
        System.out.println("============================================");

        /*
            Kita menginginkan ada pemain yang dapat menebak angka target
            dengan benar.
            Namun, tentunya program tidak bisa memastikan akan ada pemain 
            yang akan nebak angkanya dengan benar dalam 1 putaran permainan.
            Oleh karena itu digunakanlah perulangan, agar program akan terus
            diulang sampai ada pemain yang menebak angka target dengan benar.
         */
        int n = 1; // Untuk menandakan putaran ke-n
        while (true) {
            // Sekarang putaran ke berapa?
            System.out.println("Putaran #" + n + ": ");
            
            /*
                Memanggil method guess() yang ada di class Player, tiap pemain 
                'memikirkan' angka untuk menebak angka target.
                format memanggil method -> namaObject.namaMethod()
             */
            player1.guess();
            player2.guess();
            player3.guess();
            
            /*
                Hasil tebakan diinisialisasi ke variabel guessP1,
                guessP2, dan guessP3.
            
                format memanggil variabel -> namaObject.namaVariabel
            */
            guessP1 = player1.number;
            System.out.println("Pemain pertama menebak angka " + guessP1);

            guessP2 = player2.number;
            System.out.println("Pemain kedua menebak angka " + guessP2);

            guessP3 = player3.number;
            System.out.println("Pemain ketiga menebak angka " + guessP3);

            /*
                Tiap pemain sudah menebak angka. Sekarang program memastikan
                apakah tebakan para pemain benar atau salah.
                Caranya?
                Jika ada pemain yang menebak dengan benar, kondisi pada 
                player(ke-n)isRight diinisialisasi menjadi true!
             */
            if (guessP1 == targetNumber) {
                player1isRight = true;
            }
            if (guessP2 == targetNumber) {
                player2isRight = true;
            }
            if (guessP3 == targetNumber) {
                player3isRight = true;
            }
            
            /*
                Hasil dari kondisi p(ke-n)isRight akan dijadikan indikator 
                keputusan dari program. Jika ada (setidaknya) 1 pemain yang 
                menebak angka target dengan benar, maka program akan dihentikan. 
                Begitu juga sebaliknya.
                
                Jadi paham kan kondisi dalam if dibawah menggunakan OR ( || )?
                Karena hasil dari program ini setidaknya menghasilkan 1 pemenang
                Kalo masih bingung, coba cek logika OR itu cara kerjanya gimana.
             */
            if (player1isRight || player2isRight || player3isRight) {
                System.out.println("============================================");
                System.out.println("Mantap, sudah ada yang menang!");
                System.out.println("Apakah pemain 1 yang menang? " + player1isRight);
                System.out.println("Apakah pemain 2 yang menang? " + player2isRight);
                System.out.println("Apakah pemain 3 yang menang? " + player3isRight);
                System.out.println("############ PERMAINAN SELESAI! ############");
                /*
                    Kenapa ada break? Karena kondisi perulangan adalah true.
                    Jika tidak ada break, maka program akan berjalan terus-
                    menerus.
                */
                break;
            } else {
                System.out.print("Yah, ga ada yang menang... Coba tebak lagi!\n");
                System.out.println("============================================");
                // Memperbaharui putaran ke-n, dengan cara diinkremen
                n++;
            }
        }
    }
}
