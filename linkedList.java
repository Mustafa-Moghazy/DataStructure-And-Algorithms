/* linked list ^_^
*
* @ author Moghazy 
*
*/
public class linkedList {
    private class node {
        int elment;
        node next;
    }
    node first, last;
    private int length;
    
    linkedList(){
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
            newNode.next = null;
            first = last = newNode;
        }else{
            newNode.next = first;
            first = newNode;
        }
        length++;
    }
    
    public void insertLast(int newElment){
        node newNode = new node();
        newNode.elment = newElment;
        if(isEmpty()){
            newNode.next = null;
            first = last = newNode;
        }else{
            last.next = newNode;
            newNode.next = null;
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
            cur.next = newNode;
            
            length++;
        }
    }
    
    public void removeFist(){
        if(isEmpty())
            System.out.println("The Linked List Is EMpty, Cant Remove");
        else if(length == 1){
            first = last = null;
            length--;
        }else{
            first = first.next;
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
            node cur = first.next;
            node prev = first;
            while(cur!=last){
                prev = cur;
                cur = cur.next;
            }
            prev.next = null;
            last = prev;
            length--;
        }
    }
    
    public void delete(int elment){
        if(isEmpty())
            System.out.println("The Linked List Is EMpty, Cant Remove");
        else{
            node cur, prev;
            if(first.elment == elment){
                first = first.next;
                length--;
                if(length==0)
                    last = null;
            }else{
                prev = first;
                cur = first.next;
                while(cur!=null){
                    if(cur.elment == elment)
                        break;
                    prev = cur;
                    cur = cur.next;
                }
                if(cur == null)
                    System.out.println("The Elment Not Found");
                else{
                    prev.next = cur.next;
                    if(cur == last)
                        last = prev;
                    length--;    
                }
            }
        }
    }
    
    public void reverse(){
        node prev, cur, next;
        prev = null;
        cur = first;
        next = cur.next;
        while(next!=null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        first = prev;
        
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
        linkedList list = new linkedList();
        list.insertFirst(1);
        list.insertLast(2);
        list.insertLast(4);
        list.insertLast(5);
        list.insertPos(2, 3);
        list.print();
        list.removeFist();
        list.removeLast();
        list.print();
        list.delete(5);
        list.delete(3);
        list.print();
        list.reverse();
        list.print();
        list.search(0);
        list.search(4);
     }
    
}
