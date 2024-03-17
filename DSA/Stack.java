//Stack operations:
//1. push
//2. pop
//3. peek
//4. isEmpty
//5. isFull

public class Stack {
    int[] stack;
    int top, max;

    public Stack(int size){
        stack = new int[size];
        top = -1;
        max = size - 1;
    }

    public void push(Stack s, int data){
        if(s.top != s.max){
            s.top++;
            s.stack[s.top] = data;
        }
        else{
            System.out.println("Stack is full");
        }
    }

    public void pop(Stack s){
        if(s.top != -1){
            System.out.println("Popped: "+s.stack[s.top]);
            s.top--;
        }
        else{
            System.out.println("Stack is empty");
        }
    }

    public void peek(Stack s){
        if(s.top != -1){
            System.out.println("Peeked: "+s.stack[s.top]);
        }
        else{
            System.out.println("Stack is empty");
        }
    }

    public boolean isEmpty(Stack s){
        if(s.top == -1){
            return true;
        }
        return false;
    }

    public boolean isFull(Stack s){
        if(s.top == max){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        Stack s = new Stack(50);
        System.out.println(s.isEmpty(s));
        for(int i=0; i<51; i++){
            s.push(s, i);
        }
        s.peek(s);
        System.out.println(s.isFull(s));
        for(int i=0; i<51; i++){
            s.pop(s);
        }
        System.out.println(s.isEmpty(s));
    }
}
