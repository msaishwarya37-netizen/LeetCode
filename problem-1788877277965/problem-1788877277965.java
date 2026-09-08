// Last updated: 9/8/2026, 7:51:17 PM
1class MyCircularQueue {
2    int[] q;
3int front=0,rear=-1,size=0;
4    public MyCircularQueue(int k) {
5        q=new int[k];
6    }
7    
8    public boolean enQueue(int value) {
9        if(isFull())return false;
10        rear=(rear+1)%q.length;
11        q[rear]=value;
12        size++;
13        return true;
14    }
15    
16    public boolean deQueue() {
17        if(isEmpty())return false;
18        front=(front+1)%q.length;
19        size--;
20        return true;
21    }
22    
23    public int Front() {
24       return isEmpty()?-1:q[front]; 
25    }
26    
27    public int Rear() {
28        return isEmpty()?-1:q[rear];
29    }
30    
31    public boolean isEmpty() {
32        return size==0;
33    }
34    
35    public boolean isFull() {
36        return size==q.length;
37    }
38}
39
40/**
41 * Your MyCircularQueue object will be instantiated and called as such:
42 * MyCircularQueue obj = new MyCircularQueue(k);
43 * boolean param_1 = obj.enQueue(value);
44 * boolean param_2 = obj.deQueue();
45 * int param_3 = obj.Front();
46 * int param_4 = obj.Rear();
47 * boolean param_5 = obj.isEmpty();
48 * boolean param_6 = obj.isFull();
49 */