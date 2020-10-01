import java.util.*;

class Main {
  public static void main(String[] args) {
    Map<String, String> capitals = new HashMap<>();
    capitals.put("Norway", "Oslo");

    System.err.println(capitals.getOrDefault("Bangladesh", "Hozrot Seikh Hentai"));

    TreeSet<Integer> s = new TreeSet<>();
    s.add(10);
    s.add(20);
    s.add(30);
    s.add(31);

    // Isn't TreeSet.floor() and TreeSet.ceiling() what you're asking for?Or,
    // alternatively, higher() and lower(), if you wish to exclude equality.
    System.err.println(s.higher(30));
    System.err.println(s.lower(30));
  }
}