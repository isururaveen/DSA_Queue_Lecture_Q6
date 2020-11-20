public class QueueX {
    private int maxSize;
    private int[] queArray;
    private int front;
    private int rear;
    private int nItems;

    //Constructor
    public QueueX(int s){
        maxSize = s;
        queArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems =0;
    }

    //Put item at rear of queue
    public void insert(int j){
        if (rear == maxSize  -1) {
            System.out.println("Queue is full");
            rear = -1;
        }
        else {
            queArray[++rear] = j;
            nItems++;
        }
    }

    //Take item from front of queue
    public int remove(){
        if (nItems == 0){
            System.out.println("Queue is empty!");
            return  -99;
        }
        else{
            nItems--;
            return queArray[front++];
        }
    }

    public int peekFront(){
        if (nItems == 0){
            System.out.println("Queue is Empty");
            return -99;
        }
        else{
            return queArray[front];        }
    }

    public boolean isEmpty(){
        return (nItems == 0);
    }

    public boolean isFull(){
        return (nItems == maxSize);
    }

}
