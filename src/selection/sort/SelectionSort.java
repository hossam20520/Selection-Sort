/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selection.sort;

/**
 *
 * @author Hossam
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = {4,9,1,3,5,7,6,1};
        selectionSort(array);
        for(int i =0; i<array.length; i++){
            System.out.println(array[i]);
        }
        
    }
    
    public static void selectionSort(int[] arr){
        for(int i =0; i< arr.length-1; i++){
            int currentMin = arr[i];
            int currentIndex = i;
            for(int j = i+ 1; j < arr.length; j++){
                if(currentMin > arr[j]){
                    currentMin = arr[j]; 
                    currentIndex = j;
                }
            }
            
            if(currentIndex != i){
                arr[currentIndex] = arr[i];
                arr[i] = currentMin;
            }
        }
    }
    
    
}
