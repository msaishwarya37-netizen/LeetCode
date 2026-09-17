// Last updated: 9/17/2026, 9:16:45 PM
1class CustomStack {
2int maxSize;
3Stack<Integer>st=new Stack<>();
4    public CustomStack(int maxSize) {
5        this.maxSize=maxSize;
6    }
7    
8    public void push(int x) {
9        if(st.size()<maxSize){
10            st.push(x);
11        }
12    }
13    
14    public int pop() {
15        if(st.isEmpty()){
16        return -1;
17        }
18        return st.pop();
19    }
20    
21    public void increment(int k, int val) {
22        int limit=Math.min(k,st.size());
23        for(int i=0;i<limit;i++){
24            st.set(i,st.get(i)+val);
25        }
26    }
27}
28
29/**
30 * Your CustomStack object will be instantiated and called as such:
31 * CustomStack obj = new CustomStack(maxSize);
32 * obj.push(x);
33 * int param_2 = obj.pop();
34 * obj.increment(k,val);
35 */