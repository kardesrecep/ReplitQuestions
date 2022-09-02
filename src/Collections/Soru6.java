package Collections;

import java.util.Arrays;
import java.util.LinkedList;

public class Soru6 {
    public static void main(String[] args) {


       /* Bir likedList oluşturalım ve tüm elemanlarını tek tek yazdıralım.
          LinkedList elemanları: sari,mavi,mor,yesil,beyaz
        Beklenen Çıktı:
         sari
         mavi
         mor
         yesil
         beyaz   */
        LinkedList<String> ll = new LinkedList<>(Arrays.asList("sari", "mavi", "mor", "yesil", "beyaz"));
        for (String w : ll) {
            System.out.println(w);
        }
    }

}


