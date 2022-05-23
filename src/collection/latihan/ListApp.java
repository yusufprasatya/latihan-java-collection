package collection.latihan;

import java.util.ArrayList;
import java.util.List;

public class ListApp {

    public static void main(String[] args) {

        /**
         * - List adalah struktur data collection yang memiliki sifat sebagai berikut
         *     - Elemen pada list dapat duplikat, artinya bisa menyimpan data yang sama.
         *     - Data pada list selalu terurut sesuai dengan posisi pada saat kita memasukkan data.
         *     - List memiliki index, sehingga kita bisa menggunakan nomor index untuk mendapatkan elemen di List.
         * - Di Java ada beberapa implementasi dari List, dapat disesuaikan dengan kebutuhan kita
         */

        List<String> hewan = new ArrayList<>();

        hewan.add("Anjing");
        hewan.addAll(List.of("Kucing", "monyet"));
        hewan.set(0,"Kura-Kura");
        hewan.remove(1);

        System.out.println(hewan.get(0));

        for (String hewans: hewan
             ) {
            System.out.println(hewans);

        }

    }

}
