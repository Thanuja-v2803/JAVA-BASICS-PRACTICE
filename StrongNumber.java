public class StrongNumber {
    public static void main(String[]args){
        int n=145;
        int temp=n;
        int sum=0;
        while(n>0){
            int d=n%10;
            int fact=1;
            for(int i=1;i<=d;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            n=n/10;
        }
        if(sum==temp)
            System.out.println("strong number");
        else
            System.out.println("not a strong number");

    }
}
