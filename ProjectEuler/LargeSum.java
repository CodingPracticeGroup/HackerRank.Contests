package ProjectEuler;

import java.math.BigInteger;
import java.util.Scanner;

public class LargeSum {
  public static void main(String[] args) {
    /*
     * Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be
     * named Solution.
     */
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    BigInteger sum = BigInteger.ZERO;
    for (int i = 0; i < N; i++) {
      String s = in.next();
      sum = sum.add(new BigInteger(s));

    }
    in.close();
    System.out.println(sum.toString().substring(0, 10));
  }
}
