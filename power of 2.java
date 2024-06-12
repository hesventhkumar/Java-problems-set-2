class Main{
public static void main(String args[]){
     int num ;
     Scanner sc = new Scanner(System.in);
     num = sc.nextInt();
     if((num&(num-1))==0){
         System.out.println("yes");
     }else
         System.out.println("No");
    }
}
