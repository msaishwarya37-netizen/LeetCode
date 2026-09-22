// Last updated: 9/22/2026, 11:02:41 PM
1class LRUCache {
2    int capacity;
3HashMap<Integer,Integer> map=new HashMap<>();
4LinkedList<Integer>list=new LinkedList<>();
5    public LRUCache(int capacity) {
6        this.capacity=capacity;
7    }
8    
9    public int get(int key) {
10    if(!map.containsKey(key))
11      return -1;
12      list.remove((Integer)key);
13      list.addLast(key);
14      return map.get(key);  
15    }
16    
17    public void put(int key, int value) {
18     if(map.containsKey(key)){
19        list.remove((Integer)key);
20     }
21     map.put(key,value);
22     list.addLast(key);
23        if(list.size()>capacity){
24            int old=list.removeFirst();
25            map.remove(old);
26        }
27     
28    }
29}
30
31/**
32 * Your LRUCache object will be instantiated and called as such:
33 * LRUCache obj = new LRUCache(capacity);
34 * int param_1 = obj.get(key);
35 * obj.put(key,value);
36 */