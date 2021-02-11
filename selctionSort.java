/* Selction Sort ^_^
*
* @ author Moghazy 
*
*/
public class selctionSort {
   
    void sort(int arr[]){
        int n = arr.length;
        for(int i=0; i<n-1; ++i){
            int min = i;
            for(int j = i+1; j<n; ++j){
                if(arr[j] < arr [min] )
                    min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    
    void Print (int arr[]){
        int n = arr.length;
        for(int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    
    public static void main(String args[]){
         selctionSort test = new selctionSort();
         int arr[] = { 5, 4, 3, 6, 2, 1 };
         test.sort(arr);
         test.Print(arr);
     } 
}
