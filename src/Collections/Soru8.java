package Collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Soru8 {
    public static void main(String[] args) {
      /*  Bir LinkedList oluşturalım ve ilk ve son elemanlarını iterator özelliğini kullanarak yazdıralım
        LinkedList: sari,mavi,turuncu,siyah,yesil,beyaz
        Beklenen Çıktı:
        Orjinal list elemanlari: [sari,mavi,turuncu,siyah,yesil,beyaz]
        Listenin ilk elemani: sari
        listenin son elemani: beyaz    */
        LinkedList <String> ll=new LinkedList<>(Arrays.asList("sari","mavi","turuncu","siyah","yesil","beyaz"));
        Iterator<String> it= ll.listIterator();
        String str="";
        System.out.println("Orjinal list elemanlari:"+ll);
        System.out.println(" Listenin ilk elemani:"+it.next());

        while (it.hasNext()){
            str= it.next();
        }
        System.out.println(" listenin son elemani:"+str);

    }
}
