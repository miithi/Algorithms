package Algorithms;

import java.util.Collections;
import java.util.Random;
public class HeapSort{
    //three functions
    //heapify
    //build max heap
    //heap sort
    public static void heapSorting(int[] array)
    {
        buildMaxHeap(array);
        int n = array.length;
        for(int i = n-1; i > 0; i--)
        {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array,0, i);
        }
    }

    public static void buildMaxHeap(int[] array){
        int n = array.length;
        for(int i = n/2 - 1; i >= 0; i--)
        {
            heapify(array, i, n);
        }
    }

    //n is the length of the array
    public static void heapify(int[] array, int i, int n){
        int left = 2*i + 1;
        int right = 2*i + 2;
        int max = i;

        if(n > left && array[max] < array[left])
        {max = left; }
        if(n > right && array[max] < array[right]){
            max = right;
        }

        if(max != i)
        {
            int temp = array[i];
            array[i] = array[max];
            array[max] = temp;
            heapify(array, max, n);
        }

        

    }

    public static void main(String[] args) {
        Random random = new Random(); //randomizer created 
        int[] arr = new int[10]; // new blank array created

        //initializing the array
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = random.nextInt(100); //all numbers are between 0 and 100
        }

        //printing out the original array
        System.out.println("Originial Array:");
        for(int num: arr)
        {
            System.out.print(num + " ");
        }

        //Sorting the random array with the bubble sort algo
        heapSorting(arr);

        System.out.println("\nSorted Array:");
        for(int num: arr)
        {
            System.out.print(num + " ");
        }
    }
}
