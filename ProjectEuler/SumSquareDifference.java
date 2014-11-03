package ProjectEuler;

import java.util.Scanner;

public class SumSquareDifference {
  private static long solve(long n) {
    long sum = 0;
    for (long i = 1; i < n; i++) {
      sum += i * ((i + 1) + n) * (n - (i)) / 2;
    }
    return 2 * sum;
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
