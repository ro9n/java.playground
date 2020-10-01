import java.util.ArrayDeque;
import java.util.Deque;

class Main {
  public static void main(String[] args) {
    Deque<Integer> dq = new ArrayDeque<>();
    dq.offerFirst(2);
    dq.offerLast(1);

    while(!dq.isEmpty()) {
      System.err.println(dq.pollLast());
    }
  }
}