import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("America");
        stack.push("Germany");
        stack.push("India");

        System.out.println(stack);

        stack.pop();

        System.out.println(stack);

        System.out.println(stack.peek());

    }
}