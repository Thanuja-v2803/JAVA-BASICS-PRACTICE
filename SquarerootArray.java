public class SquarerootArray {
    public static void main(String[] args) {

        int a[] = {4, 9, 16, 25, 36};

        for(int i = 0; i < a.length; i++) {
            double sqrt = Math.sqrt(a[i]);
            System.out.println("Square root of " + a[i] + " = " + sqrt);
        }
    }
}