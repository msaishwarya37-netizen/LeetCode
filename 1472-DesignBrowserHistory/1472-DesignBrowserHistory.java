// Last updated: 9/7/2026, 10:57:15 PM
1class BrowserHistory {
2Stack<String>back=new Stack<>();
3Stack<String>forward=new Stack<>();
4    public BrowserHistory(String homepage) {
5        back.push(homepage);
6    }
7    
8    public void visit(String url) {
9        back.push(url);
10        forward.clear();
11    }
12    
13    public String back(int steps) {
14        while(steps>0 && back.size()>1){
15            forward.push(back.pop());
16            steps--;
17        }
18       return back.peek();  
19    }
20    
21    public String forward(int steps) {
22        while(steps>0 && !forward.isEmpty()){
23            back.push(forward.pop());
24            steps--;
25        }
26        return back.peek();
27    }
28}
29
30/**
31 * Your BrowserHistory object will be instantiated and called as such:
32 * BrowserHistory obj = new BrowserHistory(homepage);
33 * obj.visit(url);
34 * String param_2 = obj.back(steps);
35 * String param_3 = obj.forward(steps);
36 */