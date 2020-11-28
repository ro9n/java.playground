class Version {
  private int release, revision, patch;

  Version(int release, int revision, int patch) {
    this.release = release;
    this.revision = revision;
    this.patch = patch;
  }

  @Override public String toString() {
    return "(" + release + "." + revision + "." + patch + ")";
  }

  @Override public int hashCode() {
    int h = 1;
    h *= 31; h += this.release;
    h *= 31; h += this.revision;
    h *= 31; h += this.patch;
    return h;
  }
}

class Main {
  public static void main(String[] args) {
    Version a = new Version(1, 0, 0), b = new Version(1, 0, 0);
    System.out.println(a.toString());
    System.out.println(a.hashCode());
    System.out.println(b.toString());
    System.out.println(b.hashCode());
    System.out.println(a == b);
    System.out.println((2 ^ 1) == 3);
    System.out.println(a.equals(b));
  }
}
