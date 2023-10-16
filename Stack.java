public class StackwithLL {
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Stack {
        Node head = null; // Created a Head
        public static void push(int data) {  
            Node newNode = new Node(data);

            if(head == null) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static boolean isEmpty() {
            return head == null;
        }

        public static int pop() {
            if(isEmpty()) {
                return -1;
            }
            Node top = head;
            head = head.next;
            return top.data;
        }

        public static int peek() {
            if(isEmpty()) {
                return -1;
            }
            Node top = head;
            return top.data;
        }
    }

    public static void main(String args[]) {
        Stack stack = new Stack();
        // Added elements to Stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        //Displayed Elements of Stack
        while(!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
