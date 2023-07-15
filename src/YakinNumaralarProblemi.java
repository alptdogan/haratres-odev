//2.	Yakın Numaralar Problemi
//        Dışardan parametre olarak integer sayılardan oluşan bir array alacağız.
//        Bu array içerisindeki mutlak olarak en yakın sayıları tespit etmemiz
//        ve sıralı şekilde yazdırmamız gerekiyor farkımız 0 dan büyük olmalı.
//
//        Örneğin: Parametre olarak A= { 3, 1, 5, 23, 2, 4, 9, 10, 15, 31 }  min fark = |2-1| = 1
//        veya |5-4| = 1 demek oluyor bizim arrayimizdeki yakınlık seviyemiz minum 1 o zaman uygulamamızın çıktısı şu şekilde olmalı
//
//        1 2
//        2 3
//        3 4
//        4 5
//        9 10
//
//        Eğer listemiz B = { 32, 41, 12 , 15, 21, 32, 48, 35} şekilde olsaydı mutlak en küçük farkımız: |12 - 15| = 3
//
//        Çıktımız: String array olarak : D = {"12 15", "32 35"} şeklinde olmalı.
//
//        Kısıtlar: Arrayimizin boyu  1 < n < 1000    arrayimizin elemanları ise -20.000 < i < 20.000
//
//        Ödev java programlama dilinde yazılacaktır. Her ödev ayrı sınıfta olacaktır.
//        Değerlendirme işlemi her için önceden yazılmış unit test methodlarından geçirilerek yapılacaktır.
//
//        Kısıtlara uymayan durumlarda system exception throw etmeli.

import java.util.*;

public class YakinNumaralarProblemi {

    public static void main(String[] args) {

        // Scanner ile alarak testleri geçer mi bilmiyorum, dışarıdan alınacak array metot tanımında olmalı aslında.
        // İlk soruyu çözdüğüm şekilde Scanner ile devam ediyorum şimdilik.

        Scanner sc = new Scanner(System.in);
        System.out.println("Gireceğiniz array'in uzunluğunu belirtin: ");
        int arrSize = sc.nextInt();

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arrSize; i++) {
            System.out.println("Array'deki sıradaki sayıyı giriniz: ");
            int input = sc.nextInt();

            arr.add(input);
        }

        Collections.sort(arr);
        int minDiff = Integer.MAX_VALUE;

        System.out.println("Sonuç: ");

        for (int i = 0; i < arr.size() - 1; i++) {

            int diff = Math.abs(arr.get(i + 1) - arr.get(i));

            if (diff == minDiff) { ;
                System.out.println(arr.get(i) + " " + arr.get(i + 1));
            }else  if (diff < minDiff) {
                minDiff = diff;
                System.out.println(arr.get(i) + " " + arr.get(i + 1));
            }

        }

    }


}
