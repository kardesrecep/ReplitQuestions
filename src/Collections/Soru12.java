package Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Soru12 {
    public static void main(String[] args) {
       /* Bir HashSet oluşturalım ve HashSet elemanlarını TreeSet e dönüştürelim. Tree Set elemanlarını tektek yazdıralım.
        HashSet elemanları: sari,mavi,yesil,turuncu,kirmizi
        Beklenen Çıktı:
        Tree Set Elemanlari:
        kirmizi
        mavi
        sari
        turuncu
        yesil   */
        Set<String> st=new HashSet<>(Arrays.asList("sari","mavi","yesil","turuncu","kirmizi"));
        System.out.println("Tree Set Elemanlari:");
        Set<String> fb=new TreeSet<>(st);
        fb.stream().forEach(System.out::println);


    }
}
