package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soru3 {
    public static void main(String[] args) {

       /* Bir ArrayList oluşturalım ve birinci ve üçüncü elemanlarını yazdıralım.
              ArrayList elemanları:  beyaz,siyah,sari,kirmizi,turuncu
                Beklenen Çıktı:
                Arrayin 1. elemani: beyaz
                Arrayin 3. elemani: sari*/
        List<String> list=new ArrayList<>(Arrays.asList("beyaz","siyah","sari","kirmizi","turuncu"));
        System.out.println(" Arrayin 1. elemani:"+list.get(0));
        System.out.println("Arrayin 3. elemani: "+list.get(2));
    }
}
