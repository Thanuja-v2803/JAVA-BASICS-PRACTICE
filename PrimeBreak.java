public class PrimeBreak {
    public static void main(String[] args) {

        int num = 17;
        int i;
        boolean isPrime = true;

        for(i = 2; i <= num/2; i++) {
            if(num % i == 0) {
                isPrime = false;
                break;   // stop loop when divisor found
            }
        }

        if(isPrime)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime Number");
    }
}
