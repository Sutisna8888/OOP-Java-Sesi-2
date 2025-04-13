// nama class
class Mobil {
    String merk;  // Atribut 'merk' bertipe String, bersifat default (hanya bisa diakses dalam satu package)
    
    Mobil(String merk){ // methode Constructor kelas Mobil, digunakan untuk mengisi data saat objek dibuat
        this.merk = merk; // 'this.merk' merujuk pada atribut kelas, sedangkan 'merk' adalah parameter constructor
    }

    // Method untuk menampilkan merk dan tidak mengembalikan nilai (void)
    void tampilkanMerk(){
        System.out.println("Merk Mobil: " + this.merk); // Mencetak "Merk Mobil" beserta nilai atribut 'merk' ke layar
    }
}

// Kelas utama tempat program dieksekusi
public class Main {
    public static void main(String[] args) { // adalah titik awal eksekusi program Java. harus ada agar bisa dijalannkan
        Mobil m = new Mobil("Toyota"); // kode untuk membuat objek baru (m) dari class Mobil
        m.tampilkanMerk(); // Memanggil method tampilkanMerk() untuk menampilkan merk mobil
    }
}


// Program ini bertujuan untuk membuat objek mobil dan menampilkan mereknya.
//Program menunjukkan cara membuat class sederhana dengan atribut dan method, 
//serta cara menggunakan constructor untuk mengisi nilai atribut saat objek dibuat.