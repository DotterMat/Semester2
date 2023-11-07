package Opg1;

public class Ex1App {

    public static void main(String[] args) {
        Stack23Y<String> stack = new ArrayStack23Y<>();
//        Opg1.Stack23Y<String> stack = new Opg1.LinkedStack23Y<>();
//        Opg1.Stack23Y<String> stack = new Opg1.DequeStack23Y<>();

        stack.push("Tom");
        stack.push("Diana");
        stack.push("Harry");
        stack.push("Thomas");
        stack.push("Bob");
        stack.push("Brian");
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty() + " " + stack.size());
        System.out.println();

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println();

        System.out.println(stack.isEmpty() + " " + stack.size());
        System.out.println();

        // -------- test of reverse --------

        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        reverse(numbers);
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }

    /** Reverse the table. */
    public static <E> void reverse(E[] table) {
        // Opg1.Stack23Y<E> stack = new Opg1.ArrayStack23Y<E>();
        // Opg1.Stack23Y<E> stack = new Opg1.LinkedStack23Y<E>();
        Stack23Y<E> stack = new DequeStack23Y<>();
        for (E e : table) {
            stack.push(e);
        }
        int i = 0;
        while (!stack.isEmpty()) {
            table[i] = stack.pop();
            i++;
        }
    }
}
