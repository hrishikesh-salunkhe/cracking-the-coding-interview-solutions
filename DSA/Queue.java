public class Queue {
    
    int[] queue;
    int front, rear, size;

    public Queue(int size){
        this.queue = new int[size];
        this.size = size;
        this.front = -1;
        this.rear = -1;
    }

    public void enqueue(Queue q, int data){
        if(q.isFull(q)){
            System.out.println("Queue is full");
        }
        else{
            if(q.front == -1 && q.rear == -1){
                q.front++;
            }
            q.rear = (q.rear + 1) % q.size;
            q.queue[q.rear] = data;
        }
    }

    public void dequeue(Queue q){
        if(q.isEmpty(q)){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("Dequeued: "+q.queue[q.front]);
            if(q.front == q.rear){
                q.front = -1;
                q.rear = -1;
            }
            else{
                q.front = (q.front + 1) % q.size;
            }
        }
    }

    public boolean isEmpty(Queue q){
        if(q.front == -1 && q.rear == -1){
            return true;
        }
        return false;
    }

    public boolean isFull(Queue q){
        if((q.rear + 1) % q.size == q.front){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        Queue q = new Queue(10);
        System.out.println(q.isEmpty(q));
        for(int i=0; i<5; i++){
            q.enqueue(q, i);
        }
        System.out.println(q.isFull(q));
        for(int i=0; i<4; i++){
            q.dequeue(q);
        }
        System.out.println(q.isEmpty(q));
        for(int i=0; i<8; i++){
            q.enqueue(q, i);
        }
        System.out.println(q.isFull(q));
        for(int i=0; i<3; i++){
            q.dequeue(q);
        }
    }    
}
