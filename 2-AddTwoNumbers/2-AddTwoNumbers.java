// Last updated: 9/22/2026, 7:26:17 PM
1import java.util.*;
2
3class Solution {
4    public int largestRectangleArea(int[] h) {
5        Stack<Integer> s = new Stack<>();
6        int max = 0;
7
8        for (int i = 0; i <= h.length; i++) {
9            int curr = (i == h.length) ? 0 : h[i];
10
11            while (!s.isEmpty() && h[s.peek()] > curr) {
12                int height = h[s.pop()];
13                int width = s.isEmpty() ? i : i - s.peek() - 1;
14                max = Math.max(max, height * width);
15            }
16
17            s.push(i);
18        }
19
20        return max;
21    }
22}