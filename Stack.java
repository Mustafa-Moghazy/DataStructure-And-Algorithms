/* Stack using array ^_^
*
* @ author Moghazy 
*
*/

public class Stack {
   
 private int top;
    private final  int [] arr;
 
    public Stack() {
        top = -1;
        arr = new int[100];
    }
    
    public boolean isEmpty(){
        return top < 0;
    }
    
    public void push(int elment){ 
        arr[++top] = elment ;
    }
    
    public void pop (){
          if( isEmpty() )
              System.out.println("Stack is empty please push elments ");
          else
              top--;      
    }
    
    public int getTop(){
        return arr[top];
    }
    
    public void print (){
        for(int i=top; i>=0 ; --  i)
            System.out.print(arr[i] + " ") ; 
    }      

    public static void main(String[] args) {
        Stack st;
        st = new Stack();
        st.pop();
            for(int i=1; i<=5; ++i)
               st.push(i);
        st.print();
        System.out.println( "\nthe elment on top is : " +st.getTop());
        while( !st.isEmpty()){
            st.pop();
        }
         if(st.isEmpty())
         System.out.println("The Stack Is Empty, Elments Has Deleted Succesfully");
    } 
}

