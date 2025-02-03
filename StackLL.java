
// Stack operations using Linked List
public class StackLL {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Stack{

        static Node head = null;

        //isEmpty
        public static boolean isEmpty(){
            return head == null;   // if stack is empty return true or false
        }

        //push
        public static void push(int data){
            Node newNode = new Node(data);

            //if my stack is empty
            if(isEmpty()){
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        //pop
        public static int pop(){

            //if stack is empty
            if(isEmpty()){
                return -1; // stack empty
            }
            int top = head.data;
            head = head.next;

            return top;

        }

        public static int peek(){

            //if stack is empty
            if (isEmpty()) {
                return -1; // stack empty
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
