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
//Ödev java programlama dilinde yazılacaktır.
// Her ödev ayrı sınıfta olacaktır. Değerlendirme işlemi her için önceden yazılmış unit test methodlarından geçirilerek yapılacaktır.
//
//Kısıtlara uymayan durumlarda system exception throw etmeli.

import java.util.Scanner;

public class MergeString {

    public static void main(String[] args) {

        // Aşağıda iki ayrı çözüm bululnuyor. İkisinde de iki string sırasıyla birleştiriliyor.
        // İkisinde de stringler birleştiriliyor fakat
        // problem tanımındaki gibi hrte + aars birleşiminden haratres sonucu alınmıyor.

        Scanner sc = new Scanner(System.in);
        System.out.println("İlk string'i giriniz: ");
        String firstString = sc.next();

        System.out.println("İkinci string'i giriniz: ");
        String secondString = sc.next();

        String merged = firstString + secondString;

        System.out.println("Tek tek merge edilmiş halleri: " + merged);

        // Ayrıca concat edebiliriz iki string'i
        String concatStrings = firstString.concat(secondString);

        System.out.println("Concat versiyonu: " + concatStrings);


    }

}
