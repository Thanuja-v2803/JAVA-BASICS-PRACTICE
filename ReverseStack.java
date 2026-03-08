import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {

        int num = 12345;
        Stack<Integer> stack = new Stack<>();

        // Push digits into stack
        while (num != 0) {
            stack.push(num % 10);
            num = num / 10;
        }

        // Pop digits and print
        System.out.print("Reversed Number: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
