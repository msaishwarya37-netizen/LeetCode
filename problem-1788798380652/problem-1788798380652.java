// Last updated: 9/7/2026, 9:56:20 PM
1class MyQueue {
2Stack<Integer>s1=new Stack<>();
3Stack<Integer>s2=new Stack();
4    public MyQueue() {
5        
6    }
7    
8    public void push(int x) {
9        s1.push(x);
10        
11    }
12    
13    public int pop() {
14        while(!s1.isEmpty()){
15            s2.push(s1.pop());
16        }
17        int ans=s2.pop();
18        while(!s2.isEmpty()){
19            s1.push(s2.pop());
20        }
21        return ans;
22    }
23    
24    public int peek() {
25     while(!s1.isEmpty()){
26        s2.push(s1.pop());
27     }   
28     int ans=s2.peek();
29     while(!s2.isEmpty()){
30        s1.push(s2.pop());
31     }
32     return ans;
33    }
34    
35    public boolean empty() {
36        return s1.isEmpty();
37    }
38}
39
40/**
41 * Your MyQueue object will be instantiated and called as such:
42 * MyQueue obj = new MyQueue();
43 * obj.push(x);
44 * int param_2 = obj.pop();
45 * int param_3 = obj.peek();
46 * boolean param_4 = obj.empty();
47 */