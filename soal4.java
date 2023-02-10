import java.util.Scanner;

public class soal4 {
  public static void main(String[] args) {
    int[] arr = new int[4];
    int total = 0, nilai_terbesar = 0;
    
    System.out.println("Tampilkan 5 Data");
    System.out.println("=====================");
    
    try (Scanner input = new Scanner(System.in)) {
      for (int x = 0; x < arr.length; x++) {
        System.out.print("Data ke-" + (x + 1) + " \t  = ");
        arr[x] = input.nextInt();
      }
    }

    System.out.println("=====================");

    for (int x = 0; x < arr.length; x++) {
      total += arr[x];

      nilai_terbesar = arr[0];

      if (arr[x] > nilai_terbesar) {
        nilai_terbesar = arr[x];
      }
    }

    System.out.println("Total seluruhnya  = " + total);
    System.out.println("Rata-rata  \t  = " + total / arr.length);
    System.out.println("Nilai terbesar \t  = " + nilai_terbesar);
    System.out.println("=====================");
  }
}
