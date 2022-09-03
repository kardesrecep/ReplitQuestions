package Collections;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Soru13 {
    public static void main(String[] args) {
       /* Bir TreeSet oluşturalım ve tüm elemanlatını tektek yazdıralım.
        TreeSet elemanları: yesil,mavi,kirmizi,sari,beyaz,siyah
        Beklenen Çıktı:
        beyaz
        kirmizi
        mavi
        sari
        siyah
        yesil*/
        TreeSet<String> sl= new TreeSet<>(Arrays.asList("yesil","mavi","kirmizi","sari","beyaz","siyah"));
        for (String w:sl) {
            System.out.println(w);
        }
    }
}
