public class MinMaxDigit {
    public static void main(String args[])
    {
        int n=1234;
        int max=0;
        int min=9;
        while(n>0){
            int digit=n%10;
            if(digit>max){
                max=digit;
            }
            if(digit<min){
                min=digit;
            }
            n=n/10;
        }
        System.out.println("max digit="+max);
        System.out.println("min digit="+min);
    }
}
