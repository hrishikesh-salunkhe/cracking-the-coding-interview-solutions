// 3.1 Three in One - Describe how you could use a single array to implement three stacks.

public class threeInOne {
    
    int arr[] = new int[75];
    int mins[] = new int[] {-1, 24, 49};
    int tops[] = new int[] {-1, 24, 49};
    final int maxes[] = new int[] {24, 49, 74};
        
    static void pop(threeInOne stack, int stackNumber){
        if(stack.tops[stackNumber] != stack.mins[stackNumber]){
            System.out.println(stack.arr[stack.tops[stackNumber]]);
            stack.arr[stack.tops[stackNumber]] = -1;
            stack.tops[stackNumber]--;
        }
        else{
            System.out.println("Stack #"+(stackNumber+1)+" empty");
        }
    }

    static void push(threeInOne stack, int stackNumber, int data){
        if(stack.tops[stackNumber] != stack.maxes[stackNumber]){
            stack.tops[stackNumber]++;
            stack.arr[stack.tops[stackNumber]] = data;
        }
        else{
            System.out.println("Stack #"+(stackNumber+1)+" full");
        }
    }

    static void peek(threeInOne stack, int stackNumber){
        if(stack.tops[stackNumber] != stack.mins[stackNumber]){
            System.out.println("Stack #"+(stackNumber+1)+" top: "+stack.arr[stack.tops[stackNumber]]);
        }
        else{
            System.out.println("Stack #"+(stackNumber+1)+" empty");
        }
    }

    public static void main(String[] args){
        threeInOne stack = new threeInOne();
        push(stack, 0, 10);
        push(stack, 0, 20);
        push(stack, 0, 30);
        push(stack, 0, 10);
        push(stack, 0, 20);
        push(stack, 0, 30);
        push(stack, 0, 10);
        push(stack, 0, 20);
        push(stack, 0, 30);
        push(stack, 0, 10);
        push(stack, 0, 20);
        push(stack, 0, 30);
        push(stack, 0, 10);
        push(stack, 0, 20);
        push(stack, 0, 30);
        push(stack, 0, 10);
        push(stack, 0, 20);
        push(stack, 0, 30);
        push(stack, 0, 10);
        push(stack, 0, 20);
        push(stack, 0, 30);
        push(stack, 0, 10);
        push(stack, 0, 20);
        push(stack, 0, 30);
        push(stack, 0, 10);
        push(stack, 0, 20);
        push(stack, 0, 30);
        
    }
}
