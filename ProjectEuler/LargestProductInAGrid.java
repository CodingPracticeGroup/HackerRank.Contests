package ProjectEuler;

import java.util.Scanner;

public class LargestProductInAGrid {
  private static long solve(int matrix[][]) {
    long max = 0;
    // rows
    for (int i = 0; i < 20; i++) {
      for (int j = 0; j + 3 < 20; j++) {
        max = Math.max(max, matrix[i][j] * matrix[i][j + 1] * matrix[i][j + 2] * matrix[i][j + 3]);
      }
    }
    // cols
    for (int i = 0; i < 20; i++) {
      for (int j = 0; j + 3 < 20; j++) {
        max = Math.max(max, matrix[j][i] * matrix[j + 1][i] * matrix[j + 2][i] * matrix[j + 3][i]);
      }
    }
    // \
    for (int i = 0; i + 3 < 20; i++) {
      for (int j = 0; j + 3 < 20; j++) {
        max =
            Math.max(max, matrix[i][j] * matrix[i + 1][j + 1] * matrix[i + 2][j + 2]
                * matrix[i + 3][j + 3]);
      }
    }
    // /
    for (int i = 3; i < 20; i++) {
      for (int j = 0; j + 3 < 20; j++) {
        max =
            Math.max(max, matrix[i][j] * matrix[i - 1][j + 1] * matrix[i - 2][j + 2]
                * matrix[i - 3][j + 3]);
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
    int matrix[][] = new int[20][20];
    for (int i = 0; i < 20; i++) {
      for (int j = 0; j < 20; j++) {
        matrix[i][j] = in.nextInt();
      }
    }
    long ret;
    ret = solve(matrix);
    System.out.println(ret);
    in.close();
  }
}
