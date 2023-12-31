//3.	Alışveriş Sepeti
//        Dışardan parametere olarak integer bir array alınacak. Bu araydeki her bir değer sepetimizdeki ürünleri ifade ediyor.
//        Eğer sepetimdeki üründen sonraki gelen ürünün fiyatı daha düşük ise o ürünün fiyatı kadar indirim uygulanacaktır.
//
//        Örneğin A = {5, 6, 4, 3, 4 }  2. ürün birinci üründen büyük olduğu için birinci ürüne indirim uygulanmaz
//        ama 3. ürün 2. üründen ucuz olduğu için 2. ürüne 4 lira indirim uygulanır. Aynı şekilde 4. ürün 3. üründen ucuz olduğu için
//        3 lira indirim uygulanır. Yani sepetimizdeki ürünlerin indirim uygulandıktan sonraki fiyatları şu şekilde olur: B = { 5, 2, 1, 3, 4 }
//
//        Sonuçlara sizlerden istenen
//        a.	Sepetimizin son tutarının hesaplanması.
//        b.	Sepetimizde indirim uygulanmayan elamanların küçükte büyüğe yazdırılması.
//
//        Örnek çıktı: Toplam tutar: 15,  İndirim yapılmayan kalemler, C = {3, 4, 5}
//
//        Kısıtlar: Arrayimizin boyu  1 < n < 100    arrayimizin elemanları ise 0 < i < 2.000
//
//        Ödev java programlama dilinde yazılacaktır. Her ödev ayrı sınıfta olacaktır.
//        Değerlendirme işlemi her için önceden yazılmış unit test methodlarından geçirilerek yapılacaktır.
//
//        Kısıtlara uymayan durumlarda system exception throw etmeli.

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class AlisverisSepeti {

    public static void main(String[] args) throws Exception {

        // ChatGpt yardımıyla bir sonuca varmaya çalıştım, kendisi doğrudan sonuç vermedi kendi kodumun üstüne biraz yardımla stream ile tamamlama yaptım.
        // Array'e eleman ekleme işlemini de açıkçası ondan öğrendim. Bunu bir önceki soruda kullanabilirim.

//        int[] A = {5, 6, 4, 3, 4};
        /*{ 5, 2, 1, 3, 4 }*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Gireceğiniz array'in kaç değer alacağını belirtin: ");
        int arrLength = sc.nextInt();


        try {
            if (1 < arrLength && arrLength < 100) {

                int[] A = new int[arrLength];

                for (int i = 0; i < arrLength; i++) {

                    System.out.println("Array'deki " + (i + 1) + ". sayıyı giriniz: ");
                    A[i] = sc.nextInt();

                    if (A[i] <= 0 || 2000 <= A[i]) {
                        throw new IndexOutOfBoundsException();
                    }

                }

                int[] B = new int[A.length];
                int[] C = new int[A.length];
                int totalAmount = 0;


                    for (int i = 0; i < A.length; i++) {

                        if (i == 0 && A[i] < A[i + 1]) {
                            B[i] = A[i];
                        } else if (i > 0 && i < A.length - 1 && A[i] < A[i + 1]) {
                            B[i] = A[i];
                        } else if (i < A.length - 1) {
                            B[i] = A[i] - A[i + 1];
                        } else if (i == A.length - 1 && A[i] >= A[i - 1]) {
                            B[i] = A[i];
                        } else if (i == A.length && A[i] < A[i - 1]) {
                            B[i] = A[i - 1] - A[i];
                        }

                    }

                B[B.length - 1] = A[A.length - 1];

                for (int i = 0; i < B.length; i++) {
                    totalAmount += B[i];
                }

                int j = 0;
                for (int i = 0; i < A.length; i++) {

                    if (A[i] == B[i] && A[i] != 0) {
                        C[j] = A[i];
                        j++;
                    }
                }

                Arrays.sort(C);

                int[] D;

                D = IntStream.range(0, C.length)
                        .filter(n -> C[n] != 0)
                        .map(n -> C[n])
                        .toArray();


                System.out.println("İndirim sonucunda bütün ürünler: " + Arrays.toString(B));
                System.out.println("Toplam: " + totalAmount + " Lira");
                System.out.println("İndirimsiz olanlar: " + Arrays.toString(D));

            } else {
                throw new Exception();
            }
        }catch (IndexOutOfBoundsException e) {
            System.out.println("Array elemanları 0 ile 2000 arasında olmalıdır.");
        }catch (Exception exc) {
            System.out.println("Arrayinizin boyu 1 ile 100 arasında olmalıdır.");
        }
    }

}
