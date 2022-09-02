package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soru4 {
    public static void main(String[] args) {
     /*   Bir ArrayList oluşturalım ve istenen sıradaki elemanı güncelleyelim.
        Array Elemanları: sari,yesil,mavi,pembe
        **mavi rengini turuncu ile değiştirelim.**
        Beklene Çıktı:
        [sari,yesil,mavi,pembe]
        [sari,yesil,turuncu,pembe]*/
        List<String> list =new ArrayList<>(Arrays.asList("sari","yesil","mavi","pembe"));
        System.out.println(list);
        list.set(list.indexOf("mavi"), "turuncu");
        System.out.println(list);
    }
}
