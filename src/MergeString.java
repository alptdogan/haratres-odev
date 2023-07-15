// 1.	Merge String
//Fonksiyonumuz string olarak 2 parametre alacak. String a ve String b. Amacımız bu iki stringi tek bir stringte sırasıyla birleştirmek.
//
//Örneğin:
//String a = hrte
//String b = aars
//
//Çıktı: haratres
//
//Kısıtlar
//a ve b nin boyuları 1< a, b < 2500 olmalıdır
//
//Ödev java programlama dilinde yazılacaktır. Her ödev ayrı sınıfta olacaktır. Değerlendirme işlemi her için önceden yazılmış unit test methodlarından geçirilerek yapılacaktır.
//
//Kısıtlara uymayan durumlarda system exception throw etmeli.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeString {

    public static void main(String[] args) {

        String a = "hrte";
        String b = "aars";

        String merged = a + b;

        System.out.println(merged);

    }

}
