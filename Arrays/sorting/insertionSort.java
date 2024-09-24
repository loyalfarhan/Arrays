package Arrays.sorting;


import java.util.Arrays;
import java.util.Collections;

public class insertionSort {

    public static void insertionSort(Integer arr[]){
        for(int i=1; i<arr.length-1; i++){
            int curr=arr[i];
            int prev= i-1;
            ///finding out the correct postion
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;

        }
        
    }
    public static void printArr(Integer arr[]){
        for(int  k=0; k<arr.length; k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Integer arr[]={2,5,1,3,7,6,8,9};
        //integer

       // insertionSort(arr);
      //////// //inbuilt sort/////////////////////
       //Arrays.sort(arr);
       //arrays.sort(arr,si,ei)///////////////////////////
       ///Arrays.sort(arr,0,5);
       ///for reverse order///
       //change primitive tepe int in object Integer//
       Arrays.sort(arr,Collections.reverseOrder());
       

        printArr(arr);

    }
}
