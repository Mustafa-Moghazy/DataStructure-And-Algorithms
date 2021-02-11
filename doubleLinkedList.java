/* linked list ^_^
*
* @ author Moghazy 
*
*/
public class doubleLinkedList {
    private class node {
        int elment;
        node next;
        node prev;
    }
    node first, last;
    private int length;
    doubleLinkedList(){
        first = last = null;
        length = 0;
    }
    
    public boolean isEmpty(){
        return length == 0;
    }
    
    public void insertFirst(int newElment){
        node newNode = new node();
        newNode.elment = newElment;
        if(isEmpty()){
            newNode.next = newNode.prev = null;
            first = last = newNode;
        }else{
            newNode.next = first;
            newNode.prev = null;
            first.prev = newNode;
            first = newNode;
        }
        length++;
    } 
    
     public void insertLast(int newElment){
        node newNode = new node();
        newNode.elment = newElment;
        if(isEmpty()){
            newNode.next = newNode.prev = null;
            first = last = newNode;
        }else{
            newNode.next = null;
            newNode.prev = last;
            last.next = newNode;
            last = newNode;
        }
        length++;
    }
    
    public void insertPos(int pos, int newElment){
        if( pos < 0 || pos > length  )
            System.out.println("Out Of Range");
        else if(pos == 0)
            insertFirst(newElment);
        else if( pos == length)
            insertLast(newElment);
        else {
            node newNode = new node();
            newNode.elment = newElment;
            node cur = first;
            for(int i=1; i < pos; ++i)
                cur = cur.next;
            newNode.next = cur.next;
            newNode.prev = cur;
            cur.next = newNode;
            cur.next.prev = newNode;
            
            length++;
        }
    }
    
    public void removeFirst(){
        if(isEmpty())
            System.out.println("The Linked List Is EMpty, Cant Remove");
        else if(length == 1){
            first = last = null;
            length--;
        }else{
            first = first.next;
            first.prev = null;
            length--;
        }
    }
    
    public void removeLast(){
        if(isEmpty())
            System.out.println("The Linked List Is EMpty, Cant Remove");
        else if(length == 1){
            first = last = null;
            length--;
        }else{
            last = last.prev;
            last.next = null;
            length--;
        }
    }
    
    public void delete(int elment){
        if(isEmpty())
            System.out.println("The Linked List Is EMpty, Cant Remove");
        else if(first.elment == elment)
               removeFirst();
        else{
               node cur =first.next;
               while(cur!=null){
                   if(cur.elment == elment)
                       break;
                   cur = cur.next;
               }
               if(cur == null)
                    System.out.println("The Elment Not Found");
               else if(cur.next == null)
                    removeLast();
               else{
                   cur.prev.next = cur.next;
                   cur.next.prev = cur.prev;
                   length--;
               }
        }
    }
    
    public void reverse(){
        node cur = last;
        while(cur!=null){
            System.out.print(cur.elment + " ");
            cur = cur.prev;    
        }System.out.print("\n");
    }
    
    public int search (int elment){
        node cur = first;
        int pos = 1;
        while(cur!=null){
            if(cur.elment == elment){
                System.out.println("the item " + (elment) + (" is founde at postion " ) + (pos) );
                return 0;
            }   
            cur = cur.next;
            pos++;
        }
        System.out.println( "the item " + elment + " is Not found" );
        return -1;
    }
    
    public void print (){
        node cur = first;
        while(cur!=null){
            System.out.print(cur.elment + " ");
            cur = cur.next;    
        }System.out.print("\n");
    }
    
    
     public static void main(String[] args){
        doubleLinkedList list = new doubleLinkedList();
        list.insertFirst(1);
        list.insertLast(2);
        list.insertLast(4);
        list.insertLast(5);
        list.insertPos(2, 3);
        list.print();
        list.reverse();
                
     }
}
