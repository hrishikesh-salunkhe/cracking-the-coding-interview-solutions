// 2.1 Remove Dups: Write code to remove duplicates from an unsorted linked list.
// Follow up
// How would you solve this problem if a temporary buffer is not allowed?

import java.util.HashSet;

public class removeDups {
    
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    Node head;

    public static removeDups insert(removeDups list, int data){

        Node newNode = new Node(data);

        if(list.head == null){
            list.head = newNode;
        }
        else{
            Node temp = list.head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }

        return list;
    }

    public static removeDups delete(removeDups list, int data){

        if(list.head != null){
            if(list.head.data == data){
                list.head = list.head.next;
            }
            else{
                Node temp = list.head;
                while(temp.next != null){
                    if(temp.next.data == data){
                        temp.next = temp.next.next;
                        break;
                    }
                }
            }
        }
        return list;
    }

    public static void print(removeDups list){
        
        if(list.head == null){
            System.out.println("List empty");
        }
        else{
            Node temp = list.head;
            while(temp.next != null){
                System.out.println(temp.data);
                temp = temp.next;
            }    
        }
    }

    public static void main(String[] args){
        removeDups list = new removeDups();
        insert(list, 3);
        insert(list, 2);
        insert(list, 2);
        insert(list, 1);
        insert(list, 2);
        insert(list, 3);

        HashSet<Integer> set = new HashSet<Integer>();
        
        // Problem logic:
        if(list.head != null){
            Node temp = list.head;
            set.add(temp.data);
            while(temp.next != null){
                if(set.contains(temp.next.data)){
                    temp.next = temp.next.next;
                }else{
                    set.add(temp.next.data);
                }
                temp = temp.next;
            }
        }

        print(list);
    }
}