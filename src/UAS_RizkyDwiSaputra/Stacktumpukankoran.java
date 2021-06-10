package UAS_RizkyDwiSaputra;
/*untuk membuat package UAS_RizkyDwiSaputra yg berada di project 19090107-RizkyDwisaputra
yg digunakan sebagai wadah project yg akan kita buat*/
public class Stacktumpukankoran {
    /*untuk membuat class untuk menentukan program java ini berada di class mana*/
    private String data[];
    /*untuk meciptakan instance variable data bertipe data string jadi di main method tidak perlu membuat variable 
    data lagi jadi membuat variable nya di function bukan di main method*/
    private int size;
    /*untuk meciptakan instance variable size bertipe data intelejer yg akan digunakan sebagai penentu kapasitas 
    berapa data yg akan dimasukan*/
    private int Top;
    //untuk meciptakan instance variable Top bertipe data intelejerwadas 
    public Stacktumpukankoran(int kapasitas) {
        //untuk membuat method Stackpakefunction yg mempunyai parameter variable kapasitas betipe data intelejer
        size = kapasitas;
        //unutk menyimpan nilai kapasitas ke dalam instance variable size
        Top = -1;
        //unutuk mengubah value instance variable Top menjadi -1
        data = new String[size];
        /*untuk membuat jumlah data dari instance variable data sesuai dengan value dari variable size yg telah 
        diubah sama dengan variable kapasitas yg diimputkan di fungsi main() nanti*/
    }
    public boolean isEmpety() {
        //untuk membuat fungsi dari variable isempety boolean yg akan digunakan apabila stacknya masih kosong
        return Top == -1;
        /*boolean isemepty akan terpenuhi apabila velue variable top samadengan -1 sesuai dengan value 
        pertama yg diterapkan*/
    }
    public boolean isFull() {
        //untuk membuat fungsi dari variable isfull boolean yg akan digunakan apabila stacknya sudah penuh
        return Top == size - 1;
        /*boolean isfull akan terpenuhi jika velue variable Top samadengan kurang dari 1 value size misal 
        size =4 top =3 maka stack sudah penuh bollean isfull akan tercipta */
    }
    public void masuk(String input) {
        /*untuk membuat prosedur masuk yg mempunyai parameter instance variable input betipe data String  jadi hanya 
        tipe data string yg dapat diimputkan*/
        if (isFull()) {
            System.out.println("tidak dapat memasukan lagi kapasitas tumpukan koran penuh");
            /*apabila fungsi isfull muncul maka tidak dapat memasukan data lagi ke variable data dan akan muncul 
            tulisan "tumpukan koran terlalu tinggi dari kapasitas" */   
        } else {
            //apabila bukan fungsi isfull yg muncul maka sintax dibawah akan dieksekusi    
            data[++Top] = input;
            /*untuk memasukan value input kedalam variable data index top yaitu -1 namun karena ada ++Top maka 
            berubah menjadi 0 dan dimasukan kedalam index 0 dan akan terus diulang selama prosedur ini dipanggil*/
           
            System.out.println( input );
            /*untuk memberitahu user bahwa data yg telah diimputkan kedalam variable input telah dimasukan kedalam 
            stack tumpukan koran*/
        }
    }
    public void keluar() {
        /*untuk membuat prosedur keluar yg akan digunakan untuk mengeluarkan data dari instance variable 
    data yg dimulai dari data paling akhir*/
        if (isEmpety()) {
            System.out.println("tidak ada tumpukan koran lagi yg dapat dikeluarkan");
            /*apabila fungsi isfull muncul maka tidak dapat memasukan data lagi ke variable data dan akan muncul 
            tulisan "tidak ada tumpukan koran lagi"*/   
        } 
              else if (!isEmpety()) {
            //apabila bukan fungsi isfull yg muncul maka sintax dibawah akan dieksekusi
            String temp = data[Top];
            /*untuk membuat variable temp yg datanya sama dengan data index ke top (index terakhir)yg digunakan unutk 
            menyimpan index keberapa yg telah dihapus yg isinya nanti akan digunakan untuk memberitahu user*/
            data[Top] = data[Top--];
            /*untuk mendeklarasikan bahwa data indexke top(index terakhir) = data index yg akan dihapus karena adanya 
            sintax top-- yg artinya menghapus index ke top tersebut beserta isinya.*/  
             System.out.println( temp );
            /*untuk memberitahu user bahwa data dari index yg telah dihapus (yg sebelumnya sudah disimpan oleh temp) 
            telah dikeluarkan dari stack.*/
        }
    }
    public void info() {
        /*untuk membuat prosedur info yg akan digunakan untuk menampilkan value dari vaariable data*/
         System.out.println("info tumpukan koran : ");
        for (int i = 0; i <= Top; i++) {
            //perulangan for yg akan menampilkan satu satu data ke 0 sampai kurang dari sama dengan velue variable Top 
            System.out.println("tumpukan koran ke " + (i+1) + " = " + data[i]);
            /*untuk menampilkan data tersebut sesuai dengan urutannya karena java selalu diwali 0(ke-i) jadi perlu 
            ditambah 1 (i+1)agar urutannya dimluai dari 1*/
        }
         if (isEmpety()) {
            //untuk membuat consition apabila fungsi bollean isEmpety terpenuhi maka sintax dibawah akan dijalankan
            System.out.println("tumpukan koran kosong");
            /*untuk memberitahu user bahwa stack kosong yg diakibatkan kareena jumlah data =0 atau tidak memanggil 
        prosedur execute atau telah memanggil prosedur cum lebih dari execute maupun jumlah data*/
        }
         else if (isFull()) {
            System.out.println("tumpukan koran penuh");
            /*apabila fungsi isfull muncul maka tidak dapat memasukan data lagi ke variable data dan akan muncul 
            tulisan "tumpukan koran terlalu tinggi dari kapasitas" */  
         }    
    }
    public static void main(String[] args) {
        //unutk membuat fungsi main yg akan digunakan sebagai fungsi utama dalam program java ini
        Stacktumpukankoran koran = new Stacktumpukankoran(0);
        /*untuk membuat objek koran yg akan digunakan sebagai perintah eksekusi prosedur dalam method Stacktumpukankoran 
        yang berkapasitas 4 sus*/
        System.out.println("Koran Masuk : ");
        //untuk memberitahu user bahwa yg ada dibawah tulisan ini adalah koran yg telah keluar 
        koran.masuk("koran tribun jateng");
        //tumpukan pertama koran tribun jateng dimasukan kedalam variable data melalui prosedur masuk dengan object koran
        koran.masuk("koran sindo");
        //tumpukan kedua koran sindo dimasukan kedalam variable data melalui prosedur masuk dengan object koran
        koran.masuk("koran jawa pos");
        //tumpukan ke 3 koran jawa pos dimasukan kedalam variable data melalui prosedur masuk dengan object koran
        koran.masuk("koran radar tegal");
        //tumpukan ke 4/ terakhir, koran radar tegal dimasukan kedalam variable data melalui prosedur masuk dengan object koran
        koran.masuk("koran fake news ");
        /*koran ini tidak akan dimasukan ke tumpukan koran karena melebihi kapasitas, namun dpt dimasukan 
        dengan mengubah kapasitas tsb*/
         System.out.println("-------------------------------");
         //untuk membuat jarak agar ;ebih rapi
        koran.info();
        //untuk mengeksekusi prosedur info yg akan menampilkan semua tumpukan dari instance variable data
        System.out.println("-------------------------------");
        //untuk membuat jarak agar lebih rapi
        System.out.println("koran Keluar : ");
        //untuk memberitahu user bahwa yg ada dibawah tulisan ini adalah koran yg telah keluar 
        koran.keluar();
        //untuk mengeksekusi prosedur keluar yg akan mengeluarkan data terakhir dari instance variable data
        koran.keluar();
        //untuk mengeksekusi prosedur keluar yg akan mengeluarkan data terakhir dari instance variable data
        koran.keluar();
        //untuk mengeksekusi prosedur keluar yg akan mengeluarkan data terakhir dari instance variable data
        koran.keluar();
        //untuk mengeksekusi prosedur keluar yg akan mengeluarkan data terakhir dari instance variable data
        koran.keluar();
        //untuk mengeksekusi prosedur keluar yg akan mengeluarkan data terakhir dari instance variable data
        System.out.println("-------------------------------");
        //unutuk membuat jarak agar lebih rapi
        koran.info();
        //untuk mengeksekusi prosedur info yg akan menampilkan semua tumpukan terbaru dari instance variable data
        
    }
}
