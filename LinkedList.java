import java.io.*;
public class Main{
    Node head;// head of list
     private int size=0;
    
   static class Node{
        String data;
       Node next;
   
        Node(String data)// Constructor
     {
        this.data = data;
        this.next = null;
       
}}
// Add-First
public void addFirst(String data) {
    Node newNode = new Node(data);
    //If the List is empty
    // then make the newNode as head
    size++;
    if(head == null) {
        head = newNode;
        return;
    }

    newNode.next = head;
    head = newNode;
}
//Add-Last
public void addLast(String data) {
    Node newNode = new Node(data);
    //If the List is empty
    // then make the newNode as head
    size++;
    if(head == null) {
        head = newNode;
        return;
    }
    Node lastNode = head;
    while(lastNode.next != null) {
        lastNode = lastNode.next;
    }
   
    lastNode.next = newNode;
}
//Print
public void printList() {
    Node currNode = head;

    while(currNode != null) {
        System.out.print(currNode.data+" -> ");
        currNode = currNode.next;
    }

    System.out.println("null");
}
//Remove-First
 public void removeFirst() {
     //If the List is empty
       if(head == null) {
           System.out.println("Empty List, nothing to delete");
           return;
       }
       size--;
       head=head.next;
   }
   //Remove-Last
public void removeLast() {
       if(head == null) {
           System.out.println("Empty List, nothing to delete");
           return;
       }
       size--;
       if(head.next == null) {
           head = null;
           return;
       }
 
       Node currNode = head;
       Node lastNode = head.next;
       while(lastNode.next != null) {
           lastNode = lastNode.next;
           currNode = currNode.next;
       }
 
       currNode.next = null;
   }
 //Size
 public int getSize() {
       return size;
   }



public static void main(String args[]) {
    Main list = new Main();// Start with the empty list. 
    list.addLast("is");
       list.addLast("a");
       list.addLast("list");
       
 
       list.addFirst("this");
       list.printList();
       list.removeFirst();
       list.printList();
       list.removeLast();
       list.printList();
       list.addFirst("This");
 System.out.println(list.getSize());


}
}