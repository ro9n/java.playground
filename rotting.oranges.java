import java.util.*;

class Solution {
  int dx[] = { -1, 1, 0, 0 }, dy[] = { 0, 0, -1, 1 };

  public int orangesRotting(int[][] grid) {
    Queue<List<Integer>> q = new LinkedList<>();
    int n = grid.length, m = grid[0].length;
    int max = 0;

    for (int i = 0; i < n; ++i) {
      for (int j = 0; j < m; ++j) {
        if (grid[i][j] == 2)
          q.offer(List.of(i, j, 0));
      }
    }

    while (q.size() > 0) {
      var front = q.poll();
      max = Math.max(max, front.get(2));
      for (int d = 0; d < 4; ++d) {
        int y = front.get(0) + dy[d], x = front.get(1) + dx[d];

        if (y < 0 || y >= n || x < 0 || x >= m || grid[y][x] != 1)
          continue;
        grid[y][x] = 0;
        q.offer(List.of(y, x, 1 + front.get(2)));
      }
    }

    for (int i = 0; i < n; ++i) {
      for (int j = 0; j < m; ++j) {
        if (grid[i][j] == 1)
          return -1;
      }
    }

    return max;
  }
}