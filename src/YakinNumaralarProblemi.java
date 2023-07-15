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

import java.util.Arrays;

public class YakinNumaralarProblemi {

    public static void main(String[] args) {

        // elle 2'ye sınırladım fakat diğer array'de çalışmayacak. başka bir değişkene setlemem lazım

        int[] arr = {3, 1, 5, 23, 2, 4, 9, 10, 15, 31};
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {

            int diff = Math.abs(arr[i + 1] - arr[i]);

            if (diff < 2) {
                System.out.println(arr[i] + " " + arr[i + 1]);
            }

        }

    }


}
