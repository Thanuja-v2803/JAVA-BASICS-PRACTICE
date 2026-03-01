public class PrimeRange {
    public static void main(String[] args){
        int start=10;
        int end=30;
        for(int n=start;n<=end;n++)
        {
            int count=0;
            for(int i=1;i<=n;i++){
                if(n%i==0) {
                    count++;
                }
            }
            if(count==2){
                System.out.println(n+" ");
            }
        }
    }
}
