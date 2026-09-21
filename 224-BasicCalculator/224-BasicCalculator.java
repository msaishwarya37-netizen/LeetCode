// Last updated: 9/21/2026, 7:47:43 PM
1class Solution {
2    public int calculate(String s) {
3        Stack<Integer>stack=new Stack<>();
4        int result=0;
5        int number=0;
6        int sign=1;
7        for(int i=0;i<s.length();i++){
8            char ch=s.charAt(i);
9            if(Character.isDigit(ch)){
10            number=number*10+(ch-'0');
11            }
12            else if(ch=='+'){
13                result+=sign*number;
14                number=0;
15                sign=1;
16            }
17            else if(ch=='-'){
18                result+=sign*number;
19                number=0;
20                sign=-1;
21            }
22            else if(ch=='('){
23                stack.push(result);
24                stack.push(sign);
25                result=0;
26                sign=1;
27            }
28            else if(ch==')'){
29                result+=sign*number;
30                number=0;
31                result*=stack.pop();
32                result+=stack.pop();
33            }
34        }
35        return result+sign*number;
36    }
37}