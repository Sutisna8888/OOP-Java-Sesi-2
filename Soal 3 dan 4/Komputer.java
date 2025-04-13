package Soal3;

public class Komputer {   // nama class, harus sama dengan nama file
    String jenis_komputer;  // atribut pada class Komputer dengan tanpa modifier atau default
    private String merk;   // atribut merk, modifier private
    

    // methode setter setDataKomputer berguna untuk mengisi dan memanipulasi nilai atribut pada objek dari class Komputer.
    // kata this digunakan untuk membedakan antara variabel class dan parameter 
    public void setDataKomputer(String jenis_komputer,String merk){ 
        this.jenis_komputer = jenis_komputer;   
        this.merk = merk;
    }

    // methode getter yang berguna untuk mengambil atau membaca data dari variabel jenis_komputer dan mengembalikannya nilainya.
    // methode ini bersifat public atau boleh diakses darimana saja
    public String getjenis(){
        return jenis_komputer;
    }

    // berguna untuk mengambil atau membaca data dari variabel merk dan mengembalikannya nilainya.
    // karena atribut merk bersifat private, methode ini memungkinkan nilai merk bisa diakses dari luar class
    public String getMerk(){
        return merk;
    }

    public static void main(String[] args) {
        Komputer mykom = new Komputer(); // kode untuk membuat objek baru dari class komputer yang bernama mykom 
            mykom.setDataKomputer("LAPTOP", "MACBOOK"); // mengisi nilai pada methode setter kedalam objek mykom
            System.out.println(mykom.getjenis()); // mengambil dan menampilkan nilai menggunakan getjenis() dalam objek mykom 
            System.out.println(mykom.getMerk()); // mengambil dan menampilkan nilai menggunakan getmerk() dalam objek mykom 
    }
}