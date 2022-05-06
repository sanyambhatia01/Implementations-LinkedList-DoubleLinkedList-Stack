import java.io.*;
public class Main {
    private static class Node {
        int data;
        
        Node next;
            
        Node(int data) {
            this.data = data;
            next = null;
           
        }
    }

    static class Stack {
       
        public static Node head = null;
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
    
//Size
 public int getSize() {
    if (head == null) {
        return 0;
    }
    int size = 0;
    Node tmpNode = head;
    while (tmpNode.next != null) {
        size++;
        tmpNode = tmpNode.next;
    }
    return size;
}}
    public static void main(String args[]) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(4);
        stack.pop();
        System.out.println(stack.getSize());
        while(!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
        
    }
}