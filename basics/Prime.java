public class Prime {

  public static boolean isPrime(int n) {
    if (n <= 1) return false;
    for (int i = 2; i <= Math.sqrt(n); i++) if (n % i == 0) return false;
    return true;
  }

  public static void main(String args[]) {
    int count = 0;
    boolean isPrime;

    for (int i = 10; i < 50; i++) {
      if (isPrime(i)) {
        count++;
        System.out.println(i + " is prime number");
        if (count == 10) {
            System.out.println("exiting...");
            break;
        }
      }
    }
  }
}
