package ProjectEuler;

import java.util.Scanner;

public class LargestProductInASeries {
  private static long solve(int N, int K, char[] s) throws Exception {
    long tmp = 1;
    long max = 1;
    for (int i = 0; i < K; i++) {
      tmp *= s[i] - '0';
    }
    max = tmp;
    for (int i = K; i < N; i++) {
      if (s[i - K] == '0') {
        tmp = 1;
        for (int j = i - K + 1; j <= i; j++) {
          tmp *= s[j] - '0';
        }
      } else {
        tmp /= s[i - K] - '0';
        tmp *= s[i] - '0';
      }
      max = Math.max(max, tmp);
    }
    return max;
  }

  public static void main(String[] args) throws Exception {
    /*
     * Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be
     * named Solution.
     */
    Scanner in = new Scanner(System.in);
    int T;
    T = in.nextInt();
    for (int i = 0; i < T; i++) {
      int N;
      N = in.nextInt();
      int K;
      K = in.nextInt();
      String s = in.next();
      long ret;
      ret = solve(N, K, s.toCharArray());
      System.out.println(ret);
    }
    in.close();
  }
}
