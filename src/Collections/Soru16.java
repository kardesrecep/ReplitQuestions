package Collections;

import java.util.Arrays;
import java.util.TreeSet;

public class Soru16 {
    public static void main(String[] args) {
       /*Bir TreeSet oluşturalım ve Tree Listesini ve listedeki eleman sayısını yazdıran java kodunu yazdıralım.
        TreeSet elemanları: yesil,sari,mavi,kirmizi,pembe
        Beklenen Çıktı:
        Orjinal TreeSet: [kirmizi,mavi,pembe,sari,yesil]
        TreeSet eleman sayısı: 5
        */
        TreeSet<String>tss=new TreeSet<>(Arrays.asList("yesil","sari","mavi","kirmizi","pembe"));
        System.out.println("Orjinal TreeSet:"+tss);
        System.out.println("TreeSet eleman sayisi:"+tss.size());
        //System.out.println("TreeSet eleman sayisi:"+tss.stream().count());
    }
}
