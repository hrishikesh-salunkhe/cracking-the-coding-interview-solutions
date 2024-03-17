// Linked list operations:
//1. insertAtStart
//2. insertAtEnd
//3. insertAfterElement
//4. deleteAtStart
//5. deleteAtEnd
//6. deleteAfterElement
//7. display


public class SinglyLinkedList {

    static class Node{
        int data;
        Node next;

        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    Node head;

    public void insertAtStart(SinglyLinkedList list, int data){
        
        if(list.head == null){
            list.head = new Node(data, null);
        }
        else{
            Node sec = new Node(list.head.data, list.head.next);
            list.head.data = data;
            list.head.next = sec;
        }
    }

    public void insertAfter(SinglyLinkedList list, int data, int ref){
        if(list.head == null){
            System.out.println("Empty string");
        }
        else{
            Node temp = list.head;
            while(temp.next != null){
                if(temp.data == ref){
                    Node newNode = new Node(data, temp.next);
                    temp.next = newNode;
                    return;
                }
                else{
                    temp = temp.next;
                }
            }
            if(temp.data == ref){
                Node newNode = new Node(data, null);
                temp.next = newNode;
            }
            else{
                System.out.println("Ref not found");
            }
        }
    }

    public void deleteAtStart(SinglyLinkedList list){
        if(list.head == null){
            System.out.println("Empty list");
        }
        else{
            list.head = list.head.next;
        }
    }

    // public void deleteAfterElement(SinglyLinkedList list, int ref){
    //     if(list.head == null){
    //         System.out.println("Empty list");
    //     }
    //     else{
    //         Node temp = list.head;
    //         while()
    //     }
    // }

    public void insertAtEnd(SinglyLinkedList list, int data){
        
        if(list.head == null){
            list.head = new Node(data, null);
        }
        else{
            Node itr = list.head;
            while(itr.next != null){
                itr = itr.next;
            }
            itr.next = new Node(data, null);
        }
    }

    public void deleteAtEnd(SinglyLinkedList list){
        if(list.head == null){
            System.out.println("Empty list");
        }
        else{
            Node itr = list.head;
            while(itr.next.next != null){
                itr = itr.next;
            }
            itr.next = null;    
        }
    }

    public static void display(SinglyLinkedList list){
        if(list.head == null){
            System.out.println("Empty list");
        }
        else{
            Node itr = list.head;
            while(itr.next != null){
                System.out.println(itr.data);
                itr = itr.next;
            }
            System.out.println(itr.data);
        }
    }

    public static void main(String[] args){
        
        SinglyLinkedList list = new SinglyLinkedList();
        
        for(int i=1; i<6; i++){
            list.insertAtEnd(list, i);
        }

        display(list);
        list.insertAfter(list, 999, 1);
        list.insertAfter(list, 999, 3);
        list.insertAfter(list, 999, 5);
        
        display(list);

        for(int i=6; i<11; i++){
            list.insertAtStart(list, i);
        }
        display(list);

        for(int i=0; i<=3; i++){
            list.deleteAtEnd(list);
        }
        System.out.println("deleteatend");
        display(list);

        for(int i=0; i<=3; i++){
            list.deleteAtStart(list);
        }
        System.out.println("deleteatstart");
        display(list);

    }
}