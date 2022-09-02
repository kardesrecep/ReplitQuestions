package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soru2 {
    public static void main(String[] args) {

       /* Array list oluşturun daha sonra aşağıda belirtilen yerlere yeni array elemanlarını
       ekleyen java kodunu yazınız.
         Array List:  siyah,mavi,kirmizi,beyaz
        en başa: **pembe**
        mavi-kirmizi arasına **yesil**  renk eklenecek.
        Beklenen Çıktı:
[pembe,siyah,mavi,yesil,kirmizi,beyaz]*/

        ArrayList<String>list=new ArrayList<>(Arrays.asList("siyah","mavi","kirmizi","beyaz"));
        list.add(0,"pembe");
        list.add(list.indexOf("kirmizi"),"yesil");

        System.out.println(list);







    }
}
