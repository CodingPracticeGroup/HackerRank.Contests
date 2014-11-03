package ProjectEuler;

import java.util.Scanner;

public class EvenFibonacciNumbers {
  private static long solve(long n) {
    long sum = 0;
    //
    long one = 1;
    long two = 2;
    long three = 3;
    //
    while (two <= n) {
      sum += two;
      //
      one = two + three;
      two = three + one;
      three = one + two;
    }
    //
    return sum;
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
