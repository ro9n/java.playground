import java.util.*;
import java.util.stream.Collectors;

class Main {
  public static void main(String[] argv) {
    String s = "the the quick brown fox";
    List<Character> letters = s.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
    Collections.sort(letters);

    // System.err.println(s.substring(4, 4 + 5));
    // for (var c : letters)
    // System.err.println(c);

    var z = zf(s);
    for (var k : z)
      System.err.print(k);
  }

  static int[] zf(String s) {
    int n = s.length(), z[] = new int[n];

    for (int i = 1, l = 0, r = 0; i < n; ++i) {
      if (i <= r)
        z[i] = Math.min(r - i + 1, z[i - l]);
      while (i + z[i] < n && s.charAt(z[i]) == s.charAt(i + z[i]))
        ++z[i];
      if (i + z[i] - 1 > r) {
        l = 0; r = i + z[i] - 1;
      }
    }

    return z;
  }
}