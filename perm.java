class Main {
  // n!
  public static void main(String[] args) {
    String s = "abcd";
    perm(s, 0, s.length() - 1);

  }

  static void perm(String s, int l, int r)  {
    if (l == r) System.err.println(s);
    else {
      for(int i = l; i <= r; ++i) {
        s = swp(s, l, i);
        perm(s, l + 1, r);
        s = swp(s, l, i);
      }
    }
  }

  static String swp(String s, int i, int j) {
    char[] c = s.toCharArray();
    char tmp = c[i];
    c[i] = c[j];
    c[j] = tmp;
    return String.valueOf(c);
  }
}