// Last updated: 7/19/2026, 11:46:22 PM
int tribonacci(int n) {
        if(n==0){
            return 0;
        }
        if(n<3){
            return 1;
        }
        
        int n0=0;
        int n1=1;
        int n2=1;
        
        for(int i=3;i<=n;i++){
            int temp=n0+n1+n2;
            n0=n1;
            n1=n2;
            n2=temp;
        }
        
        return n2;
        
    }
	
	