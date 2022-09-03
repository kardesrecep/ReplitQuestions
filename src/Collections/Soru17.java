package Collections;

import java.util.Arrays;
import java.util.TreeSet;

public class Soru17 {
    public static void main(String[] args) {
 /* Ortak elemanları olan 2 farklı TreeSet oluşturalım ve elemanlarını tektek karşılaştırıp aynı olanlar için "yes"
 farklı olanlar için "no" yazdıralım.
        1. TreeSet: mavi,yesil,kirmizi,sari
        2. TreeSet: yesil,mavi,pembe,turuncu
        Beklenen Çıktı:
        1. TreeSet: [kirmizi,mavi,sari,yesil]
        2. TreeSet: [mavi,pembe,turuncu,yesil
        Karsilastirma Sonucu:
        no
        yes
        no
        yes
        */
        TreeSet<String>tss1=new TreeSet<>(Arrays.asList("mavi","yesil","kirmizi","sari"));
        TreeSet<String>tss2=new TreeSet<>(Arrays.asList("yesil","mavi","pembe","turuncu"));
        System.out.println("1. TreeSet:"+tss1);
        System.out.println("2. TreeSet:"+tss2);
        System.out.println("Karsilastirma Sonucu:");
        for (String w:tss1) {
            if (tss2.contains(w)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }

        }


    }
}
