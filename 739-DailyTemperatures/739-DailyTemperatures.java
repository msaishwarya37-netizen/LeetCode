// Last updated: 9/16/2026, 10:37:18 PM
1class Solution {
2    public int[] dailyTemperatures(int[] temperatures) {
3        int n=temperatures.length;
4        int[] answer=new int[n];
5        Stack<Integer>st=new Stack<>();
6        for(int i=0;i<n;i++){
7        while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){
8            int prev=st.pop();
9            answer[prev]=i-prev;
10        }
11        st.push(i);
12    }
13    return answer;
14}
15}