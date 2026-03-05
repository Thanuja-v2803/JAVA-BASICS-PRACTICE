public class uniqueNumber {
    public static void main(String[]args){
        int n1=223; int n2=n1; int count=0;
        while(n1>0)
        {
            int d1 = n1 % 10;
            while (n2 > 0)
            {
                int d2=n2 % 10;
                if (d1==d2)
                    count++;
                n2 = n2 / 10;
            }
            n1=n1/10;
        }
        if(count==1)
            System.out.println("unique number");
        else
            System.out.println("not a unique number");

    }

}
