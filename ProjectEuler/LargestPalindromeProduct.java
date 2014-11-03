package ProjectEuler;

import java.util.Scanner;

public class LargestPalindromeProduct {
  private static boolean isPalindrome(int n) {
    return new StringBuilder(String.valueOf(n)).reverse().toString().equals(String.valueOf(n));
  }

  private static long solve(long n) {
    long max = 0;
    // abccba = a*100 000 + b*10 000 + c*1 000 + c*100 + b*10 + a*1
    // = a*100 001 + b*10 010 + c*1 100 = 11*() = mn
    for (int i = 110; i <= 999; i += 11) {
      for (int j = 100; j <= 999; j++) {
        if (i * j < n && isPalindrome(i * j)) {
          max = Math.max(max, i * j);
        }
      }
    }
    //
    return max;
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
