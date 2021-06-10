package remidi_m_fauzi_maksum;
//untuk membuat package semseter 2 yg digunakan sebagai wadah project yg akan kita buat
import java.util.*; 
//untuk mengimport fungtion linked list 
public class linked_list { 
//untuk membuat class untuk menentukan program java jadi program java ini berada di class linked_list
    public static void main(String args[]) 
    { /*untuk membuat method dengan nama main, yg dojadikan method utama untuk mengeksekusinsebuah program java, tanpa ada ini tidak akan 
mengeluarkan apa-apa*/
        LinkedList<String> pelangi  = new LinkedList<String>(); /*untuk membuat objek pelangi sevagai wadah \
        elemen lemen yg akan kita masukan yg bertipe data string*/
  
        pelangi.add("jingga"); //menambahkan elemen value string merah di objek prlangi
        pelangi.add("hijau"); //menambahkan value string jingga di objek pelangi
        pelangi.addLast("biru"); /*menambahkan value pertama String merah  dan urutan value lainnya 
        akan mengikuti di objek pelangi*/
        pelangi.addFirst("merah"); /*menambahkan value String merah di terakhir dan urutan value lainnya 
        akan mengikuti tulisan a di objek pelangi*/
        pelangi.add(2, "kuning"); //menambahkan value String kuning di value ke 2 di objek pelangi
        pelangi.add("nila");/*menambahkan value string nila di objek pelangi. karena sintax ini setelah 
        sintax addLast maka value nila akan ditambahkan setelah sintax tersebut*/
        pelangi.add("ungu");/*menambahkan value String ungu di terakhir dan urutan value lainnya 
        akan mengikuti tulisan a di objek pelangi*/
  
        System.out.println(pelangi); //untuk menampilkan data
        System.out.println("----------------------------");//untuk memisahkan antara data lama dan baru
        pelangi.remove("biru"); //untuk menghapus value string biru
        pelangi.remove(3); //untuk menghapus value element ke 3. yg berarti hijau karena data pertama selalu diawali 0
        pelangi.removeFirst(); //untuk menghapus value pertama
        pelangi.removeLast(); //untuk menghapus value terakhir
  
        System.out.println(pelangi); //untuk menampilkan data 
        System.out.println("----------------------------");//untuk memisahkan antara data lama dan baru
    } 
} 