package Algorithms;

import java.util.Random;

public class QuickSort {

    public static int sorting(int lowerBound, int upperBound, int[] arr)
    {
        int start = lowerBound;
        int end = upperBound;
        int pivot = arr[lowerBound];
        int temp = 0;
        while(start < end)
        {
            while(arr[start] <= pivot){start++;}
            while(arr[end] > pivot){end--;}
            //swapping
            if(start < end)
            {
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        //finally moving the pivot to it's original spot
        arr[lowerBound] = arr[end];
        arr[end] = pivot;

        return end;
    }

    public static void quickSort(int lowerBound, int upperBound, int[] arr)
    {
        if(lowerBound < upperBound)
        {
            //the end index from the previous method
            //this index finally contains the pivot in it's right spot
            int pivotIdx = sorting(lowerBound, upperBound, arr);

            quickSort(lowerBound, pivotIdx-1, arr);
            quickSort(pivotIdx+1, upperBound, arr);
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
        quickSort(0, arr.length-1, arr);

        System.out.println("\nSorted Array:");
        for(int num: arr)
        {
            System.out.print(num + " ");
        }
    }
}
