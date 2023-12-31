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

    public static void main(String[] args) throws Exception {

        // Scanner ile alarak testleri geçer mi bilmiyorum, dışarıdan alınacak array metot tanımında olmalı aslında.
        // İlk soruyu çözdüğüm şekilde Scanner ile devam ediyorum şimdilik.
        // 20000 sınırları koydum fakat dahil etmediğim halde dahil gibi döbüş alıyorum. +-20001 verdiğimde hata geliyor ama +-20000'de de vermeliydi.

        Scanner sc = new Scanner(System.in);

        System.out.println("Gireceğiniz array'in kaç değer alacağını belirtin: ");
        int arrSize = sc.nextInt();

        try {
            if (arrSize > 1 && 1000 > arrSize) {

                List<Integer> arr = new ArrayList<>();

                for (int i = 0; i < arrSize; i++) {
                    System.out.println("Array'deki " + (i + 1) + ". sayıyı giriniz: ");
                    int input = sc.nextInt();

                    arr.add(input);

                    if (-20000 > arr.get(i) || arr.get(i) > 20000) {
                        throw new IndexOutOfBoundsException();
                    }
                }

                Collections.sort(arr);
                int minDiff = Integer.MAX_VALUE;
                int diff = Integer.MAX_VALUE;
                int currentDiff;

                boolean areAllValuesTheSame = true;

                    for (int i = 0; i < arr.size() - 1; i++) {

                        currentDiff = Math.abs(arr.get(i + 1) - arr.get(i));

                        if (currentDiff > 0 && currentDiff < diff) {
                            diff = currentDiff;
                            minDiff = currentDiff;
                        } else if (currentDiff > 0 && currentDiff == diff) {
                            minDiff = currentDiff;
                        }
//                        Aşağıda yorumdaki condition yüzünden herhangi iki değeri eşit olduğunda farklı değerler arası farkları hesaplamadan exc fırlatıyordu.
//                        Tüm değerler eşit olmadıkça throw etmemesi için yukarıdaki boolean değişkeni tanımlayıp for döngüsünün dışında kontrol etmesini sağladım.
//                        } else if (currentDiff <= 0) {
//                            throw new Exception();
//                        }

                        if (!arr.get(i).equals(arr.get(i + 1))) {
                            areAllValuesTheSame = false;
                        }

                    }
//                    Hatayı artık burada ve gerektiğinde fırlatıyor:
                if (areAllValuesTheSame == true) {
                    throw new Exception();
                }

                for (int j = 0; j < arr.size() - 1; j++) {
                    if (Math.abs(arr.get(j + 1) - arr.get(j)) == minDiff) {
                        System.out.println(arr.get(j) + " " + arr.get(j + 1));
                    }
                }

            } else {
                throw new RuntimeException();
            }
        } catch (IndexOutOfBoundsException outOfBoundsExc) {
            System.out.println("-_-_- BOOOMMM!! BU BİR HATA MESAJIDIR! Hatanız: \n Değerleriniz en az -19.999, en fazla 19.999 olabilir. -_-_-");
        } catch (RuntimeException rExc) {
            System.out.println("-_-_- BOOOMMM!! BU BİR HATA MESAJIDIR! Hatanız: \n  Array en az 2, en fazla 999 değer alabilir. -_-_-");
        }catch (Exception exc) {
            System.out.println("-_-_- BOOOMMM!! BU BİR HATA MESAJIDIR! Hatanız: \n  Herhangi iki değer arasındaki fark 0'dan büyük olmalı. Tüm değerler aynı olamaz. -_-_-");
        }

    }

}
