package Algorithms;

import java.util.Random;

/**
 * SelectionSort
 */
public class SelectionSort {
    public static void selectionSorting(int[] array)
    {
        int min = 0;
        for(int i = 0; i < array.length; i++)
        {
            min = i;
            for(int j = i+1; j < array.length; j++)
            {
                if(array[min] > array[j])
                {
                    min = j;
                }
            }
            if(min != i)
            {
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
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
        selectionSorting(arr);

        System.out.println("\nSorted Array:");
        for(int num: arr)
        {
            System.out.print(num + " ");
        }

    }
}