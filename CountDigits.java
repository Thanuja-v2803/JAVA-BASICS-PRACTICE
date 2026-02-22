public class CountDigits {
    public static void main(String[] args)
    {
        int num=12345;
        int count;
        if (num<10)
            count=1;
        else if(num<100)
            count=2;
        else if(num<1000)
            count=4;
        else
            count=5;
        System.out.println("number of digits:"+ count);
    }
}
