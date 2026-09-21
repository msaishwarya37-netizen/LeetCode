// Last updated: 9/21/2026, 8:20:57 PM
1class Solution {
2    public String decodeString(String s) {
3        Stack<Integer>count=new Stack<>();
4        Stack<String>stack=new Stack<>();
5        String result="";
6        int num=0;
7        for(int i=0;i<s.length();i++){
8            char ch=s.charAt(i);
9            if(Character.isDigit(ch)){
10                num=num*10+(ch-'0');
11            }
12            else if(ch=='['){
13                count.push(num);
14                stack.push(result);
15                result="";
16                num=0;
17            }
18            else if(ch==']'){
19                int n=count.pop();
20                String old=stack.pop();
21                String temp="";
22                for(int j=0;j<n;j++){
23                    temp+=result;
24                }
25                result=old+temp;
26            }
27            else
28            {
29                result+=ch;
30            }
31        }
32        return result;
33    }
34}