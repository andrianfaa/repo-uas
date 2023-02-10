public class soal3 {
  public static void main(String[] args) {
    System.out.println("x\ty\tz");
    System.out.println("=================");

    for (int z = 1; z <= 2; z++) {
      for (int x = 1; x <= 2; x++) {
        for (int y = 1; y <= 3; y++) {
          System.out.println(x + "\t" + y + "\t" + z);
        }
      }
    }
  }
}
