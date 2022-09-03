package Collections;

import java.util.ArrayList;
import java.util.List;

public class Soru5 {
    public static void main(String[] args) {
     /*   Bir ArrayList oluşturalim ve önce ArrayListi yazdıralım sonra index numarasına göre tek tek yazdıralım.
        ArrayList: siyah,mavi, kirmizi,yesil,mor,turuncu
        Beklenen Çıktı:
        Orjinal array list: [siyah,mavi,kirmizi,yesil,mor,turuncu]
        siyah mavi
        kirmizi yesil
        mor turuncu*/
        List<String> list = new ArrayList<>();
        list.add("siyah");
        list.add("mavi");
        list.add("kirmizi");
        list.add("yesil");
        list.add("mor");
        list.add("turuncu");
        System.out.println("Orjinal array list:"+list);
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));

        }


    }
}
