// Last updated: 9/19/2026, 8:01:36 PM
1class MinStack {
2 Stack<Integer> stack=new Stack<>();
3       Stack<Integer> minStack=new Stack<>();
4    public MinStack() {
5      
6    }
7    
8    public void push(int value) {
9         stack.push(value);
10        if(minStack.isEmpty()||value<=minStack.peek()){
11            minStack.push(value);
12        }
13       
14    }
15    
16    public void pop() {
17        if(minStack.peek().equals(stack.peek())){
18            minStack.pop();
19        }
20        stack.pop();
21    }
22    
23    public int top() {
24      return stack.peek();
25    }
26    
27    public int getMin() {
28        return minStack.peek();
29    }
30}
31
32/**
33 * Your MinStack object will be instantiated and called as such:
34 * MinStack obj = new MinStack();
35 * obj.push(value);
36 * obj.pop();
37 * int param_3 = obj.top();
38 * int param_4 = obj.getMin();
39 */