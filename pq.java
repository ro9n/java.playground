import java.util.*;

class Main {
  public static void main(String[] args) {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    minHeap.offer(3);
    minHeap.offer(2);
    minHeap.offer(1);

    // while (minHeap.size() > 0)
    //   System.err.println(minHeap.poll());

    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
    maxHeap.offer(1);
    maxHeap.offer(2);
    maxHeap.offer(3);

    // while (maxHeap.size() > 0)
    //   System.err.println(maxHeap.poll());

    PriorityQueue<Integer> customHeap = new PriorityQueue<>(new Comparator<Integer>() {
      @Override
      public int compare(Integer a, Integer b) {
        // Compares its two arguments for order. Returns a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second.
        // 1: a > b 0: a == b -1: a < b
        // evens lex, odds lex
        if ((a & 1) == (b & 1)) return a.compareTo(b);
        else if ((a & 1) == 1) return 1;
        else return -1;
      }
    });
    customHeap.offer(1);
    customHeap.offer(2);
    customHeap.offer(3);
    customHeap.offer(4);
    customHeap.offer(5);

    while (customHeap.size() > 0)
      System.err.print(customHeap.poll());
  }
}
