import java.util.Scanner;
import java.util.Stack;

public class ToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();

        while (n > 0){
            stack.add(n%2);
            n /=2;
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
