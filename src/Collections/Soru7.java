package Collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Soru7 {
    public static void main(String[] args) {
       /* Bir LinkedList oluşturalım ve Iterator methodunu kullanarak listedeki elemanlardan istenilen
        pozisyondan başlayarak listeyi yazdıralım.
        LinkedList elemanlari: sari,beyaz,mavi,yesil,turuncu
        1. elemandan itibaren yazdıralım.
           Beklenen Çıktı:
        beyaz
        mavi
        yesil
        turuncu  */
        LinkedList <String>ll=new LinkedList<>(Arrays.asList("sari","beyaz","mavi","yesil","turuncu"));
        Iterator<String>it= ll.listIterator(1);
//it.next();==> yukari satirda iterator icinde 1 indexini kullanmazsak bu sekilde kullanabiliriz.
        while(it.hasNext()){
            System.out.println(it.next());
        }






    }
}
