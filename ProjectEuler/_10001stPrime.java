package ProjectEuler;

import java.util.BitSet;
import java.util.Scanner;

public class _10001stPrime {
  public static void main(String[] args) {
    /*
     * Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be
     * named Solution.
     */
    // 10001st prime is 104743
    int limit = 104743 + 1;
    BitSet bs = new BitSet(limit);
    bs.clear();
    for (int i = 2; i < limit; i++) {
      if (!bs.get(i)) {
        for (int j = i * 2; j < limit; j += i) {
          bs.set(j);
        }
      }
    }
    Scanner in = new Scanner(System.in);
    int T;
    T = in.nextInt();
    for (int i = 0; i < T; i++) {
      long N;
      N = in.nextLong();
      //
      int count = 0;
      int j = 0;
      for (j = 2; j < limit; j++) {
        if (!bs.get(j)) {
          count++;
          if (count == N) {
            break;
          }
        }
      }
      //
      System.out.println(j);
    }
    in.close();
  }
}
