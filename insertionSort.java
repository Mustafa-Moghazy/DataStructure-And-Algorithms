/* Insertion Sort ^_^
*
* @ author Moghazy 
*
*/
public class insertionSort {
    
    void Sort(int arr[]){
        int n = arr.length;
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j--; 
            } 
            arr[j + 1] = key; 
        }  
    }
    
    void Print (int arr[]){
        int n = arr.length;
        for(int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    
    public static void main(String args[]){
         insertionSort test = new insertionSort();
         int arr[] = { 5, 4, 3, 6, 2, 1, 0 };
         test.Sort(arr);
         test.Print(arr);
     } 
    
}
