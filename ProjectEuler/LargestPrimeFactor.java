package ProjectEuler;

import java.util.Scanner;

public class LargestPrimeFactor {
  private static long solve(long n) {
    while (n % 2 == 0) {
      n /= 2;
    }
    long largep = 0;
    long sqrt = (long) Math.sqrt(n);
    for (long i = 3; i <= sqrt; i += 2) {
      while (n % i == 0) {
        largep = i;
        n /= i;
      }
    }
    if (n == 1) {
      return largep;
    } else {
      return n;
    }
  }

  public static void main(String[] args) {
    /*
     * Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be
     * named Solution.
     */
    Scanner in = new Scanner(System.in);
    int T;
    T = in.nextInt();
    for (int i = 0; i < T; i++) {
      long N;
      N = in.nextLong();
      long sum;
      sum = solve(N);
      System.out.println(sum);
    }
    in.close();
  }
}
