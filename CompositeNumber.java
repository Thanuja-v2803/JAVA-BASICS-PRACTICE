public class CompositeNumber {
    public static void main(String[]args){
        int n=25;
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count>2)
            System.out.println("composite number");
        else
            System.out.println("not a composite");
    }
}
