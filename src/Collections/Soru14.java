package Collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class Soru14 {
    public static void main(String[] args) {
      /*  Bir TreeSet yapalım ve elemanlarını önce normal yazdıralım ve ardından  descendingIterator()
       fonksiyonunu kullanarak ters sıradan yazdıralım.
         TreeSet elemanları:  yesil,sari,mavi,turuncu,kirmizi
        Beklenen Çıktı:
        Orjinal Tree sonucu: [kirmizi,mavi,sari,turuncu,yesil]
        Tersten Siralanisi:
        yesil
        turuncu
        sari
        mavi
        kirmizi
        */
        TreeSet<String> tsl=new TreeSet<>(Arrays.asList("yesil","sari","mavi","turuncu","kirmizi"));
        System.out.println("Orjinal Tree sonucu:"+tsl);
        Iterator<String> it=tsl.descendingIterator();
        System.out.println("Tersten Siralanisi:");
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
