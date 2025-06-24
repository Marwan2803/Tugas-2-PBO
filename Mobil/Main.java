package sesi_2.Mobil; // package ini untuk menentukan folder mana yang dipakai

class Mobil { // deklarasi pembuatan class dengan nama class Mobil
    String merk; // deklarasi variabel yang bernama merk dengan tipe data string

    Mobil(String merk) { // konstruktor untuk class Mobil dengan dengan parameter merk yang bertipe data
                         // string
        this.merk = merk; // inisialisasi merk
    }

    void tampilkanMerk() { // deklarasi method dengan nama method tampilkanMerk
        System.out.println("Merk mobil: " + this.merk); // akan menampilkan "Merk mobil: 'nama mobil yang dimasukkan'"
    }
}

public class Main { // deklarasi class yang harus ada
    public static void main(String[] args) { // juga deklarasi fungsi yang harus ada
        Mobil m = new Mobil("Toyota"); // proses pembuatan objek m dari class Mobil
        m.tampilkanMerk(); // memanggil method tampilkanMerk() nantinya akan menghasilkan output "Merk
                           // mobil: Toyota"
    }
}

// Tujuan dari program ini adalah ya sama dengan class Mahasiswa yaitu agar kita
// tidak usah menulis ulang kode yang sama berulang-ulang
// Kalau di program ini tujuannya menampilkan merk dari method class Mobil
