import java.util.ArrayList;


//Stack operations using ArrayList
public class StackA{

    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
            return list.size() == 0;  // returns true or false
        }

        //push
        public static void push(int data){
            list.add(data);

        }

        //Pop
        public static int pop(){

            if (isEmpty()) {
                return -1;
            }

            int top = list.get(list.size()-1); // get the top element
            list.remove(list.size()-1); // remove top element
            return top; // return top element which is removed

        }

        //Peek operation => i've to get top and return it only
        public static int peek(){
            if (isEmpty()) {
                return -1;
            }
            
            return list.get(list.size()-1);
        }

    }
    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);


        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();

        }
        
    }
}