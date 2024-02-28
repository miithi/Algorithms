package Algorithms;

import java.util.Random;

public class MergeSort {
    
    public static void divide(int low, int high, int[] arr)
    {
        int mid = 0;
        if(low < high)
        {
            mid = (low + high)/ 2;
            
            divide(low, mid, arr);
            divide(mid + 1, high, arr);
            conquer(low, mid, high, arr);
        }
    }

    public static void conquer(int low, int mid, int high, int[] arr)
    {
        //length of array
        int n = high - low + 1;
        //new array
        int[] merged = new int[n];

        int left = low;
        int right = mid +1;
        int mIdx = 0; // index from the new array that will be used to put the elements into the new array


        while(left <= mid && right <= high)
        {
            if(arr[left] <= arr[right])
            {
                merged[mIdx++] = arr[left++]; 
            }
            else{ merged[mIdx++] = arr[right++]; }
        }

        while(left <= mid)
        {
            merged[mIdx++] = arr[left++];
        }
        
        while(right <= high)
        {
            merged[mIdx++] = arr[right++];
        }

        for(int k = 0; k < n; k++)
        {
            arr[low+k] = merged[k];
        }
    }

    public static void main (String[] args)
    {
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
        divide(0, 9, arr);

        System.out.println("\nSorted Array:");
        for(int num: arr)
        {
            System.out.print(num + " ");
        }

    }
}
