/**
 * @file pq
 * @author Touhid Alam <taz.touhid@gmail.com>
 *
 * @date Monday September 28 2020
 *
 * @brief
 */

#include <bits/stdc++.h>

using namespace std;

bool custom(int a, int b) {
  if ((a & 1) == (b & 1))
    return a > b;
  else
    return a & 1;
}

int main() {
  priority_queue<int, vector<int>, function<int(int, int)>> pq(custom);
  pq.push(1);
  pq.push(2);
  pq.push(3);
  pq.push(4);
  pq.push(5);

  while (!pq.empty()) {
    cout << pq.top();
    pq.pop();
  }

  int x[] = {1, 2, 3, 4, 5};
  sort(x, x + 5, custom);

  cerr << endl;
  for (auto k : x) cerr << k;
}
