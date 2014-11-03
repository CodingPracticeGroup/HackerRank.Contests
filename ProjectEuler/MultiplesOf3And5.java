package ProjectEuler;

import java.util.Scanner;

public class MultiplesOf3And5 {
  private static long solve(long n) {
    long moxiang3 = (n / 3) * 3;
    long xiangshu3 = n / 3;
    long sum3 = (3 + moxiang3) * xiangshu3 / 2;
    //
    long moxiang5 = (n / 5) * 5;
    long xiangshu5 = n / 5;
    long sum5 = (5 + moxiang5) * xiangshu5 / 2;
    //
    long moxiang15 = (n / 15) * 15;
    long xiangshu15 = n / 15;
    long sum15 = (15 + moxiang15) * xiangshu15 / 2;
    //
    return sum3 - sum15 + sum5;
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
      long _b;
      _b = in.nextInt();
      long sum;
      sum = solve(_b - 1);
      System.out.println(sum);
    }

    in.close();
  }
}
