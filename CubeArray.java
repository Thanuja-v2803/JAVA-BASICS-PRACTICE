public class CubeArray {
    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5};

        for(int i = 0; i < a.length; i++) {
            int cube = a[i] * a[i] * a[i];
            System.out.println("Cube of " + a[i] + " = " + cube);
        }
    }
}
