package Collections;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Soru18 {
    public static void main(String[] args) {
       /* Bir Priority Queue  oluşruralım, elemanlarını ekleyelim priority queue yazdıralım.
        priority queue elemanları: sari,yesil,mavi,kirmizi
        Beklenen Çıktı:
        Priority Queue elemanlari: [kirmizi, mavi, sari, yesil]  */

        Queue<String> prq=new PriorityQueue<>(Arrays.asList("mavi","kirmizi","sari","yesil"));
        System.out.println(prq);

    }
}
