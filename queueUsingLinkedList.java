/* Stack using linked list ^_^
*
* @ author Moghazy 
*
*/
public class queueUsingLinkedList {
    private class node {
        int elment;
        node next;
    }
    node front, rear;
    private int length; 
    queueUsingLinkedList(){
        front = rear = null;
        length =  0;
    }
    
    public boolean isEmpty(){
        return rear == null;
    }
    
    public void enQueue(int newElment){
        node newNode = new node();
        newNode.elment = newElment;
        newNode.next = null;
        if(isEmpty()){
            this.front = this.rear = newNode;
        }else{
            this.rear.next = newNode;
            this.rear = newNode; 
        }
        length++;
    }
    
    public void deQueue(){
        if(isEmpty()){
            System.out.println("Queue Is Empty");
        }else{
            front = front.next;
            if(front == null){  // queue is empty
               this.rear = null;
               length--;
            }
        }
    }
    
    public int getFront(){
       return this.front.elment;
    }
    
    public void print (){
        node cur = front;
        for(int i=1; i<=length; i++){
            System.out.print(cur.elment + " ");
            cur = cur.next;    
        }
    }
    
    public static void main(String[] args){
        queueUsingLinkedList test = new queueUsingLinkedList();
        for(int i=1; i<=5; ++i)
            test.enQueue(i);
        test.print();
        System.out.println( "\nthe elment on front is : " + test.getFront());
        while( !test.isEmpty()){
            test.deQueue();
        }
        if(test.isEmpty())
         System.out.println("The Queue Is Empty, Elments Has Deleted Succesfully");
    }
    
    
}
