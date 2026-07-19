// Last updated: 7/19/2026, 11:46:49 PM
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<operations.length;i++){

            if(operations[i].equals("C")){
                stack.pop();
            }
            else if(operations[i].equals("D")){
                stack.push(stack.peek()*2);
            }
            else if(operations[i].equals("+")){
                int a=stack.pop();
                int b=stack.peek();
                stack.push(a);
                stack.push(a+b);
            }
            else{
                stack.push(Integer.parseInt(operations[i]));
            }
        }
       int sum=0;
for (int i = 0; i < stack.size(); i++) {
    sum += stack.get(i);

    }
    return sum;
        }

}