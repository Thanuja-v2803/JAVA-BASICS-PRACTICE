public class HappyNumber {
    public static void main(String[]args){
        int n=19;
        while(n!=1 && n!=4){
            int sum=0;
            while(n>0){
                int d=n%10;
                sum=sum+d*d;
                n=n/10;
            }
            n=sum;
        }
        if(n==1)
            System.out.println("happy number");
        else
            System.out.println("not a happy number");
    }
}
