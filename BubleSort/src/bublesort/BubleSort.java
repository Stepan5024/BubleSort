/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bublesort;

/**
 *
 * @author Степан Бокарев
 */
public class BubleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr =  {12,3,6,7,85,-9};
        bubbleSort(arr);
    }
    public static void bubbleSort(int[] arr){
    
    for(int i = arr.length-1 ; i > 0 ; i--){
        for(int j = 0 ; j < i ; j++){
           
            if( arr[j] > arr[j+1] ){
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }
    }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            
        }
}
}
