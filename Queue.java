/* Queue using array ^_^
*
* @ author Moghazy 
*
*/
public class Queue {
    private int front;
    private int rear;
    private int length;
    private final int [] arr;

    public Queue( int size  ) {
        front = rear = 0;
        length = size;
        arr = new int [length];  
    }
 
    public boolean isFull(){
        return length == rear;
    }
    
    public void enQueue(int elment){
         if(isFull()){
             System.out.println("QueuemIs Full");
         }
         else{
          arr[rear++] = elment;
         }
    }
    
    public boolean isEmpty(){
        return front == rear;
    }
    
    public void deQueu(){
        if( isEmpty() ){
            System.out.println("Queue Is Empty");
        }else{
            for (int i = 0; i < rear - 1; i++) 
                arr[i] = arr[i + 1]; 
            rear --;
        }
    }
    public int getFront(){
        if(isEmpty()){
            System.out.println("Queue Is Empty");
            return 0;
        }
        else
         return arr[front];
    }
    public void print (){
        if(isEmpty())
            System.out.println("Queue Is Empty");
        else{
            for(int i=0; i<rear ; ++i)
                System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        Queue q;
        q = new Queue(10);
        for(int i=1; i<=5; ++i)
            q.enQueue(i);
        q.print();
        System.out.println( "\nthe elment on top is : " +q.getFront());
        while( !q.isEmpty()){
            q.deQueu();
        }
         if(q.isEmpty())
         System.out.println("The queue Is Empty, Elments Has Deleted Succesfully");
    } 
}
