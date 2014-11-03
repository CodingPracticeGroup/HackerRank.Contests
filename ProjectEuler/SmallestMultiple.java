package ProjectEuler;

import java.util.HashMap;
import java.util.Scanner;

public class SmallestMultiple {
  private static HashMap<Integer, Integer> fenjiezhiyinshu(int n) {
    HashMap<Integer, Integer> ret = new HashMap<Integer, Integer>();
    for (int i = 2; i <= n; i++) {
      int count = 0;
      while (n % i == 0) {
        n = n / i;
        count++;
      }
      ret.put(i, count);
    }
    return ret;
  }

  private static long solve(long n) {
    HashMap<Integer, Integer> track = new HashMap<Integer, Integer>();
    for (int i = 2; i <= n; i++) {
      HashMap<Integer, Integer> jiaoji = fenjiezhiyinshu(i);
      jiaoji.keySet().retainAll(track.keySet());
      for (Integer j : jiaoji.keySet()) {
        track.put(j, Math.max(track.get(j), jiaoji.get(j)));
      }
      HashMap<Integer, Integer> cha = fenjiezhiyinshu(i);
      cha.keySet().removeAll(track.keySet());
      for (Integer j : cha.keySet()) {
        track.put(j, cha.get(j));
      }
    }
    double ret = 1;
    for (Integer i : track.keySet()) {
      ret *= Math.pow(i, track.get(i));
    }
    return (long) ret;
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
