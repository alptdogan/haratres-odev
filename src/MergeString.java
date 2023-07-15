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

    public static void main(String[] args) throws Exception {

        // Aşağıda iki ayrı çözüm bululnuyor. İkisinde de iki string sırasıyla birleştiriliyor.
        //  Fakat problem tanımındaki gibi hrte + aars birleşiminden haratres sonucu alınmıyor.
        // Şimdilik 2500 sınırını sağlayamadım. Döneceğim.

        Scanner sc = new Scanner(System.in);
        System.out.println("İlk string'i giriniz: ");
        String firstString = sc.nextLine();

        System.out.println("İkinci string'i giriniz: ");
        String secondString = sc.nextLine();

        String noSpacesFirst = firstString.replaceAll(" ", "").trim();
        String noSpacesSecond = secondString.replaceAll(" ", "").trim();

        if (1 < firstString.length() && secondString.length() < 2500) {

                String merged = noSpacesFirst + noSpacesSecond;

                System.out.println("Tek tek merge edilmiş halleri: " + merged);

                // Ayrıca concat edebiliriz iki string'i
                String concatStrings = noSpacesFirst.concat(noSpacesSecond);

                System.out.println("Concat versiyonu: " + concatStrings);

        }else {
                throw new Exception("En az 2 en fazla 2499 karakterli bir string girmelisiniz!");
        }

    }

}
