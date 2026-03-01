public class MagicNumber {
    public static void main(String[]args){
        int n=19;
        while(n>9){
            int sum=0;
            while(n>0){
                sum=sum+(n%10);
                n=n/10;
            }
            n=sum;
        }
        if(n==1)
            System.out.println("magic number");
        else System.out.println("not a magic number");
    }
}
