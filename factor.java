 class Main {
    public static void main(String[] args) {
int N,prod=1,num;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for (num=N;num>=1;num--){
            prod=prod*num;
        }
        System.out.println(prod);
    }
}
