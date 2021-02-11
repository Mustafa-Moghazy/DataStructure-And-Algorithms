/* Buble Sort ^_^
*
* @ author Moghazy 
*
*/
public class bubleSort {
    
    void Sort(int arr[]){
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]){  
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                }
    }
    
    void Print (int arr[]){
        int n = arr.length;
        for(int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    
    public static void main(String args[]){
         bubleSort test = new bubleSort();
         int arr[] = { 5, 4, 3, 6, 2, 1 };
         test.Sort(arr);
         test.Print(arr);
     } 
}
