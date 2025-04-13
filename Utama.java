// Nama kelas (Mahasiswa)
class Mahasiswa {
    // Atribut nama bertipe String untuk menyimpan nama mahasiswa. bersifat default (hanya bisa diakses dalam satu package)
    String nama;
    Mahasiswa(String nama){ // methode Constructor dari kelas Mahasiswa, digunakan untuk mengisi data saat objek dibuat
        this.nama = nama;  // 'this.nama' merujuk pada atribut kelas, sedangkan 'nama' adalah parameter constructor
    }


    void perkenalkanDiri(){    // Method untuk menampilkan perkenalan diri
        System.out.println("Halo, nama saya: " + this.nama);// Mencetak teks perkenalan beserta nilai atribut 'nama' ke layar
    }
}

// Kelas utama tempat program dijalankan
public class Utama {
    public static void main(String[] args) { // adalah titik awal eksekusi program Java. harus ada agar bisa dijalannkan
        Mahasiswa mhs = new Mahasiswa("Budi");// Membuat objek Mahasiswa dengan nama Budi.
        mhs.perkenalkanDiri(); // Memanggil method perkenalkanDiri() untuk menampilkan nama mahasiswa
    }
}



//Program ini bertujuan untuk menampilkan perkenalan diri dari seorang mahasiswa.
// Program ini memperlihatkan bagaimana cara menggunakan class, atribut, constructor, 
// dan method dalam konteks perkenalan.