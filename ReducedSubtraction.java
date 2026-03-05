public class ReducedSubtraction {
    public static void main(String[]args){
        int a=24;
        int b=18;
        while(a!=b){
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        System.out.println("GCD:"+a);
    }
}
