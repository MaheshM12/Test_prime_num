class Prime_num{
    public static void main(String[] args) {
        //Code for printing prime num from 1 to 20.
        int c=0;
        for(int i=1;i<=20;i++){
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    c++;
                }
            }
        if(c<=2 && i!=1){
            System.out.println(i);
        }
        c=0;
        }

        
    }
}