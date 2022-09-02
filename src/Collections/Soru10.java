package Collections;

import java.util.*;

public class Soru10 {
    public static void main(String[] args) {
     /*   Bir LinkedList oluşturalım ve ilk eleman ile 4. elemanı yerdeğiştiren java kodunu yazınız.
                LinkedList: mavi,kirmizi,beyaz,siyah,yesil,turuncu
                **hint:  Collections.swap();**
        Beklene Çıktı:
        Orjinal LinkedList: [mavi,kirmizi,beyaz,siyah,yesil,turuncu]
        Swap sonrası durum: [**siyah**,kirmizi,beyaz,**mavi**,yesil,turuncu]
          */
        LinkedList<String> ll=new LinkedList<>(Arrays.asList("mavi","kirmizi","beyaz","siyah","yesil","turuncu"));
        System.out.println(ll);
        Collections.swap(ll,0,3);
        System.out.println(ll);
    }
}
