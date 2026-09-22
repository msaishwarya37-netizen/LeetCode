// Last updated: 9/22/2026, 8:11:44 PM
1import java.util.*;
2
3class Solution {
4    public int largestRectangleArea(int[] heights) {
5        Stack<Integer> s = new Stack<>();
6        int max = 0;
7
8        for(int i=0;i<=heights.length;i++){
9            int curr=(i==heights.length)?0:heights[i];
10            while(!s.isEmpty()&&heights[s.peek()]>curr){
11                int height=heights[s.pop()];
12                int width=s.isEmpty()?i:i-s.peek()-1;
13                max=Math.max(max,height*width);
14            }
15            s.push(i);
16        }
17        return max;
18    }
19}