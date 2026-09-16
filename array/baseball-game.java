class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            String op=operations[i];
            if(op.equals("C")){
                st.pop();
            }
            else if(op.equals("D")){
                st.push(2*st.peek());
            }
            else if(op.equals("+")){
                int last=st.pop();
                int seclast=st.peek();
                int sum=last+seclast;
                st.push(last);
                st.push(sum);

            }
            else
            {
                st.push(Integer.parseInt(op));
            }
        }
                int total=0;
                for(int i=0;i<st.size();i++){
                    total+=st.get(i);
                }
                return total;
            }
        }
    