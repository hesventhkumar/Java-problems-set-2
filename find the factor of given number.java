class Main{
public static void main(String args[]){
long N,fact;
        Scanner sc = new Scanner(System.in);
        N = sc.nextLong();
        for(fact=1;fact<=N/2;fact++){
            if(N%fact==0){
                System.out.print(fact+" ");
            }

        }
            System.out.print(N+" ");
    }
}
