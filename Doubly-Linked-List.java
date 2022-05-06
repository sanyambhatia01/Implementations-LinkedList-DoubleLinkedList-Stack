import java.io.*;

public class Main {
  Node head;
  Node tail;
  private int size=0;
  class Node {
    int data;
    Node next;
    Node prev;
    Node(int data) {  
                this.data = data;  
                this.next = null;
                this.prev = null;
            }  
}


  //Add new element at the end of the list
  public void addLast(int data) {
    Node newNode = new Node(data);
    newNode.data = data;
    newNode.next = null;
    newNode.prev = null; 
    size++;
    if(head == null) {
      head = newNode;
    } else {
      Node temp = new Node(data);
      temp = head;
      while(temp.next != null)
        temp = temp.next;
      temp.next = newNode;
      newNode.prev = temp;
    }    
  }

  
   public void addFirst(int data) {  
            //Create a new Node  
            Node newNode = new Node(data);  
              size++;
            //If list is empty  
            if(head == null) {  
                //head and tail both will point to newNode  
                head = newNode; 
                tail = newNode;
                //head's previous will point to null  
                head.prev = null;  
                //tail's next will point to null, because it is the last node of the list  
                tail.next = null;  
            }  
            else {  
                //head's previous pointer node will be newNode  
                head.prev = newNode;  
                //newNode's next pointer node will be head  
                newNode.next = head;  
                //newNode's pointer previous will point to null  
                newNode.prev = null;  
                //newNode will become new head  
                head = newNode;  
            }  
        }  
//Delete first node of the list
  public void removeFirst() {
    if(head != null) {
      Node temp = head;
      head = head.next;
      temp = null;
      if(head != null) 
       head.prev = null;
       size--;
    }
  }
  public void removeLast()
	{
	    size--;
		if (head == null)
		{
			System.out.println("Empty Linked List");
		}
		else
		{
			Node temp = head;
			// Find last node
			while (temp.next != null)
			{
				// Visit to next node
				temp = temp.next;
			}
			if (temp == head)
			{
				// When only one node
              	// remove head
				head = null;
			}
			else
			{
				temp.prev.next = null;
			}
		}
	}
  //display the content of the list
  public void printList() {
    Node currNode = head;

    while(currNode != null) {
        System.out.print(currNode.data+" -> ");
        currNode = currNode.next;
    }

    System.out.println("null");
}
//Size
 public int getSize() {
       return size;
   }

  public void SearchElement(int searchValue) {
    Node temp = head;
    temp = head;

    int found = 0;
    int i = 0;

    if(temp != null) {
      while(temp != null) {
        i++;
        if(temp.data == searchValue) {
          found++;
          break;
        }
        temp = temp.next;
      }
      if (found == 1) {
        System.out.println(searchValue + " is found at index = " + i +".");
      } else {
        System.out.println(searchValue + " is not found in the list.");
      }
    } else {
      System.out.println("The list is empty.");
    }
  }   
// test the code 
  public static void main(String[] args) {
    Main MyList = new Main();
    
    
    MyList.addLast(10);
    MyList.addLast(20);
    MyList.addLast(30);
    MyList.printList();

    
    MyList.addFirst(100);
    MyList.printList();
    MyList.removeFirst();
    MyList.printList();
    MyList.removeLast();
    MyList.printList();
     MyList.addLast(40);
     System.out.println(MyList.getSize());
     MyList.SearchElement(10);
      MyList.SearchElement(40);
  }
}