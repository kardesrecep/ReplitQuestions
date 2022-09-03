package Collections;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Soru15 {
    public static void main(String[] args) {
        /*Bir TreeSet oluşturalım ve ilk ve son elemanlarını yazdıralım.
        TreeSet elemanları: sari,mavi,yesil,kirmizi,turuncu,pembe
        Beklenen Çıktı:
        Orjinal Tree: [kirmizi,mavi,pembe,sari,turuncu,yesil]
        ilk elemen: kirmizi
        son eleman: yesil
        */
        TreeSet<String>st=new TreeSet<>(Arrays.asList("sari","mavi","yesil","kirmizi","turuncu","pembe"));
        System.out.println("Orjinal Tree:"+st);
        System.out.println("ilk eleman:"+st.first());
        System.out.println("son eleman:"+st.last());
    }
}
