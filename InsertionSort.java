package Algorithms;

import java.util.Random;

public class InsertionSort {
    public static void insertionSorting(int[] array)
    {
        int key;
        int j;
        for(int i = 1; i < array.length; i++)
        {
            key = array[i];
            j = i - 1;

            while(j >= 0 && array[j] > key)
            {
                array[j+1] = array[j];
                j = j - 1;
            }

            array[j+1] = key;
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
        insertionSorting(arr);

        System.out.println("\nSorted Array:");
        for(int num: arr)
        {
            System.out.print(num + " ");
        }

    }
}
