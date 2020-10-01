import java.util.*;

class Main {
  public static void main(final String[] argv) {
    final ArrayList<Integer> random = new ArrayList<>(); // for faster access and
    // insertion
    final LinkedList<Integer> doubly = new LinkedList<>(); // for faster update

    doubly.offerLast(1); // push_back
    doubly.offerLast(2);
    doubly.offerFirst(3); // push_front
    doubly.offerFirst(4);

    // last - - - first
    // back - - - front
    for (int e : doubly)
      System.err.println(e);

    // poll = pollFirst = pop_front
    while (doubly.size() > 0)
      System.err.println(doubly.poll());

    ArrayList<Integer> randomWithSize = new ArrayList<>(5);
    randomWithSize.add(0);
    randomWithSize.add(1);
    randomWithSize.add(2);
    randomWithSize.add(3);
    randomWithSize.add(4);
    randomWithSize.add(5);
    randomWithSize.add(6);
    randomWithSize.set(2, -2);

    for (var e : randomWithSize)
      System.err.println(e);

    Collections.sort(randomWithSize);

    for (var e : randomWithSize)
      System.err.println(e);

    Collections.sort(randomWithSize, Collections.reverseOrder());
    Collections.reverse(randomWithSize);

    for (var e : randomWithSize)
      System.err.println(e);
  }
}