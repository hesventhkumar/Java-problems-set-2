
class Main {
    public static void main(String[] args) {
        int N,num ,sum=0;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for (num=1;num<=N*2-1;num+=2){
            sum=sum+num;
        }
        System.out.println(sum);
}
}
