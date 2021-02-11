   

public class stackUsingLinkedList {

    private class node {
       int elment;
       node next; 
    }
    node top;
    stackUsingLinkedList () {
        top = null;
    }
    
    public void push (int in){
        node newElment = new node();
        if(newElment == null){
            System.out.println("Stac is Full");
        }else{
            newElment.elment = in;
            newElment.next = top;
            top = newElment;
        }
    }
   
    public boolean isEmpty(){
        return top == null;
    }
    
    public void pop(){
       if( isEmpty() )
           System.out.println("Stack Is Empty");
       else
           top = top.next; 
    }
    
    public int getTop(){
        if( isEmpty() ){
           System.out.println("Stack Is Empty");
           return 0;
        }else{
            return top.elment;
        }
    } 
    
    public void print(){
        node cur = top;
        while(cur != null){
            System.out.print(cur.elment + " ");
            cur = cur.next;
        }
    }
    
    public static void main(String[] args){
        stackUsingLinkedList test = new stackUsingLinkedList();
        for(int i=1; i<=5; ++i)
            test.push(i);
        test.print();
        System.out.println( "\nthe elment on top is : " + test.getTop());
        while( !test.isEmpty()){
            test.pop();
        }
        if(test.isEmpty())
         System.out.println("The Stack Is Empty, Elments Has Deleted Succesfully");
    }
    
}