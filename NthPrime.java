public class NthPrime {
    public static void main(String[]args){
        int n=5;
        int count=0;
        int num=2;
        while(true){
            int factors=0;
            for(int i=1;i<=num;i++)
            {
                if(num%i==0)
                    factors++;
            }
            if(factors==2){
                count++;
            }
            if(count==n){
                System.out.println(num);
                break;
            }
            num++;
        }
    }
}
