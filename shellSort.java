/* Shell Sort ^_^
*
* @ author Moghazy 
*
*/
public class shellSort {
     void sort(int arr[]){ 
        int n = arr.length;  
        for (int gap = n/2; gap > 0; gap /= 2){ 
            for (int i = gap; i < n; i += 1){ 
                int temp = arr[i]; 
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) 
                    arr[j] = arr[j - gap]; 
                arr[j] = temp; 
            } 
        }  
    }

    void Print(int arr[]){ 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
  
    public static void main(String args[]) { 
        int arr[] = { 5, 4, 3, 6, 2, 1, 0 };
        shellSort test = new shellSort();
        int n = arr.length;
        test.sort(arr);
        test.Print(arr);
    }     
}
