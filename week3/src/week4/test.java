package week4;

/**
 * Created by boybo on 26-6-2018.
 */
public class test {
    public static void main(String[] args){
//        Stack stack = new ListStack();
//
//        stack.push("1");
//        stack.push("2");
//        stack.push("3");
//        stack.push("4");
//        stack.push("5");
//        System.out.println(stack.size());
//        System.out.println(stack.isEmpty());
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.size());
//        System.out.println(stack.isEmpty());


//        Queue queue = new ListQueue();
//        queue.enqueue("1");
//        queue.enqueue("2");
//        queue.enqueue("3");
//        queue.enqueue("4");
//        queue.enqueue("5");
//        System.out.println(queue.isEmpty());
//        System.out.println(queue.size());
//        System.out.println(queue.front());
//        System.out.println(queue.dequeue());
//
//        System.out.println(queue.front());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.front());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.front());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.front());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.front());
//        System.out.println(queue.dequeue());

        PostFixCalculator postFixCalculator = new PostFixCalculator("13 2 /");
        System.out.println(postFixCalculator.getResult());



    }
}
